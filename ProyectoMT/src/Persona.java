
public class Persona {
	private String nombre,
				   RFC;
	private int nivelEdu;
	private double sueldoMes,
				   aguinaldo,
				   primaVaca,
				   dMediHosp,
				   dGastFune,
				   seguroGMM,
				   crediHipo,
				   donativos,
				   aporAfore,
				   transEsco,
				   ctraTotal;

	public Persona(String nombre, String RFC, int nivelEdu, double sueldoMes, double aguinaldo,
				   double primaVaca, double dMediHosp, double dGastFune, double seguroGMM,
				   double crediHipo, double donativos, double aporAfore, double transEsco, double ctraTotal) {
		this.setNombre(nombre);
		this.setRFC(RFC);
		this.setNivEdu(nivelEdu);
		this.setSueldoMes(sueldoMes);
		this.setAguinaldo(aguinaldo);
		this.setPrimaVaca(primaVaca);
		this.setDMediHops(dMediHosp);
		this.setDGastFune(dGastFune);
		this.setSeguroGMM(seguroGMM);
		this.setCrediHipo(crediHipo);
		this.setDonativos(donativos);
		this.setAporAfore(aporAfore);
		this.setTransEsco(transEsco);
		this.setCtraTotal(ctraTotal);
	}
	
	public Persona() {
		this("","",0,0,0,0,0,0,0,0,0,0,0,0);
	}

	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setRFC(String RFC) {
		this.RFC=RFC;
	}
	
	public void setNivEdu(int nivelEdu) {
		this.nivelEdu=nivelEdu;
	}
	
	public void setSueldoMes(double sueldoMes) {
		this.sueldoMes=sueldoMes;
	}
	
	public void setAguinaldo(double aguinaldo) {
		this.aguinaldo=aguinaldo;
	}
	
	public void setPrimaVaca(double primaVaca) {
		this.primaVaca=primaVaca;
	}
	
	public void setDMediHops(double dMediHosp) {
		this.dMediHosp=dMediHosp;
	}
	
	public void setDGastFune(double dGastFune) {
		this.dGastFune=dGastFune;
	}
	
	public void setSeguroGMM(double seguroGMM) {
		this.seguroGMM=seguroGMM;
	}
	
	public void setCrediHipo(double crediHipo) {
		this.crediHipo=crediHipo;
	}
	
	public void setDonativos(double donativos) {
		this.donativos=donativos;
	}
	
	public void setAporAfore(double aporAfore) {
		this.aporAfore=aporAfore;
	}
	
	public void setTransEsco(double transEsco) {
		this.transEsco=transEsco;
	}
	
	public void setCtraTotal(double ctraTotal) {
		this.ctraTotal=ctraTotal;
	}	
}
