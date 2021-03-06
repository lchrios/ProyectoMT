import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Lector {
	int lineas;
	String[][] datos;

	
	public Lector(String ubicacion){
		String linea;
		try {
			BufferedReader br = new BufferedReader(new FileReader(ubicacion));
			while ((linea=br.readLine())!=null) {
				this.lineas +=1;
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Archivo no encontrado, posible error en la ubiaci�n.");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Problema durante el proceso de lectura.");
		}
			
	}
	//Inicia el objeto contando las lineas del archivo
	
	public void leer(String ubicacion) {
		String linea,
			   celda;
		StringTokenizer st;
		this.datos = new String[this.lineas][14];
		try {
			BufferedReader br2 = new BufferedReader(new FileReader(ubicacion));
			while ((linea=br2.readLine())!=null) {
				st = new StringTokenizer(linea,",");
				for(int i = 0;i<this.datos.length;i++) {
					for(int j = 0;j<this.datos[i].length;j++) {
						celda = st.nextToken();
						if(j==12) {
							celda=celda.toLowerCase();
						}
						this.datos[i][j] = celda;
					}
				}
			br2.close();
			}
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Archivo no encontrado, posible error en la ubiaci�n.");
		} catch (IOException e) {
			
		}
	}
	
	public String[][] getDatos(){
		return this.datos;
	}
}