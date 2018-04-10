import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.concurrent.SynchronousQueue;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PanelArchivos extends JPanel{
	private String rutaInput,
				   rutaOutput;
	
	private JFileChooser fcInput,
						 fcOutput;
	
	private File file;
	private Lector lector;
	private JButton btAbrir,
					btGuardar,
					btCalcular;
	
	private FileNameExtensionFilter filter=new FileNameExtensionFilter("Archivos CSV","csv");
	
	public PanelArchivos() {
		super();
		this.setPreferredSize(new Dimension(300,780));
		
		btAbrir=new JButton("Buscar archivo");
		btGuardar=new JButton("Seleccionar ruta de guardado");
		btCalcular=new JButton("Calcular");
		
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
				}
			}
		});
		this.btGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fcOutput=new JFileChooser();
				fcOutput.setDialogTitle("Escoge la ubicación del archivo de salida");
				fcOutput.setApproveButtonText("Guardar");
				int valorRetorno=fcOutput.showOpenDialog(null);
				if(valorRetorno==JFileChooser.APPROVE_OPTION) {
					file=fcOutput.getSelectedFile();
					rutaOutput=file.getAbsolutePath();
					System.out.println("Path adquirido exitosamente.\n"+rutaInput);
				}
			}
		});
		this.btCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		this.add(btAbrir);
		this.add(btGuardar);
		this.add(btCalcular);
		this.btAbrir.setLocation(50, 100);
	}
	
	
}
