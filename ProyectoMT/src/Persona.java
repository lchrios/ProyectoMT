
public class Persona {
		double impuesto;		
		
		public Persona() {
			this(0.0);
		}
		
		public Persona(double impuesto) {
			this.impuesto = impuesto;
		}
		
		public double Calcula(double sueldo, double deduccion, double aguinaldo,double prima) {
			double sueldoAnual = sueldo*12;
			double aguinaldoNoGrabado = sueldo/2;
			double primaNoGrabado = 1209;
			double total = sueldoAnual + aguinaldo + prima - aguinaldoNoGrabado - primaNoGrabado - deduccion;
			double impuestos = 0;
			if (0.01<=total && total>=5952.84) {
				double excedente = total - 0.01;
				impuestos = excedente*0.0192;
			} else if(5952.85<=total && total>=50524.92){
				double excedente = total - 5952.85;
				impuestos = 114.29 + excedente*0.0640;
			} else if(50524.93<=total && total>=88793.04){
				double excedente = total - 50524.93;
				impuestos = 2966.91 + excedente*0.1088;
			} else if(88793.05<=total && total>=103218.00){
				double excedente = total - 88793.05;
				impuestos = 7130.48 + excedente*0.1600;
			} else if(103218.01<=total && total>=123580.20){
				double excedente = total - 103218.01;
				impuestos = 9438.47 + excedente*0.1792;
			} else if(123580.21<=total && total>=249243.48){
				double excedente = total - 123580.21;
				impuestos = 13087.37 + excedente*0.2136;
			} else if(249243.49<=total && total>=392841.96){
				double excedente = total - 249243.49;
				impuestos = 39929.05 + excedente*0.2352;
			} else if(392814.97<=total && total>=750000.00){
				double excedente = total - 392814.97;
				impuestos = 73703.41 + excedente*0.30;
			} else if(750000.01<=total && total>=1000000){
				double excedente = total - 750000.01;
				impuestos = 180850.82 + excedente*0.32;
			} else if(1000000.01<=total && total>=3000000){
				double excedente = total - 1000000.01;
				impuestos = 260850.81 + excedente*0.34;
			} else if(3000000.01<=total){
				double excedente = total - 3000000.01;
				impuestos = 940850.81 + excedente*0.35;
			}
			return impuestos;
		}
	}
