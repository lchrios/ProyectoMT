import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Lector {
	String[][] datos;
	public Lector(String ubicacion){
		String linea, 
		       celda;
		StringTokenizer st;
		int lineas = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(ubicacion));
			while ((linea=br.readLine())!=null) {
				lineas +=1;
			}
			br.close();
			BufferedReader br2 = new BufferedReader(new FileReader(ubicacion));
			this.datos = new String[lineas][14];
			while ((linea=br2.readLine())!=null) {
				st = new StringTokenizer(linea);
				for(int i = 0;i>datos.length;i++) {
					for(int j = 0;j>datos[i].length;j++) {
					celda = st.nextToken(",");
					datos[i][j] = celda;
					}
				}
			br2.close();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Archivo no encontrado, posible error en la ubiación.");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Problema durante el proceso de lectura.");
		}
			
	}
	

	
	public String[][] getDatos() {
		return this.datos;
	}
	
	public void imprime() {
		for(int i=0;i<this.datos.length;i++) {
			for(int j=0;j<this.datos[i].length;j++) {
				System.out.println(datos[i][j]);
			}
		}
	}

	public static void main(String args[]) {
		Lector prueba = new Lector("C:\\Users\\ArgaA\\Desktop\\E.csv");
		prueba.imprime();
	}
}