package dad.javafx.buscarReemplazar;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarReemplazApp extends Application {

	private Button buscarButton, remplazarButton, remplazarTodoButton, cerrarButton, ayudaButton;
	private Label buscarLabel, remplazarLabel;
	private TextField buscarText, remplazarText;
	private CheckBox letrasCheck, buscarCheck, expresionCheck, resaltarCheck;

	@Override
	public void start(Stage primaryStage) throws Exception {

		buscarButton = new Button("Buscar");
		buscarButton.setMinWidth(100);
		remplazarButton = new Button("Remplazar");
		remplazarButton.setMinWidth(100);
		remplazarTodoButton = new Button("Remplazar todo");
		remplazarTodoButton.setMinWidth(100);
		cerrarButton = new Button("Cerrar");
		cerrarButton.setMinWidth(100);
		ayudaButton = new Button("Ayuda");
		ayudaButton.setMinWidth(100);

		buscarLabel = new Label("Buscar: ");
		remplazarLabel = new Label("Remplazar con: ");

		buscarText = new TextField();
		remplazarText = new TextField();

		letrasCheck = new CheckBox("Mayusculas y minusculas");
		buscarCheck = new CheckBox("Buscar hacia atras");
		expresionCheck = new CheckBox("Expresion regular");
		resaltarCheck = new CheckBox("Resaltar resultados");

		GridPane grid = new GridPane();

		grid.addRow(0, letrasCheck, buscarCheck);
		grid.addRow(1, expresionCheck, resaltarCheck);
		grid.setVgap(5);

		ColumnConstraints[] checkConstrains = { new ColumnConstraints(), new ColumnConstraints() };

		checkConstrains[0].setHalignment(HPos.LEFT);
		checkConstrains[1].setHalignment(HPos.LEFT);
		checkConstrains[0].setHgrow(Priority.ALWAYS);
		checkConstrains[1].setHgrow(Priority.ALWAYS);

		grid.getColumnConstraints().setAll(checkConstrains);

		GridPane root = new GridPane();
		root.setPadding(new Insets(5));
		root.setHgap(5);
		root.setVgap(5);
		root.addRow(0, buscarLabel, buscarText, buscarButton);
		root.addRow(1, remplazarLabel, remplazarText, remplazarButton);
		root.addRow(2, new Label(""), grid, new VBox(5, remplazarTodoButton, cerrarButton));
		root.add(ayudaButton, 2, 3);

		ColumnConstraints[] cols = { new ColumnConstraints(), new ColumnConstraints(), new ColumnConstraints() };

		cols[0].setHalignment(HPos.LEFT);
		cols[1].setHalignment(HPos.CENTER);
		cols[1].fillWidthProperty();
		cols[2].setHalignment(HPos.RIGHT);

		root.getColumnConstraints().setAll(cols);

		cols[1].setHgrow(Priority.ALWAYS);
		root.getColumnConstraints().setAll(cols);

		root.setAlignment(Pos.TOP_CENTER);

		Scene scene = new Scene(root, 300, 200);

		primaryStage.setTitle("Buscar y Remplazar");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
