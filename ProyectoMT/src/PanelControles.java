import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class PanelControles extends JPanel {

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
					  tfColegiaturas,
					  tfRFC;
	
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
				  	  lbCL7,
				  	  lbRFC;
	
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
	private ButtonGroup bg;
	
	//JFileChooser
	private JFileChooser fcControles;
	//Separador de Linea
	public static final String NL = System.getProperty("line.separator"); 
	
	//Strings
	private String rutaOutput;
	
	//Persona
	private Persona persona;
	//Deduccion
	private Deduccion deduccion;
	//Constructor
	public PanelControles() {
		super();
		this.setPreferredSize(new Dimension(400, 800));
		
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
		this.lbRFC=new JLabel("                                    RFC:");
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
		this.tfRFC=new JTextField(20);
		
			//Botones
		this.btCalcular=new JButton("Calcular");
		this.btReiniciar=new JButton("Reiniciar");
		
		
			//RadioButtons
		this.rbPreescolar=new JRadioButton("Preescolar");
		this.rbPrimaria=new JRadioButton("Primaria");
		this.rbSecundaria=new JRadioButton("Secundaria");
		this.rbPreparatoria=new JRadioButton("Preparatoria");
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
		this.add(this.lbRFC);
		this.add(this.tfRFC);
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
		//this.add(this.lbCL4);
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
		this.btReiniciar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tfAfore.setText("");
				tfAguinaldo.setText("");
				tfColegiaturas.setText("");
				tfCredHipo.setText("");
				tfDonativos.setText("");
				tfGastosFun.setText("");
				tfGastosMedHos.setText("");
				tfIngresosMensuales.setText("");
				tfNombre.setText("");
				tfPrimasSegurosGMM.setText("");
				tfPrimaVac.setText("");
				tfTransEsc.setText("");
				tfRFC.setText("");
				bg.clearSelection();
				rutaOutput=null;
				System.out.println("Borrado Exitoso!");
			}
		});
		this.btCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(validaTodo()) {
					fcControles=new JFileChooser();
					fcControles.setDialogTitle("Escoge la ubicación de destino.");
					fcControles.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				    fcControles.setAcceptAllFileFilterUsed(false);
					fcControles.setApproveButtonText("Guardar");
					int valorRetorno=fcControles.showOpenDialog(null);
					if(valorRetorno==JFileChooser.APPROVE_OPTION) {
						rutaOutput=fcControles.getCurrentDirectory().getAbsolutePath();
						System.out.println("Path adquirido exitosamente.\n"+rutaOutput);
						String[][] datosProcesados=new String[1][28];
						persona=new Persona();
						deduccion=new Deduccion();
						String[] a=new String[5];
						a[0]="";a[1]="";a[2]=tfIngresosMensuales.getText();a[3]=tfAguinaldo.getText();a[4]=tfPrimaVac.getText();
						deduccion.calcularDeduccion(Double.parseDouble(tfIngresosMensuales.getText()), Double.parseDouble(tfGastosMedHos.getText()), Double.parseDouble(tfGastosFun.getText()), Double.parseDouble(tfPrimasSegurosGMM.getText()), Double.parseDouble(tfCredHipo.getText()), Double.parseDouble(tfDonativos.getText()), Double.parseDouble(tfAfore.getText()), Double.parseDouble(tfTransEsc.getText()), Double.parseDouble(tfColegiaturas.getText()), getEscolaridad());
						persona.Calcula(a, deduccion.GetD());
						datosProcesados[0][0]=tfNombre.getText();//Nombre
						datosProcesados[0][1]=tfRFC.getText();//RFC
						datosProcesados[0][2]=tfIngresosMensuales.getText();//Sueldo Mensual
						datosProcesados[0][3]=Double.toString(Double.parseDouble(tfIngresosMensuales.getText())*12);//Sueldo Anual
						datosProcesados[0][4]=tfAguinaldo.getText();//Aguinaldo
						datosProcesados[0][5]=Double.toString(persona.GetAE());//Aguinaldeo Excento
						datosProcesados[0][6]=Double.toString(persona.GetAG());//Aguinaldo Gravado
						datosProcesados[0][7]=tfPrimaVac.getText();//Prima Vac
						datosProcesados[0][8]=Double.toString(persona.GetPrE());//Prima Vac Exc
						datosProcesados[0][9]=Double.toString(persona.GetPG());//Prima Vac Gravada
						datosProcesados[0][10]=Double.toString(persona.GetTI());//Total Ingresos
						datosProcesados[0][11]=tfGastosMedHos.getText();//Medicos y hospi
						datosProcesados[0][12]=tfGastosFun.getText();//Funerarios
						datosProcesados[0][13]=tfPrimasSegurosGMM.getText();//SGMM
						datosProcesados[0][14]=tfCredHipo.getText();//Hipotecas
						datosProcesados[0][15]=tfDonativos.getText();//Donativos
						datosProcesados[0][16]=tfAfore.getText();//Retiro
						datosProcesados[0][17]=tfTransEsc.getText();//Transporte Escolar
						datosProcesados[0][18]=getEscolaridad();//Nivel Escolar
						datosProcesados[0][19]=Double.toString(deduccion.GetCF());//Max a deducir Colegiatura
						datosProcesados[0][20]=tfColegiaturas.getText();//Colegiatura Pagada
						datosProcesados[0][21]=Double.toString(deduccion.GetDS());//Total de deducciones sin retiro
						datosProcesados[0][22]=Double.toString(Double.parseDouble(tfIngresosMensuales.getText())*1.2);//Deduccion permitida
						datosProcesados[0][23]=Double.toString(persona.GetTI()-Double.parseDouble(datosProcesados[0][22]));//Monto ISR
						datosProcesados[0][24]=Double.toString(persona.GetCJ());//Cuota Fija
						datosProcesados[0][25]=Double.toString(persona.GetPE());//% excedente
						datosProcesados[0][26]=Double.toString(persona.GetPE()*(Double.parseDouble(datosProcesados[0][23])-persona.GetLinf()));//Pago excedente
						datosProcesados[0][27]=Double.toString(Double.parseDouble(datosProcesados[0][26])+persona.GetCJ());//Total a pagar
						Escritor escritor=new Escritor(rutaOutput, datosProcesados);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Alguno de los siguientes campos quedó vacío:\n-Nombre\n-Sueldo mensual\n-Aguinaldo\n-Prima vacaional");
				}
			}
		});
		
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
				return "preparatoria";
			} else if (this.rbProfesionalTec.hasFocus()) {
				return "profesional tecnico";
			} else {
				JOptionPane.showMessageDialog(null, "Seleccioine una escolaridad.");
			}
		}
	}

	public boolean validaTodo() {
		if(this.tfNombre.getText().isEmpty() || this.tfIngresosMensuales.getText().isEmpty() || this.tfAguinaldo.getText().isEmpty() || this.tfPrimaVac.getText().isEmpty() || this.tfRFC.getText().isEmpty()) {
			System.out.println("Hay alguno vacío");
			return false;
		} else {
			System.out.println("todos llenos :)");
			return true;
		}
	}
}