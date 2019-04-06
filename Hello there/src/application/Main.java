package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Label title = new Label();
			title.setText("Enter your name");
			title.setLayoutX(10);
			title.setLayoutY(10);
			TextField input = new TextField();
			input.setLayoutX(10);
			input.setLayoutY(30);
			Label output = new Label();
			output.setLayoutX(10);
			output.setLayoutY(70);
			Button action = new Button();
			action.setText("Say Hello");
			action.setLayoutX(10);
			action.setLayoutY(100);
			EventHandler<javafx.scene.input.MouseEvent> evh = new EventHandler<javafx.scene.input.MouseEvent>() {
				@Override
				public void handle(MouseEvent e) {
					if(input.getText().equals("")){output.setText("Hello there!");}
					else{output.setText("Hello " + input.getText() + "!");}
				}
			};
			action.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, evh); 
			Group root = new Group(title, input, output, action);
			Scene scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
