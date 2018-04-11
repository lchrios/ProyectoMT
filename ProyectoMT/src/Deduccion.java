
public class Deduccion {
	
double deduccion,colegiaturaFinal, limiteDeduccion, deduccionSinRetiro; 

	public Deduccion() {
		this.deduccion = this.colegiaturaFinal = 0;
	}
	
	
	public void calcularDeduccion(double ingresos,double honorariosMedicos, double gastosFunerarios, double primaMedica, double gastosHipotecarios, double donativos, double retiro ,double transporteEscolar, double colegiatura, String escolaridad) {
		this.limiteDeduccion = ingresos*.10; 
		double deduccionDeImpuestos; 
		if (escolaridad == "preescolar" && colegiatura>14200) {
			this.colegiaturaFinal = 14200;
		}
		else if (escolaridad == "primaria" && colegiatura>12900) {
			this.colegiaturaFinal = 12900;
		}
		else if (escolaridad == "secundaria" && colegiatura>19900) {
			this.colegiaturaFinal = 19900;
		}
		else if (escolaridad == "profesional tecnico" && colegiatura>17100) {
			this.colegiaturaFinal = 17100;
		}
		else if (escolaridad == "bachillerato" && colegiatura>24500) {
			this.colegiaturaFinal = 24500;
		} else {
			this.colegiaturaFinal = colegiatura;
		}
		deduccionDeImpuestos = gastosFunerarios + primaMedica + gastosHipotecarios + donativos + transporteEscolar + this.colegiaturaFinal;
		if (deduccionDeImpuestos > this.limiteDeduccion) {
			deduccionDeImpuestos = this.limiteDeduccion;
		}
		if (retiro > this.limiteDeduccion) {
			retiro = this.limiteDeduccion;
		}
		deduccionDeImpuestos += retiro; //Le suma a la deduccion el retiro ya que puede deducir en total un 20%
		this.deduccion = deduccionDeImpuestos;
	}
	
	public double GetD() {
		return this.deduccion;
	}
	
	public double GetCF() {
		return this.colegiaturaFinal;
	}
	
	public double GetLD() {
		return this.limiteDeduccion;
	}
	
	public double GetDS() {
		return this.deduccionSinRetiro;
	}
}
