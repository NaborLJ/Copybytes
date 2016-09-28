
package copybytestexto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class Copybytestexto {

    
    public static void main(String[] args) throws IOException {
       File texto1 = new File ("/home/oracle/NetBeansProjects/copybytestexto/texto1.txt");
       File texto2 = new File ("/home/oracle/NetBeansProjects/copybytestexto/texto2.txt");
       //Creamos el fichero texto2.
       texto2.createNewFile();
       
       //Asignamos los fujos a los respectivos textos. En este caso input al texto1 y output al texto2.
       InputStream in = new FileInputStream(texto1);
       OutputStream out = new FileOutputStream(texto2,true);
       
       //guardamos en una variable auxiliar la información leida del texto1 mediante el metodo read();
       //escribimos en texto2 lo guardado en la variable aux
       int aux;
       while((aux=in.read())!=-1){
       
          out.write(aux);
               
       }
       in.close();
       out.close();
    }
    
}
