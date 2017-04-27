import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Eje1_fichero {

	public static void main(String[] args) throws IOException {
		
		String ruta = "F:\\DAM\\PROGRAMACION\\eva3\\Ejercicio_de_ficheros_de_texto";
		
		File archivo = new File(ruta, "cancion.txt");
		
		System.out.println();
		
		System.out.println("Existencia :");
		System.out.println("El archivo : "+archivo.exists());
		System.out.println("El directorio es : "+archivo.exists());
		/** 
		JOptionPane.showMessageDialog(null, "Existencia :");
		JOptionPane.showMessageDialog(null, "El archivo : "+archivo.exists());
		JOptionPane.showMessageDialog(null, "El directorio es : "+archivo.exists());
		*/
		
		FileReader Salida = new FileReader(archivo);
		
		BufferedReader br = new BufferedReader(Salida);
		
		System.out.println("Leyendo archivo :");
		
		String s = br.readLine();
		
		int num = 0;
		while (s != null){
		
			System.out.println( num+"-->"+s);
			s = br.readLine();
			num++;
		}
		
		br.close();
		
		System.out.println("Fichero Leido");
			
	}

}
