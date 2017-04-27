import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;






public class eje2_crear_Fichero {

	public static void main(String[] args) throws IOException {
		
		//String ruta = "F:\\DAM\\PROGRAMACION\\eva3\\Ejercicio_de_ficheros_de_texto";
		String ruta = "C:\\Users\\dam1\\workspace\\Ficheros1\\Ejercicio_de_ficheros_de_texto\\miArchivo.txt";
		String nombreArchivo = JOptionPane.showInputDialog("INtroduzca el nombre del archivo");
		
		try{
			File archivo = new File(ruta);
			archivo.createNewFile();
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
			
		bw.write("Estoy escribiendo la primera linea");
		bw.newLine();
		bw.write("Esta ese mi segunda linea de mi archivo creado en java");
		// Con Fush se guarda los cambios del archivo.
		bw.flush();
		bw.close();
		String s = br.readLine();
		while(s != null){
				System.out.println(s);
				s = br.readLine();
			}
		br.close();
		}catch(IOException e){
			System.out.println("Error S/E: "+e);
		}
		
		
			
		
		
	}

}
