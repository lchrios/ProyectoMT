import java.awt.Dimension;

import javax.swing.JFrame;

public class VentanaPpal extends JFrame{

	public VentanaPpal(){
		super("Calculadora Graficadora");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(800, 600));
		
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaPpal ventana=new VentanaPpal();
	}

}
