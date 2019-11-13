package dad.javafx.buscarReemplazar;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class BuscarReemplazApp extends Application {

	// view

	BuscarRemplazarController controller;
	
//	private Label buscarLabel;
//	private Label reemplazarLabel;
//	private TextField buscarText;
//	private TextField reemplazarText;
//	private Button buscarButton, ReemplazarButton, ReemplazarTodoButton, cerrarButton, helpButton;
//	private CheckBox Mayusculas, buscarAtras, resaltarResultados, ExpresionRegular;

	@Override
	public void start(Stage primaryStage) throws Exception {

//		buscarLabel = new Label("Buscar: ");
//		reemplazarLabel = new Label("Reemplazar con:");
//
//		buscarText = new TextField();
//		reemplazarText = new TextField();
//
//		buscarButton = new Button("Buscar");
//		buscarButton.setMinWidth(30);
//		ReemplazarButton = new Button("Reemplazar");
//		ReemplazarTodoButton = new Button("Reemplazar Todo");
//		cerrarButton = new Button("Cerrar");
//		helpButton = new Button("Ayuda");
//
//		Mayusculas = new CheckBox("Mayusculas y minusculas");
//		buscarAtras = new CheckBox("Buscar hacia atrás");
//		ExpresionRegular = new CheckBox("Expresión Regular");
//		resaltarResultados = new CheckBox("Resaltar resultados");
//
//		VBox botones = new VBox(buscarButton, ReemplazarButton, ReemplazarTodoButton, cerrarButton, helpButton);
//		botones.setSpacing(5);
//
//		GridPane root = new GridPane();
//		root.setVgap(5);
//		root.setHgap(5);
//		root.setAlignment(Pos.CENTER);
//		root.addRow(0, new HBox(buscarLabel, buscarText), botones);
//		root.addRow(1, new HBox(reemplazarLabel, reemplazarText));
//		root.addRow(2, new HBox(Mayusculas, buscarAtras));
//		root.addRow(3, new HBox(ExpresionRegular, resaltarResultados));
//		GridPane.setRowSpan(botones, 3);
//		GridPane.setColumnSpan(buscarText, 1);
//		GridPane.setHgrow(buscarText, Priority.ALWAYS);
		
		controller = new BuscarRemplazarController();
		
		Scene scene = new Scene(controller.view(), 640, 380);

		primaryStage.setTitle("Buscar y  Reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);

	}
}
