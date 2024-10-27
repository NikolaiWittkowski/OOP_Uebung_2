
import javafx.stage.Stage;

public class AnwendersystemControl {
	
	private AnwendersystemModel anwModel;
	private AnwendersystemView anwView;
	
	
	public AnwendersystemControl(Stage primaryStage) {
		this.anwModel = new AnwendersystemModel();
		this.anwView = new AnwendersystemView(this, anwModel, primaryStage);
	}

	public void writeTo(String str) {
		try {
			this.anwModel.writeTo(str);
			this.anwView.infoWindow();
		} catch (Exception e) {
			this.anwView.errorWindow();
		}
	}

}
