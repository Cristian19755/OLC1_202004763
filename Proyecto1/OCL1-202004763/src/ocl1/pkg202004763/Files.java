/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ocl1.pkg202004763;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Latitude E5450
 */
public class Files {
    public static void guardar(String nombre, String ruta, String texto) throws IOException{
        try {
            ruta += "/"+nombre+".olc"; 
            File file = new File(ruta);
            file.createNewFile();            
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(texto);
            bw.close();
            System.out.println(texto);
            }
        catch (IOException e) {
        }
    }
}
