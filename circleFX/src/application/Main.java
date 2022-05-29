package application;

import controller.ControllerCircle;
import javafx.application.Application;
import javafx.stage.Stage;
import view.CircleView;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {

	public void start(Stage primaryStage) {
		try {
			CircleView root = new CircleView();
			ControllerCircle c = new ControllerCircle(root);//para controlar el panel
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
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
