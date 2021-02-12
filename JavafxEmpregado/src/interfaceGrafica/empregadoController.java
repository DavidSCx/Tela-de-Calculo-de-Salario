package interfaceGrafica;


import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;


public class empregadoController {
	@FXML
	private TextField txtNome;
	@FXML
	private TextField txtSalhora;
	@FXML
	private TextField txtHorasTrab;
	@FXML
	private Button btnCalcular;
	@FXML
	private Button btnLimpar;
	@FXML
	private Label lblResultado;

	
	public void onbtnCalcularClick()
	{
	String nome;
	double salHora;
	double horasTrab;
	double salario;
	
	
	
	
	String formatasalario;
	
	nome=txtNome.getText();
	salHora=Double.parseDouble(txtSalhora.getText());
	horasTrab=Double.parseDouble(txtHorasTrab.getText());
	
	salario=salHora*horasTrab;
	formatasalario=String.format("%.2f", salario);
	
	lblResultado.setText(nome + " Recebe " + formatasalario + " de Salário");
	
	
	}
	public void onbtnLimpar()
	{
		txtSalhora.setText("");
		txtNome.setText("");
		txtHorasTrab.setText("");
		lblResultado.setText("");
	}
}