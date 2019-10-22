package dad.javafx.mvc.modificar;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ModificarController {

	// view

	private ModificarView view = new ModificarView();

	// model

	private IntegerProperty dato = new SimpleIntegerProperty();
	private StringProperty introducido = new SimpleStringProperty();

	public ModificarController() {

		introducido.bind(view.getDatoText().textProperty());

		view.getEstablecerButton().setOnAction(e -> onEstablecerAction(e));
		view.getIncrementarButton().setOnAction(e -> onIncrementarAction(e));
		view.getDecrementarButton().setOnAction(e -> onDecrementarAction(e));

	}

	private void onEstablecerAction(ActionEvent e) {
		try {
			int valor = Integer.parseInt(introducido.get());
			dato.set(valor);
		} catch (NumberFormatException ex) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error");
			alert.setHeaderText("Debe introducir un número.");
			alert.showAndWait();
		}
	}

	private void onIncrementarAction(ActionEvent e) {
		dato.set(dato.get() + 1);
	}

	private void onDecrementarAction(ActionEvent e) {
		dato.set(dato.get() - 1);
	}

	public ModificarView getView() {
		return view;
	}

	public final IntegerProperty datoProperty() {
		return this.dato;
	}

	public final int getDato() {
		return this.datoProperty().get();
	}

	public final void setDato(final int dato) {
		this.datoProperty().set(dato);
	}

}
