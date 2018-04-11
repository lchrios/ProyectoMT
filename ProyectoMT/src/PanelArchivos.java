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

public class PanelArchivos extends JPanel{
	private String rutaInput,
				   rutaOutput;
	private JFileChooser fcInput,
						 fcOutput;
	private File file;
	private Lector lector;
	private Escritor escritor;
	private Deduccion deduccion=new Deduccion();
	private Persona[] personas;
	private JButton btAbrir,
					btGuardar,
					btCalcular;
	private JTextField tfAbrir,
					   tfGuardar,
					   tfNomArch;
	private JLabel lbAbrir,
				   lbGuardar,
				   lbNota1;
	private String[][] datosProcesados;
	private FileNameExtensionFilter filter=new FileNameExtensionFilter("Archivos CSV","csv");
	
	
	public PanelArchivos() {
		super();
		this.setPreferredSize(new Dimension(400,780));
		
		this.lbAbrir=new JLabel("Entrada:");
		this.btAbrir=new JButton("Buscar");
		this.lbGuardar=new JLabel("           Salida:");
		this.btGuardar=new JButton("Seleccionar");
		this.btCalcular=new JButton("Calcular");
		this.lbNota1=new JLabel("Revise bien las ubicaciones que pone en los espacios.");
		this.tfAbrir=new JTextField(20);
		this.tfGuardar=new JTextField(20);
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
					personas=new Persona[rawData.length];
					for(int i=0;i<rawData.length;i++) {
						personas[i]=new Persona();
						deduccion.calcularDeduccion(Double.parseDouble(rawData[i][2]), Double.parseDouble(rawData[i][5]), Double.parseDouble(rawData[i][6]), Double.parseDouble(rawData[i][7]), Double.parseDouble(rawData[i][8]), Double.parseDouble(rawData[i][9]), Double.parseDouble(rawData[i][10]), Double.parseDouble(rawData[i][11]), Double.parseDouble(rawData[i][12]), rawData[i][13]);
						
					}
					
					escritor=new Escritor(rutaOutput, lector.getDatos());
				} else {
					JOptionPane.showMessageDialog(null, "Debes asignar una dirección para entrada y salida de datos.");
				}
				
				
			}
		});
		this.add(this.lbAbrir);
		this.add(this.tfAbrir);
		this.add(this.btAbrir);
		this.add(this.lbGuardar);
		this.add(this.tfGuardar);
		this.add(this.btGuardar);
		this.add(this.btCalcular);
		this.btCalcular.setPreferredSize(new Dimension(120, 30));
	}
	
	public boolean parametrosCompletos() {
		if(this.tfAbrir.getText()!="" && this.tfGuardar.getText()!="") {
			return true;
		} else {
			return false;
		}
	}
}
