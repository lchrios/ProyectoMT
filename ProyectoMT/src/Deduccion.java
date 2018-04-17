public class Deduccion {
 
 double deduccion,colegiaturaFinal, limiteDeduccion, deduccionSinRetiro, limCol; 

  public Deduccion() {
   this.deduccion = this.colegiaturaFinal = 0;
  }
  
  
  public void calcularDeduccion(double ingresos,double honorariosMedicos, double gastosFunerarios, double primaMedica, double gastosHipotecarios, double donativos, double retiro ,double transporteEscolar, double colegiatura, String escolaridad) {
   this.limiteDeduccion = ingresos*.10; 
   System.out.println(colegiatura);
   double deduccionDeImpuestos; 
   this.checaEscolaridad(escolaridad, colegiatura);
   System.out.println(escolaridad);
   deduccionDeImpuestos = gastosFunerarios + primaMedica + gastosHipotecarios + donativos + transporteEscolar;
   deduccionSinRetiro=deduccionDeImpuestos;
   if (deduccionDeImpuestos > this.limiteDeduccion) {
    deduccionDeImpuestos = this.limiteDeduccion;
   }
   if (retiro > this.limiteDeduccion) {
    retiro = this.limiteDeduccion;
   }
   deduccionDeImpuestos += retiro; //Le suma a la deduccion el retiro ya que puede deducir en total un 20%
   this.deduccion = deduccionDeImpuestos;
  }
  
  public void checaEscolaridad(String escolaridad, double colegiatura) {
	  if (escolaridad.equals("preescolar")) {
	      if(colegiatura>=14200.0) {
		      this.colegiaturaFinal = 14200;
		      this.limCol=14200.0;
		  } else {
		      this.limCol=14200.0;
		      this.colegiaturaFinal=colegiatura;
		  }
	 }
    if (escolaridad.equals("primaria")) {
	     if(colegiatura>=12900.0) {
	         this.colegiaturaFinal = 12900.0 ;
	         this.limCol=12900.0;
	     } else {
	         this.limCol=12900.0;
	         this.colegiaturaFinal=colegiatura;
	     }
	 }
	if (escolaridad.equals("secundaria")) {
	     if (colegiatura>=19900.0) {
	         this.colegiaturaFinal = 19900.0;
	         this.limCol=19900.0;  
	     } else {
	         this.limCol=1900.0;
	         this.colegiaturaFinal=colegiatura;
	     }
   	}    
	   if (escolaridad.equals("profesional tecnico")) {
	    if(colegiatura>=17100.0) {
	     this.colegiaturaFinal = 17100.0;
	     this.limCol=17100.0;
	    } else {
	        this.limCol=17100.0;
	        this.colegiaturaFinal=colegiatura;
	    }
	   }
	   if (escolaridad.equals("preparatoria")) {
	       if (colegiatura>24500.0) {
	       this.colegiaturaFinal = 24500.0;
	       this.limCol=24500.0;
	   } else {
		   this.limCol=24500.0;
	       this.colegiaturaFinal=colegiatura;
	   }
	   this.deduccion+=colegiaturaFinal;
	   }
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
  
  public double GetLC() {
   return this.limCol;
  }
 }
