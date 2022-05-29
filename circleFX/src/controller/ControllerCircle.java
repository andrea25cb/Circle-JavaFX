package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import view.CircleView;

public class ControllerCircle {

	private CircleView vista;
	private Circle c;
	Button b1;
	Button b2;

//constructor:
	public ControllerCircle(CircleView vista) {
		this.vista = vista;
		this.c = vista.getCirclePane().getCircle();
		this.b1 = this.vista.getBtAgrandar();
		this.b2 = this.vista.getBtReducir();
		
		this.b1.setOnAction(new Handler1());
		this.b2.setOnAction(new Handler2());
	}

// handler1
	class Handler1 implements EventHandler<ActionEvent> {// ActionEvent es para presentar una accion del usuario en la
															// interfaz
		public void handle(ActionEvent arg0) {
			c.setRadius(c.getRadius() + 5);
		}
	}

// handler2
	class Handler2 implements EventHandler<ActionEvent> {
		public void handle(ActionEvent arg0) {
			c.setRadius(c.getRadius() > 5 ? c.getRadius() - 5 : c.getRadius());
		}
	}
}