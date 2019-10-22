package dad.javafx.mvc.ver;

import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class VerController {

	// view

	private VerView view = new VerView();

	// model

	private IntegerProperty dato = new SimpleIntegerProperty();

	public VerController() {

		view.getDatoProgress().progressProperty().bind(dato.divide(100.0));

		view.getDatoLabel().textProperty().bind(Bindings.concat("Valor actual: ").concat(dato));
	}

	public VerView getView() {
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
