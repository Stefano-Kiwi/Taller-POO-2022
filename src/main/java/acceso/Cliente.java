package acceso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author stefa
 */
public class Cliente {
    public static void main(String[] args) {
        try{
        final String regex1 = "^(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$";
        
        
        
        File archivo = new File("recursos/ListadoDeObras.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        
        Pattern pattern = Pattern.compile(regex1);
            String linea;

            linea = br.readLine();
            
            Matcher matcher;
        
         while ((linea = br.readLine()) != null) {
             matcher = pattern.matcher(linea);
             if(matcher.matches()){
                 System.out.println("MATCHEA");
             }
             System.out.println(matcher.group(1)+"\n");
             System.out.println(matcher.group(2)+"\n");
             System.out.println(matcher.group(3)+"\n");
             System.out.println(matcher.group(4)+"\n");
             System.out.println(matcher.group(5)+"\n");
             System.out.println(matcher.group(6)+"\n");
             System.out.println(matcher.group(7)+"\n");
             System.out.println(matcher.group(8)+"\n");
             System.out.println(matcher.group(9)+"\n");
             System.out.println(matcher.group(10)+"\n");
             System.out.println(matcher.group(11)+"\n");
             System.out.println(matcher.group(12)+"\n");
             System.out.println(matcher.group(13)+"\n");
             System.out.println(matcher.group(14)+"\n");
             System.out.println(matcher.group(15)+"\n");
             System.out.println(matcher.group(16)+"\n");
             System.out.println(matcher.group(17)+"\n");
             System.out.println(matcher.group(18)+"\n");
             System.out.println(matcher.group(19)+"\n");
             System.out.println(matcher.group(20)+"\n");
             
         }
            
            
            
            
        
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
