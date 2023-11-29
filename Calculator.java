package pack;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		Label label = new Label("");
		Button seven = new Button("7");
		Button eight = new Button("8");
		
		GridPane pane = new GridPane();
		pane.add(label, 0, 0);
		
		Scene scene = new Scene(pane, 200, 250);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Calculator");
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}
