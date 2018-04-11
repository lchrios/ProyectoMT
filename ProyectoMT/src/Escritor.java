import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Escritor {
//Nombre, RFC, Mensual, IngresoAnual, Aguinaldo, AguinaldoExcento, AguinaldoGravado, Prima, PrimaExcenta, PrimaGravada, TotalIngresos, Medicos, Funerarios, SGMM, Hipoteca, Retiro, TransporteEscolar, Educacion, MaxColegiatura, Colegiatura, TotalSinRetiro, DeduccionPermitida, ISR, CuotaFija, PorcentajeAplicado, TotalExcedente, TotalAPagar
	public Escritor(String Ubicacion, String[][] datos) {
		String linea;
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(Ubicacion));
			pw.println("Nombre,RFC,Sueldo mensual,Ingreso anual,Aguinaldo,Aguinaldo exento,Aguinaldo gravado,Prima vacacional,Prima vacacional excenta,Prima vacacional gravada,Total ingresos gravan,Medicos y hospitales,Gastos funerarios,SGMM,Hipotecarios,Donativos,Subcuenta retiro,Transporte escolar,Nivel educativo,Maximo a deducir colegiatura,Colegiatura pagada,Total deducciones (sin retiro),Deduccion permitida 10%,Monto ISR,Cuota fija,Porcentaje excedente,Pago excedente,Total a pagar");
			for(int i=0;i<datos.length;i++) {
				for(int j=0;j<datos[i].length;j++) {
					pw.print(datos[i][j]+",");
				}
				pw.println("");
			}
		} catch (IOException e){
			JOptionPane.showMessageDialog(null, "Problema durante la escritura del archivo");
		}
	}
}
