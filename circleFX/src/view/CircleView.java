package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;

public class CircleView extends BorderPane {
//VISTA DEL CIRCULO Y BOTONES
	private HBox hBox; // caja horizontal

	private CirclePane circlePane;

	Header hPane;

	private Button btAgrandar; // boton para agrandar
	private Button btReducir; // boton para reducir

	public CircleView() {
	hPane = new Header("CÍRCULO");
		circlePane = new CirclePane();
		// AÑADO DOS BOTONES (horizontal)
		hBox = new HBox();
		hBox.setSpacing(60);
		hBox.setAlignment(Pos.CENTER);
		btAgrandar = new Button("Agrandar");
		btReducir = new Button("Reducir");
		hBox.getChildren().add(btAgrandar);
		hBox.getChildren().add(btReducir);

		this.setTop(hPane); //titulo arriba
		//hPane.setMargin(20px, );
		this.setCenter(circlePane); // para que el circulo esté en el centro
		this.setBottom(hBox);

	}

	public CirclePane getCirclePane() {
		return circlePane;
	}

	public Button getBtAgrandar() {
		return btAgrandar;
	}

	public void setBtAgrandar(Button btAgrandar) {
		this.btAgrandar = btAgrandar;
	}

	public Button getBtReducir() {
		return btReducir;
	}

	public void setBtReducir(Button btReducir) {
		this.btReducir = btReducir;
	}

}