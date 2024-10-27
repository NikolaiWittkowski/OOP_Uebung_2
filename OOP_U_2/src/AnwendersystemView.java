import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AnwendersystemView {
	
	private AnwendersystemControl anwControl;
	private AnwendersystemModel anwModel;
	
	BorderPane bp = new BorderPane();
	Button button = new Button("write");
	TextField textf = new TextField();
	
	public AnwendersystemView(AnwendersystemControl anwControl, AnwendersystemModel anwModel, Stage primaryStage) {
		
		button.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				
				anwControl.writeTo(textf.getText());
				
			}
			
		});
		
		HBox hbox = new HBox(10, textf, button);
		hbox.setAlignment(Pos.CENTER);
		bp.setCenter(hbox);
		Scene scene = new Scene(bp,400,200);
		primaryStage.setTitle(anwModel.getUeberschrift());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void infoWindow() {
		Stage st = new Stage();
		BorderPane bp = new BorderPane();
		Scene scene = new Scene(bp);
		
		Label label = new Label("Text wurde in die Datei geschrieben");
		
		HBox hbox = new HBox(label);
		bp.setCenter(hbox);
		st.setScene(scene);
		st.show();
	}
	
	public void errorWindow() {
		Stage st = new Stage();
		BorderPane bp = new BorderPane();
		Scene scene = new Scene(bp);
		
		Label label = new Label("Fehler beim Schreiben in die Datei");
		
		HBox hbox = new HBox(label);
		bp.setCenter(hbox);
		st.setScene(scene);
		st.show();
	}
	
	

}
