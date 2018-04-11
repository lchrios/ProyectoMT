import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Escritor {

	public Escritor(String Ubicacion,String Nombre,String RFC,double SueldoMensual,double IngresoAnual, double Aguinaldo, double AguinaldoExcento, double AguinaldoGravado, double Prima, double PrimaExcenta, double PrimaGravada, double TotalIngresos, double Medicos, double Funerarios, double SGMM, double Hipoteca, double Retiro, double TransporteEscolar, String Educacion, double MaxColegiatura, double Colegiatura, double TotalSinRetiro, double DeduccionPermitida, double ISR, double CoutaFija, double PorcentajeAplicado, double PagoExcedente, double TotalAPagar) {
		String linea;
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(Ubicacion));
			linea = Nombre + "," + RFC + "," + String.valueOf(SueldoMensual) + "," + String.valueOf(IngresoAnual) + "," + String.valueOf(Aguinaldo) + "," + String.valueOf(AguinaldoExcento) + "," + String.valueOf(AguinaldoGravado) + "," + String.valueOf(Prima) + "," + String.valueOf(PrimaExcenta) + "," + String.valueOf(PrimaGravada) + "," + String.valueOf(TotalIngresos) + "," + String.valueOf(Medicos) + "," + String.valueOf(Funerarios) + "," + String.valueOf(SGMM) + "," + String.valueOf(Hipoteca) + "," + String.valueOf(Retiro) + "," + String.valueOf(TransporteEscolar) + "," + String.valueOf(Educacion) + "," + String.valueOf(MaxColegiatura) + "," + String.valueOf(Colegiatura) + "," + String.valueOf(TotalSinRetiro) + "," + String.valueOf(DeduccionPermitida) + "," + String.valueOf(ISR) + "," + String.valueOf(CoutaFija) + "," + String.valueOf(PorcentajeAplicado) + "," + String.valueOf(PagoExcedente) + "," + String.valueOf(TotalAPagar);
		} catch (IOException e){
			JOptionPane.showMessageDialog(null, "Problema durante la escritura del archivo");
		}
	}
}
