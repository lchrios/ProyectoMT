
public class Persona {
		double impuesto, porcentajeExcedente, aguinaldoExcento, aguinaldoGravado,sueldoAnual, primaExcenta, primaGravada, totalIngresos, coutaFija;
		//AGREGAR VARIABLE EXCEDENTE
		public Persona() {
			this.impuesto = this.porcentajeExcedente = this.aguinaldoExcento = this.aguinaldoGravado = this.sueldoAnual = this.primaExcenta = this.primaGravada = this.totalIngresos = this.coutaFija=0.0;
		}

		//Calcula el totl de ingresos y verifica en qué estrato queda la persona en cuestión
		public void Calcula(String[] datos, double deduccion) {
			int a = Integer.parseInt(datos[2]);
			double sueldo = a;
			a = Integer.parseInt(datos[3]);
			double aguinaldo = a;
			a = Integer.parseInt(datos[4]);
			double prima = a;
			this.sueldoAnual = sueldo*12;
			this.aguinaldoExcento = sueldo/2;
			this.aguinaldoGravado = aguinaldo - aguinaldoExcento;
			this.primaExcenta = 1209;
			this.primaGravada = prima - primaExcenta;
			this.totalIngresos = sueldoAnual + aguinaldo + prima - aguinaldoGravado - primaGravada - deduccion;
			double impuestos = 0;
			if (0.01<=this.totalIngresos && this.totalIngresos>=5952.84) {
				double excedente = this.totalIngresos - 0.01;
				impuestos = excedente*0.0192;
				this.porcentajeExcedente = 0.0192*100;
				this.coutaFija = 0;
			} else if(5952.85<=this.totalIngresos && this.totalIngresos>=50524.92){
				double excedente = this.totalIngresos - 5952.85;
				impuestos = 114.29 + excedente*0.0640;
				this.porcentajeExcedente = 0.0640*100;
				this.coutaFija = 114.29;
			} else if(50524.93<=this.totalIngresos && this.totalIngresos>=88793.04){
				double excedente = this.totalIngresos - 50524.93;
				impuestos = 2966.91 + excedente*0.1088;
				this.porcentajeExcedente = 0.1088*100;
				this.coutaFija = 2966.91;
			} else if(88793.05<=this.totalIngresos && this.totalIngresos>=103218.00){
				double excedente = this.totalIngresos - 88793.05;
				impuestos = 7130.48 + excedente*0.1600;
				this.porcentajeExcedente = 0.1600*100;
				this.coutaFija = 7130.48;
			} else if(103218.01<=this.totalIngresos && this.totalIngresos>=123580.20){
				double excedente = this.totalIngresos - 103218.01;
				impuestos = 9438.47 + excedente*0.1792;
				this.porcentajeExcedente = 0.1792*100;
				this.coutaFija = 9438.47;
			} else if(123580.21<=this.totalIngresos && this.totalIngresos>=249243.48){
				double excedente = this.totalIngresos - 123580.21;
				impuestos = 13087.37 + excedente*0.2136;
				this.porcentajeExcedente = 0.2136*100;
				this.coutaFija = 13087.37;
			} else if(249243.49<=this.totalIngresos && this.totalIngresos>=392841.96){
				double excedente = this.totalIngresos - 249243.49;
				impuestos = 39929.05 + excedente*0.2352;
				this.porcentajeExcedente = 0.2352*100;
				this.coutaFija = 39929.05;
			} else if(392814.97<=this.totalIngresos && this.totalIngresos>=750000.00){
				double excedente = this.totalIngresos - 392814.97;
				impuestos = 73703.41 + excedente*0.30;
				this.porcentajeExcedente = 0.3000*100;
				this.coutaFija = 73703.41;
			} else if(750000.01<=this.totalIngresos && this.totalIngresos>=1000000){
				double excedente = this.totalIngresos - 750000.01;
				impuestos = 180850.82 + excedente*0.32;
				this.porcentajeExcedente = 0.3200*100;
				this.coutaFija = 180850.82;
			} else if(1000000.01<=this.totalIngresos && this.totalIngresos>=3000000){
				double excedente = this.totalIngresos - 1000000.01;
				impuestos = 260850.81 + excedente*0.34;
				this.porcentajeExcedente = 0.3400*100;
				this.coutaFija = 260850.81;
			} else if(3000000.01<=this.totalIngresos){
				double excedente = this.totalIngresos - 3000000.01;
				impuestos = 940850.81 + excedente*0.35;
				this.porcentajeExcedente = 0.3500*100;
				this.coutaFija = 940850.81;
			}
		}
		
		public double GetImpuesto(){
			return this.impuesto;
		}
		
		public double GetPE(){
			return this.porcentajeExcedente;
		}
		
		public double GetAE(){
			return this.aguinaldoExcento;
		}
		
		public double GetAG(){
			return this.aguinaldoGravado;
		}
		
		public double GetSA(){
			return this.sueldoAnual;
		}
		
		public double GetPrE(){
			return this.primaExcenta;
		}
		
		public double GetPG(){
			return this.primaGravada;
		}
		
		public double GetTI(){
			return this.totalIngresos;
		}
		
		public double GetCJ(){
			return this.coutaFija;
		}
	}
