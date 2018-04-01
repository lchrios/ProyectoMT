import java.awt.Dimension;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PanelArchivos extends JPanel{
	private String rutaInput,
				   rutaOutput;
	
	private JFileChooser fcInput,
						 fcOutput;
	
	private FileNameExtensionFilter filter=new FileNameExtensionFilter("Archivos CSV","csv");
	
	public PanelArchivos() {
		super();
		this.setPreferredSize(new Dimension(500,700));
		
		fcInput=new JFileChooser("//home//");
		fcOutput=new JFileChooser("//home//");
		fcInput.setDialogTitle("Escoge el documento de entrada");
		fcOutput.setDialogTitle("Escoge la ubicación del archivo de salida");
		fcInput.setFileFilter(filter);
		this.fcInput.setBounds(0, 0, 400, 300);
		this.add(this.fcInput);
		this.fcOutput.setBounds(0, 0, 400, 300);
		this.add(this.fcOutput);
		
		
	}
}
