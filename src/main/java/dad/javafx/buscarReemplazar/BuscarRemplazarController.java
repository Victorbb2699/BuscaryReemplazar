package dad.javafx.buscarReemplazar;

import java.io.IOException;
import java.net.URL;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;

public class BuscarRemplazarController implements Initializable {
	
	@FXML
    private GridPane root;

    @FXML
    private VBox botones;

    @FXML
    private Button buscarButton;

    @FXML
    private Button remplazarButton;

    @FXML
    private Button remplazarTodButton;

    @FXML
    private Button cerrarButton;

    @FXML
    private Button ayudaButton;

    @FXML
    private Label buscarLabel;

    @FXML
    private Label reemplazarLabel;

    @FXML
    private TextField buscarText;

    @FXML
    private TextField ReemplazarText;

    @FXML
    private CheckBox mayus;

    @FXML
    private CheckBox buscar;

    @FXML
    private CheckBox expr;

    @FXML
    private CheckBox resalt;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		

	}
	public BuscarRemplazarController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/BuscarReemplazarView.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	public GridPane view() {
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
