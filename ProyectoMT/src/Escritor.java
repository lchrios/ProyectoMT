import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Escritor {

	public Escritor(String ruta, String[][] datos) {
		PrintWriter pr;
		ruta=ruta+"\\SalidaISR.csv";
		try {
			pr = new PrintWriter(new FileWriter(ruta));
			pr.println("Nombre,RFC,Sueldo mensual,Ingreso anual,Aguinaldo,Aguinaldo exento,Aguinaldo gravado,Prima vacacional,Prima vacacional excenta,Prima vacacional gravada,Total ingresos gravan,Medicos y hospitales,Gastos funerarios,SGMM,Hipotecarios,Donativos,Subcuenta retiro,Transporte escolar,Nivel educativo,Maximo a deducir colegiatura,Colegiatura pagada,Total deducciones (sin retiro),Deduccion permitida 10%,Monto ISR,Cuota fija,Porcentaje excedente,Pago excedente,Total a pagar");
			for(int i=0;i<datos.length;i++) {
				for(int j=0;j<datos[i].length;j++) {
					pr.println(datos[i][j]+",");
				}
			}
			pr.close();
			JOptionPane.showMessageDialog(null, "Archivo escrito exitosamente.\nPuede encontrar el archivo en:"+ruta);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Problema durante el proceso de escritura.");
		}
	}
}
