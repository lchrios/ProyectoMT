import java.awt.BorderLayout;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

	public VentanaPrincipal() {
		super("Cálculo ISR");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new PanelArchivos(),BorderLayout.WEST);
		this.add(new PanelControles(),BorderLayout.EAST);
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		VentanaPrincipal ventana=new VentanaPrincipal();
	}

}
