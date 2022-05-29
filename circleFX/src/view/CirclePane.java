package view;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CirclePane extends StackPane{

	private Circle circle;
	
		public CirclePane() {  
			circle = new Circle(50); 
		    getChildren().add(circle);
		    circle.setStroke(Color.DARKSLATEBLUE);
		    circle.setFill(Color.DARKSEAGREEN);
		  }

		public Circle getCircle() {
			return circle;
		}

		public void setCircle(Circle circle) {
			this.circle = circle;
		}
}
