package dad.javafx.mvc.ver;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.VBox;

public class VerView extends VBox {

	private ProgressBar datoProgress;
	private Label datoLabel;

	public VerView() {
		super();

		datoProgress = new ProgressBar();
		datoProgress.setPrefWidth(150);

		datoLabel = new Label();

		setSpacing(5);
		setAlignment(Pos.CENTER);
		getChildren().addAll(datoProgress, datoLabel);

	}

	public ProgressBar getDatoProgress() {
		return datoProgress;
	}

	public Label getDatoLabel() {
		return datoLabel;
	}

}
