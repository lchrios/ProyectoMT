import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class PanelControles extends JPanel implements MouseListener, ActionListener, Runnable {

	//TextFields
	private JTextField tfNombre,
					  tfIngresosMensuales,
					  tfPrimaVac,
					  tfAguinaldo,
					  tfGastosMedHos,
					  tfGastosFun,
					  tfPrimasSegurosGMM,
					  tfCredHipo,
					  tfDonativos,
					  tfAfore,
					  tfTransEsc,
					  tfColegiaturas;
	
	//Labels
	private JLabel lbDatosGen,
					  lbNombre,
				  lbIngresos,
				  	  lbIngresosMensuales,
				  lbPrestaAdic,
					  lbPrimaVac,
					  	  lbExpPV,
					  lbAguinaldo,
					  	  lbExpAg,
				  lbDeducciones,
				  	  lbGastosMedHos,
				  	  lbGastosFun,
				  	  lbPrimasSegGMM,
				  	  lbCredHipo,
				  	  lbDonativos,
				  	  lbAfore,
				  	  	  lbExpAf,
				  	  lbTransEsc,
				  	  lbNivelCol,
				  	  lbColegiaturas,
				  	  lbExpVacio,
				  	  lbBL1,
				  	  lbBL2,
				  	  lbBL3,
				  	  lbCL1,
				  	  lbCL2,
				  	  lbCL3,
				  	  lbCL4,
				  	  lbCL5,
				  	  lbCL6,
				  	  lbCL7;
	
	//Botones
	private JButton btCalcular,
				   btReiniciar;
	
	//RadioButton
	private JRadioButton rbPreescolar,
					     rbPrimaria,
					     rbSecundaria,
					     rbPreparatoria,
					     rbProfesionalTec;
	
	//ButtonGroup
	ButtonGroup bg;

	//Separador de Linea
	public static final String NL = System.getProperty("line.separator"); 
	
	//Constructor
	public PanelControles() {
		super();
		this.setPreferredSize(new Dimension(400, 780));
		
		//Creación de objetos
			//Labels
		this.lbDatosGen=new JLabel("Datos Generales");
		this.lbNombre=new JLabel("                             Nombre:");
		this.lbIngresos=new JLabel("                                                  Ingresos                                          ");
		this.lbIngresosMensuales=new JLabel("                              Sueldo Mensual:");
		this.lbPrestaAdic=new JLabel("                                 Prestaciones adicionales                        ");
		this.lbPrimaVac=new JLabel("                           Prima vacacional*:");
		this.lbExpPV=new JLabel("**Exento hasta 15 días del salario mínimo o sea $1209.");
		this.lbAguinaldo=new JLabel("                                      Aguinaldo**:");
		this.lbExpAg=new JLabel("*Hasta 15 días exentos de impuestos o sea una quincena.");
		this.lbDeducciones=new JLabel("                                              Deducciones                                      ");
		this.lbGastosMedHos=new JLabel("Honorarios médicos y gastos hospitalarios:");
		this.lbGastosFun=new JLabel("                                           Gastos funerarios:");
		this.lbPrimasSegGMM=new JLabel("      Primas por seguros de gastos médicos:");
		this.lbCredHipo=new JLabel("                                    Créditos hipotecarios:");
		this.lbDonativos=new JLabel("                                                         Donativos:");
		this.lbAfore=new JLabel("                 Aportaciones subcuenta retiro***:");
		this.lbExpAf=new JLabel("***Hasta un 10% de los ingresos. Es una cuenta aparte.");
		this.lbTransEsc=new JLabel("                                         Transporte escolar:");
		this.lbColegiaturas= new JLabel("                                     Colegiaturas pagadas:");
		this.lbNivelCol=new JLabel("                                       Nivel educativo:                                   "	);
		this.lbExpAf=new JLabel("*Hasta un 10% de los ingresos.");
		this.lbExpAg=new JLabel("**Hasta 15 días excentos de impuestos o sea una quincena.");
		this.lbExpPV=new JLabel("***Excento hasta 15 días del salario mínimo.");
		this.lbExpVacio=new JLabel("TODO CAMPO QUE QUEDE VACÍO SERÁ INTERPRETADO COMO 0");
		this.lbBL1=new JLabel("---------------------------------------------------------------------------------------");
		this.lbBL2=new JLabel("---------------------------------------------------------------------------------------");
		this.lbBL3=new JLabel("---------------------------------------------------------------------------------------");
		this.lbCL1=new JLabel("                                                                                                ");
		this.lbCL2=new JLabel("                                                                                                ");
		this.lbCL3=new JLabel("                                                                                                ");
		this.lbCL4=new JLabel("                                                                                                ");
		this.lbCL5=new JLabel("                                                                                                ");
		this.lbCL6=new JLabel("                                                                                                ");
		this.lbCL7=new JLabel("                                                                                                ");
			//TextFields
		this.tfNombre=new JTextField(20);
		this.tfIngresosMensuales=new JTextField(15);
		this.tfPrimaVac=new JTextField(15);
		this.tfAguinaldo=new JTextField(15);
		this.tfGastosMedHos=new JTextField(10);
		this.tfGastosFun=new JTextField(10);
		this.tfPrimasSegurosGMM=new JTextField(10);
		this.tfCredHipo=new JTextField(10);
		this.tfDonativos=new JTextField(10);
		this.tfAfore=new JTextField(10);
		this.tfTransEsc=new JTextField(10);
		this.tfColegiaturas=new JTextField(10);
		
			//Botones
		this.btCalcular=new JButton("Calcular");
		this.btReiniciar=new JButton("Reiniciar");
		
		
			//RadioButtons
		this.rbPreescolar=new JRadioButton("Preescolar");
		this.rbPrimaria=new JRadioButton("Primaria");
		this.rbSecundaria=new JRadioButton("Secundaria");
		this.rbPreparatoria=new JRadioButton("Bachillerato");
		this.rbProfesionalTec=new JRadioButton("Profesional Técnico");
		bg=new ButtonGroup();
		this.bg.add(rbPreescolar);
		this.bg.add(rbPrimaria);
		this.bg.add(rbSecundaria);
		this.bg.add(rbPreparatoria);
		this.bg.add(rbProfesionalTec);
		
		
		//Adición de objetos al entorno gráfico
		this.add(this.lbBL1);
		this.add(this.lbDatosGen);
		this.add(this.lbCL1);
		this.add(this.lbNombre);
		this.add(this.tfNombre);
		this.add(this.lbBL2);
		this.add(this.lbIngresos);
		this.add(this.lbCL2);
		this.add(this.lbIngresosMensuales);
		this.add(this.tfIngresosMensuales);
		this.add(this.lbPrestaAdic);
		this.add(this.lbCL6);
		this.add(this.lbPrimaVac);
		this.add(this.tfPrimaVac);
		this.add(this.lbAguinaldo);
		this.add(this.tfAguinaldo);
		this.add(this.lbBL3);
		this.add(this.lbDeducciones);
		this.add(this.lbCL3);
		this.add(this.lbGastosMedHos);
		this.add(this.tfGastosMedHos);
		this.add(this.lbGastosFun);
		this.add(this.tfGastosFun);
		this.add(this.lbPrimasSegGMM);
		this.add(this.tfPrimasSegurosGMM);
		this.add(this.lbCredHipo);
		this.add(this.tfCredHipo);
		this.add(this.lbDonativos);
		this.add(this.tfDonativos);
		this.add(this.lbAfore);
		this.add(this.tfAfore);
		this.add(this.lbColegiaturas);
		this.add(this.tfColegiaturas);
		this.add(this.lbTransEsc);
		this.add(this.tfTransEsc);
		this.add(this.lbCL4);
		this.add(this.lbNivelCol);
		this.add(this.rbPreescolar);
		this.add(this.rbPrimaria);
		this.add(this.rbSecundaria);
		this.add(this.rbPreparatoria);
		this.add(this.rbProfesionalTec);
		
		//Configuración de los botones "calcular" y "reiniciar"
		this.btCalcular.setPreferredSize(new Dimension(120, 40));
		this.btReiniciar.setPreferredSize(new Dimension(120, 40));
		this.add(this.lbCL5);
		this.add(this.btCalcular);
		this.add(this.btReiniciar);
		this.btReiniciar.addActionListener(this);
		
		//Aclaraciones
		this.add(this.lbExpAg);
		this.add(this.lbExpPV);
		this.add(this.lbExpAf);
		this.add(this.lbExpVacio);
	
	}
	//Getter de la escolaridad
	private String getEscolaridad() {
		
		while (true) {
			if (this.rbPreescolar.hasFocus()) {
				return "preescolar";
			} else if (this.rbPrimaria.hasFocus()) {
				return "primaria";
			} else if (this.rbSecundaria.hasFocus()) {
				return "secundaria";
			} else if (this.rbPreparatoria.hasFocus()) {
				return "bachillerato";
			} else if (this.rbProfesionalTec.hasFocus()) {
				return "profesional tecnico";
			} else {
				JOptionPane.showMessageDialog(null, "Seleccioine una escolaridad.");
			}
		}
	}
	
	public boolean validaVacio(String str) {
		if (str=="" || str==null) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean validaTod() {
		if(this.validaVacio(this.tfNombre.getText()) && this.validaVacio(this.tfAguinaldo.getText()) && this.validaVacio(this.tfAguinaldo.getText()) && this.validaVacio(this.tfIngresosMensuales.getText())) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean validaTodo() {
		if(this.validaVacio(this.tfNombre.getText()) && this.validaVacio(this.tfIngresosMensuales.getText()) && this.validaVacio(this.tfAguinaldo.getText()) && this.validaVacio(this.tfPrimaVac.getText())) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public void run() {
		
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Reinicia por defecto todos los campos
		if (e.getSource()==this.btReiniciar) {
			System.out.println("Borrado Exitoso!");
			this.tfAfore.setText("");
			this.tfAguinaldo.setText("");
			this.tfColegiaturas.setText("");
			this.tfCredHipo.setText("");
			this.tfDonativos.setText("");
			this.tfGastosFun.setText("");
			this.tfGastosMedHos.setText("");
			this.tfIngresosMensuales.setText("");
			this.tfNombre.setText("");
			this.tfPrimasSegurosGMM.setText("");
			this.tfPrimaVac.setText("");
			this.tfTransEsc.setText("");
			this.bg.clearSelection();
		} else if (e.getSource()==this.btCalcular) {
			if(this.validaTodo()==true) {
				//Aquí van los cálculos necesarios :D
			} else {
				System.out.println("Hola");
				JOptionPane.showMessageDialog(null, "Alguno de los siguientes campos quedó vacío:\n-Nombre\n-Sueldo mensual\n-Aguinaldo\n-Prima vacaional");
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}