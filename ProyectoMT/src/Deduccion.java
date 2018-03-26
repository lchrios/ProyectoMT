public class Deduccion {
	
double deduccion; //Variable de la deduccion del impuesto, lo maneje asi para que no se complique la cosa
	
	public Deduccion() {
		this(0.0);
	}
	
	public Deduccion(double deduccion) {
		this.deduccion=deduccion;
	}
	
	//Este es el metodo encargado de hacer todos los calculos ya que le demos las variable, lo malo es que entran un monton de variables
	public double calcularDeduccion(double cuotaFija, double ingresos,double honorariosMedicos, double gastosFunerarios, double primaMedica, double gastosHipotecarios, double donativos, double retiro ,double transporteEscolar, double colegiatura, String escolaridad) {
		double limite = ingresos*.10; //Agregue el limite de la deduccion para ya tener lo del 10% del salario
		double deduccionDeImpuestos; //Esta es la variable para ir sumando y restando todo
		//Este bloque if checa la escolaridad y checa lo que se deducira de impuestos, la variable tipo String debe de estar en minusculas
		if (escolaridad == "preescolar" && colegiatura>14200) {
			colegiatura = 14200;
		}
		else if (escolaridad == "primaria" && colegiatura>12900) {
			colegiatura = 12900;
		}
		else if (escolaridad == "secundaria" && colegiatura>19900) {
			colegiatura = 19900;
		}
		else if (escolaridad == "profesional tecnico" && colegiatura>17100) {
			colegiatura = 17100;
		}
		else if (escolaridad == "bachillerato" && colegiatura>24500) {
			colegiatura = 24500;
		}
		deduccionDeImpuestos = gastosFunerarios + primaMedica + gastosHipotecarios + donativos + transporteEscolar + colegiatura;//Aqui se hace la primera suma para encontrar todos sus gastos
		//Este bloque if checa los valores de la deduccion y el dinero que aporto a su retiro y checa si esta dentro del limite para deducir, en caso de pasarlo el valor lo convierte en el limite
		if (deduccionDeImpuestos > limite) {
			deduccionDeImpuestos = limite;
		}
		if (retiro > limite) {
			retiro = limite;
		}
		deduccionDeImpuestos += retiro; //Le suma a la deduccion el retiro ya que puede deducir en total un 20%
		deduccionDeImpuestos = cuotaFija - deduccionDeImpuestos; //Calculo final donde se deducen los impuestos y dice que se cobra de impuesto
		return deduccionDeImpuestos;
	}

}
