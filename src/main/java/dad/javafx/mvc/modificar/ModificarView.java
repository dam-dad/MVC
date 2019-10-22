package dad.javafx.mvc.modificar;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ModificarView extends VBox {

	private TextField datoText;
	private Button establecerButton;
	private Button incrementarButton;
	private Button decrementarButton;

	public ModificarView() {
		super();

		datoText = new TextField();
		datoText.setPrefColumnCount(5);

		establecerButton = new Button("Establecer");
		establecerButton.setDefaultButton(true);

		incrementarButton = new Button(">>");

		decrementarButton = new Button("<<");

		HBox datoBox = new HBox(5, new Label("Nuevo valor:"), datoText);
		datoBox.setAlignment(Pos.BASELINE_CENTER);

		HBox botonesBox = new HBox(5, decrementarButton, incrementarButton);
		botonesBox.setAlignment(Pos.BASELINE_CENTER);

		setSpacing(5);
		setAlignment(Pos.CENTER);
		getChildren().addAll(datoBox, establecerButton, botonesBox);

	}

	public TextField getDatoText() {
		return datoText;
	}

	public Button getEstablecerButton() {
		return establecerButton;
	}

	public Button getIncrementarButton() {
		return incrementarButton;
	}

	public Button getDecrementarButton() {
		return decrementarButton;
	}

}
