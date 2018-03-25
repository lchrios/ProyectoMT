import java.awt.Button;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

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
					  tfNivelCol,
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
				  	  	  lbExpNivCol,
				  	  lbColegiaturas,
				  	  BreakLine;
	
	//Botones
	private Button btCalcular,
				   btReiniciar;

	//Separador de Linea
	public static final String NL = System.getProperty("line.separator"); 
	
	//Constructor
	public PanelControles() {
		super();
		this.setPreferredSize(new Dimension(400, 600));
		
		//Creación de objetos
			//Labels
		this.lbDatosGen=new JLabel("---------------------------|    |Datos Generales|    |---------------------------");
		this.lbNombre=new JLabel("Nombre:", SwingConstants.LEFT);
		this.lbIngresos=new JLabel("Ingresos");
		this.lbIngresosMensuales=new JLabel("Sueldo Mensual:", SwingConstants.LEFT);
		this.lbPrestaAdic=new JLabel("Prestaciones adicionales");
		this.lbPrimaVac=new JLabel("Prima vacacional*:", SwingConstants.LEFT);
		this.lbExpPV=new JLabel("**Exento hasta 15 días del salario mínimo o sea $1209.");
		this.lbAguinaldo=new JLabel("Aguinaldo**:", SwingConstants.LEFT);
		this.lbExpAg=new JLabel("*Hasta 15 días exentos de impuestos o sea una quincena.");
		this.lbDeducciones=new JLabel("Deducciones");
		this.lbGastosMedHos=new JLabel("Honorarios médicos, dentales y gastos hospitalarios:", SwingConstants.LEFT);
		this.lbGastosFun=new JLabel("Gastos funerarios:", SwingConstants.LEFT);
		this.lbPrimasSegGMM=new JLabel("Primas por seguros de gastos médicos:", SwingConstants.LEFT);
		this.lbCredHipo=new JLabel("Intereses  reales devengados y efectivamente pagados créditos hipotecarios:", SwingConstants.LEFT);
		this.lbDonativos=new JLabel("Donativos:", SwingConstants.LEFT);
		this.lbAfore=new JLabel("Aportaciones subcuenta retiro***:", SwingConstants.LEFT);
		this.lbExpAf=new JLabel("***Hasta un 10% de los ingresos. Es una cuenta aparte.", SwingConstants.LEFT);
		this.lbTransEsc=new JLabel("Transporte escolar:", SwingConstants.LEFT);
		this.lbColegiaturas= new JLabel("Colegiaturas pagadas:", SwingConstants.LEFT);
		this.lbExpNivCol=new JLabel("0 - Primaria\n1 - Secundaria\n2 - Preparatoria\n");
		this.lbNivelCol=new JLabel("Nivel educativo:", SwingConstants.LEFT);
		
			//TextFields
		this.tfNombre=new JTextField(25);
		
		
		//Adición de objetos
		this.add(lbDatosGen);
		this.add(lbNombre);
		this.add(tfNombre);	
	
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
