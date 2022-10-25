package inventario;

import io.nayuki.qrcodegen.QrCode;
import java.awt.image.BufferedImage;
import java.io.File;
import java.time.LocalDate;
import java.util.Objects;
import javax.imageio.ImageIO;

public class Ejemplar {

    private static int contadorEj = 0;  // Cuando se crea un nuevo ej aumenta
    private String idUnico;
    private String lugarFisico;
    private Obra obra;
    private Baja baja;
    private Adquisicion adquisicion;
    private String linkCodigoQR;
    private String observaciones;

    public Ejemplar(String lugarFisico, Obra obra, Adquisicion adquisicion) {
        this.contadorEj++;
        this.lugarFisico = lugarFisico;
        this.obra = obra;
        this.idUnico = lugarFisico + String.valueOf(contadorEj);
        this.adquisicion = adquisicion;
        this.linkCodigoQR = "recursos/codigosQR/" + idUnico + ".png";

    }

    public Ejemplar(String lugarFisico, Obra obra, Adquisicion adquisicion, Baja baja) {
        this.contadorEj++;
        this.lugarFisico = lugarFisico;
        this.obra = obra;
        this.idUnico = lugarFisico + String.valueOf(contadorEj);
        this.baja = baja;
        this.adquisicion = adquisicion;
        this.linkCodigoQR = "recursos/codigosQR/" + idUnico + ".png";
    }

    public Ejemplar(String lugarFisico, Obra obra, Adquisicion adquisicion, String idunico, Baja baja) {
        this.lugarFisico = lugarFisico;
        this.obra = obra;
        this.idUnico = idunico;
        this.baja = baja;
        this.adquisicion = adquisicion;
        this.linkCodigoQR = "recursos/codigosQR/" + idUnico + ".png";

    }

    public Ejemplar(String lugarFisico, Obra obra, Adquisicion adquisicion, String idunico) {
        this.lugarFisico = lugarFisico;
        this.obra = obra;
        this.adquisicion = adquisicion;
        this.idUnico = idunico;
        this.linkCodigoQR = "recursos/codigosQR/" + idUnico + ".png";
    }

    public Ejemplar() {
    }

    public void generarQR() throws Exception {
        try {
            File archivo = new File(linkCodigoQR);
            if (archivo.exists()) {
                //System.out.println("Ya existe su codigo QR");
            } else {
                QrCode qr0 = QrCode.encodeText(idUnico, QrCode.Ecc.MEDIUM);
                BufferedImage img = qr0.toImage(4, 10);
                ImageIO.write(img, "png", archivo);
                //System.out.println("Se imprimió el codigo QR del ejemplar: "+linkCodigoQR);
            }

        } catch (Exception e) {

        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.idUnico);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ejemplar other = (Ejemplar) obj;
        return Objects.equals(this.idUnico, other.idUnico);
    }

    public static int getContadorEj() {
        return contadorEj;
    }

    public static void setContadorEj(int contadorEj) {
        Ejemplar.contadorEj = contadorEj;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public Baja getBaja() {
        return baja;
    }

    public void setBaja(Baja baja) {
        this.baja = baja;
    }

    public Adquisicion getAdquisicion() {
        return adquisicion;
    }

    public void setAdquisicion(Adquisicion adquisicion) {
        this.adquisicion = adquisicion;
    }

    public String getLinkCodigoQR() {
        return linkCodigoQR;
    }

    public void setLinkCodigoQR(String linkCodigoQR) {
        this.linkCodigoQR = linkCodigoQR;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getIdUnico() {
        return idUnico;
    }

    public String getLugarFisico() {
        return lugarFisico;
    }

    @Override
    public String toString() {
        return "Ejemplar{" + "idUnico=" + idUnico + ", lugarFisico=" + lugarFisico + ", obra=" + obra + ", baja=" + baja + ", adquisicion=" + adquisicion + ", linkCodigoQR=" + linkCodigoQR + ", observaciones=" + observaciones + '}';
    }

    public String tablaGUI() {
        return obra.getTitulo() + "," + this.lugarFisico + "," + this.idUnico;
    }

    /**
     * Este método es utilizado para cargar los datos de los ejemplares a un bloc
     * de notas en el formato correspondiente que contiene a todos los ejemplares
     *
     * @return String
     */
    public String toCSV(int disponibilidad) {
        //disponibilidad =(1: disponible 2: prestado)
        LocalDate fAdquisicion = adquisicion.getFechaAdquisicion();
        int dia = fAdquisicion.getDayOfMonth();
        int mes = fAdquisicion.getMonthValue();
        int año = fAdquisicion.getYear();

        String DIA;
        String MES;
        if (dia < 10) {
            DIA = "0" + String.valueOf(dia);
        } else {
            DIA = String.valueOf(dia);
        }
        if (mes < 10) {
            MES = "0" + String.valueOf(mes);
        } else {
            MES = String.valueOf(mes);
        }
        String resultado = "";
        if (disponibilidad == 1 || disponibilidad == 2) {
            resultado = disponibilidad + "," + obra.getISBN() + "," + lugarFisico + "," + DIA + "/" + MES + "/" + año + "," + adquisicion.getFormaDeCompra() + "," + this.idUnico + "," + "no" + "," + ",";
        }
        return resultado;
    }

    /**
     * Este método se utiliza para modificar el documento donde se registran los
     * ejemplares respentando el formato de los ejemplares que se han dado de
     * baja.
     *
     * @return String
     */
    public String darDeBajaCSV() {

        LocalDate fAdquisicion = adquisicion.getFechaAdquisicion();
        int dia = fAdquisicion.getDayOfMonth();
        int mes = fAdquisicion.getMonthValue();
        int año = fAdquisicion.getYear();

        String DIA;
        String MES;
        if (dia < 10) {
            DIA = "0" + String.valueOf(dia);
        } else {
            DIA = String.valueOf(dia);
        }
        if (mes < 10) {
            MES = "0" + String.valueOf(mes);
        } else {
            MES = String.valueOf(mes);
        }
        String resultado = "";

        LocalDate fbaja = this.baja.getFechaDadoDeBaja();
        int diab = fbaja.getDayOfMonth();
        int mesb = fbaja.getMonthValue();
        int anioB = fbaja.getYear();

        String DIAB;
        String MESB;
        if (diab < 10) {
            DIAB = "0" + String.valueOf(diab);
        } else {
            DIAB = String.valueOf(diab);
        }
        if (mesb < 10) {
            MESB = "0" + String.valueOf(mesb);
        } else {
            MESB = String.valueOf(mesb);
        }
        return resultado = 3 + "," + obra.getISBN() + "," + lugarFisico + "," + DIA + "/" + MES + "/" + año + "," + adquisicion.getFormaDeCompra() + "," + this.idUnico + "," + "si" + "," + DIAB + "/" + MESB + "/" + anioB + "," + baja.getMotivoBaja();

    }
}
