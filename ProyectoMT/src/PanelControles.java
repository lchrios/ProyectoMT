import java.awt.Button;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class PanelControles extends JPanel implements MouseListener, ActionListener, Runnable {

	private TextField tfNombre,
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
					  tfNivelCol,
					  tfColegiaturas;
	private Label lbDatosGen,
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
				  	  lbColegiaturas;
	private Button btCalcular,
				   btReiniciar;
	
	public PanelControles() {
		super();
		this.setPreferredSize(new Dimension(400, 600));
		
	}
	
	@Override
	public void run() {
		
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
