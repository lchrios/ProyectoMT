import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PanelArchivos extends JPanel {
	private String rutaInput,
				   rutaOutput;
	private JFileChooser fcInput,
						 fcOutput;
	private File file;
	private Lector lector;
	private Escritor escritor;
	private Deduccion deduccion;
	private Persona[] personas;
	private JButton btAbrir,
					btGuardar,
					btCalcular,
					btReiniciar;
	private JTextField tfAbrir,
					   tfGuardar,
					   tfNomArch;
	private JLabel lbAbrir,
				   lbGuardar,
				   lbNota1,
				   lbNomArch,
				   lbExpPV,
				   lbExpAg,
				   lbExpAf,
				   lbExpVacio;
	private String[][] datosProcesados;
	private FileNameExtensionFilter filter=new FileNameExtensionFilter("Archivos CSV","csv");
	
	
	public PanelArchivos() {
		super();
		this.setPreferredSize(new Dimension(400,740));
		
		this.lbAbrir=new JLabel("Entrada:");
		this.btAbrir=new JButton("Buscar");
		this.lbGuardar=new JLabel("           Salida:");
		this.lbExpPV=new JLabel("*Exento hasta 15 días del salario mínimo o sea $1209.");
		this.lbExpAg=new JLabel("**Hasta 15 días exentos de impuestos o sea una quincena.");
		this.lbExpAf=new JLabel("***Hasta un 10% de los ingresos. Es una cuenta aparte.");
		this.lbExpVacio=new JLabel("TODO CAMPO QUE QUEDE VACÍO SERÁ INTERPRETADO COMO 0");
		this.btGuardar=new JButton("Seleccionar");
		this.btCalcular=new JButton("Calcular");
		this.btReiniciar=new JButton("Reiniciar");
		this.lbNota1=new JLabel("Revise bien las ubicaciones que pone en los espacios.");
		this.lbNomArch=new JLabel("Escribe un nombre para el archivo:");
		this.tfAbrir=new JTextField(20);
		this.tfGuardar=new JTextField(20);
		this.tfNomArch=new JTextField(10);
		this.btReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rutaInput=null;
				rutaOutput=null;
				tfAbrir.setText("");
				tfGuardar.setText("");
			}
		});
		this.btAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fcInput=new JFileChooser();
				fcInput.setDialogTitle("Escoge el documento de entrada");
				fcInput.setFileFilter(filter);
				int valorRetorno=fcInput.showOpenDialog(null);
				if(valorRetorno==JFileChooser.APPROVE_OPTION) {
					file=fcInput.getSelectedFile();
					rutaInput=file.getAbsolutePath();
					System.out.println("Path adquirido exitosamente.\n"+rutaInput);
					tfAbrir.setText(rutaInput);
				}
			}
		});
		
		this.btGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fcOutput=new JFileChooser();
				fcOutput.setDialogTitle("Escoge la ubicación del archivo de salida");
				fcOutput.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			    fcOutput.setAcceptAllFileFilterUsed(false);
				fcOutput.setApproveButtonText("Guardar");
				int valorRetorno=fcOutput.showOpenDialog(null);
				if(valorRetorno==JFileChooser.APPROVE_OPTION) {
					rutaOutput=fcOutput.getCurrentDirectory().getAbsolutePath();
					System.out.println("Path adquirido exitosamente.\n"+rutaOutput);
					tfGuardar.setText(rutaOutput);
				}
			}
		});
		this.btCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(parametrosCompletos()) {
					lector=new Lector(rutaInput);
					lector.leer(rutaInput);
					String[][] rawData=lector.getDatos();
					datosProcesados=new String[rawData.length][28];
					personas=new Persona[rawData.length];
					for(int i=0;i<rawData.length;i++) {
						personas[i]=new Persona();
						deduccion=new Deduccion();
						String[] datoslol=rawData[i];
						deduccion.calcularDeduccion(Double.parseDouble(rawData[i][2]), Double.parseDouble(rawData[i][5]), Double.parseDouble(rawData[i][6]), Double.parseDouble(rawData[i][7]), Double.parseDouble(rawData[i][8]), Double.parseDouble(rawData[i][9]), Double.parseDouble(rawData[i][10]), Double.parseDouble(rawData[i][11]), Double.parseDouble(rawData[i][13]), rawData[i][12]);
						personas[i].Calcula(datoslol, deduccion.GetD());
						datosProcesados[i][0]=rawData[i][0];//Nombre
						datosProcesados[i][1]=rawData[i][1];//RFC
						datosProcesados[i][2]=rawData[i][2];//Sueldo Mensual
						datosProcesados[i][3]=Double.toString(personas[i].GetSA());//Sueldo Anual
						datosProcesados[i][4]=rawData[i][3];//Aguinaldo
						datosProcesados[i][5]=Double.toString(personas[i].GetAE());//Aguinaldeo Excento
						datosProcesados[i][6]=Double.toString(personas[i].GetAG());//Aguinaldo Gravado
						datosProcesados[i][7]=rawData[i][4];//Prima Vac
						datosProcesados[i][8]=Double.toString(personas[i].GetPrE());//Prima Vac Exc
						datosProcesados[i][9]=Double.toString(personas[i].GetPG());//Prima Vac Gravada
						datosProcesados[i][10]=Double.toString(personas[i].GetTI());//Total Ingresos
						datosProcesados[i][11]=rawData[i][5];//Medicos y hospi
						datosProcesados[i][12]=rawData[i][6];//Funerarios
						datosProcesados[i][13]=rawData[i][7];//SGMM
						datosProcesados[i][14]=rawData[i][8];//Hipotecas
						datosProcesados[i][15]=rawData[i][9];//Donativos
						datosProcesados[i][16]=rawData[i][10];//Retiro
						datosProcesados[i][17]=rawData[i][11];//Transporte Escolar
						datosProcesados[i][18]=rawData[i][12];//Nivel Escolar
						datosProcesados[i][19]=Double.toString(deduccion.GetLC());//Max a deducir Colegiatura
						datosProcesados[i][20]=rawData[i][13];//Colegiatura Pagada
						datosProcesados[i][21]=Double.toString(deduccion.GetDS());//Total de deducciones sin retiro
						datosProcesados[i][22]=Double.toString(personas[i].GetTI()*0.1);//Deduccion permitida
						datosProcesados[i][23]=Double.toString(personas[i].GetTI()-Double.parseDouble(datosProcesados[i][22]));//Monto ISR
						datosProcesados[i][24]=Double.toString(personas[i].GetCJ());//Cuota Fija
						datosProcesados[i][25]=Double.toString(personas[i].GetPE());//% excedente
						datosProcesados[i][26]=Double.toString((personas[i].GetPE()/100)*(Double.parseDouble(datosProcesados[i][23])-personas[i].GetLinf()));//Pago excedente
						datosProcesados[i][27]=Double.toString(Double.parseDouble(datosProcesados[i][26])+personas[i].GetCJ());//Total a pagar
					}
					escritor=new Escritor(rutaOutput, datosProcesados, tfNomArch.getText());
				} else {
					JOptionPane.showMessageDialog(null, "Falta alguno de los siguientes parámetros:\n-Ruta de entrada\n-Ruta de salida\n-Nombre del archivo");
				}
				
				
			}
		});
		this.add(this.lbAbrir);
		this.add(this.tfAbrir);
		this.add(this.btAbrir);
		this.add(this.lbGuardar);
		this.add(this.tfGuardar);
		this.add(this.btGuardar);
		this.add(this.lbNomArch);
		this.add(this.tfNomArch);
		this.add(this.btCalcular);
		this.add(this.btReiniciar);
		this.add(this.lbExpPV);
		this.add(this.lbExpAg);
		this.add(this.lbExpAf);
		this.add(this.lbExpVacio);
		this.btCalcular.setPreferredSize(new Dimension(120, 30));
	}
	
	public boolean parametrosCompletos() {
		if(this.tfAbrir.getText().isEmpty() || this.tfGuardar.getText().isEmpty() || this.tfNomArch.getText().isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
}
