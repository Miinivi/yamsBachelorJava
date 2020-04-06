package hitemakhatonv2;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class YamsContentApp extends BorderPane {
	// Top
	Label gameName = new Label("Yam's");
	HBox topHBox = new HBox(gameName);
	// Score sheet
	TableView tbScore = new TableView();
	
	// Constructor & Creation of the HMI
	public YamsContentApp() {
		setCenterHBox(topHBox);
		setTop(topHBox);
		
		setCenter(tbScore);
		
	}
	
	public void setCenterLabel(Label ...lbls) {
		for (Label lbl: lbls) {
			lbl.setAlignment(Pos.BASELINE_CENTER);
		}
	}
	
	public void setCenterHBox(HBox ...hbs) {
		for (HBox hb: hbs) {
			hb.setAlignment(Pos.BASELINE_CENTER);
		}
	}
	
	public void setCenterVBox(VBox ...vbs) {
		for (VBox vb: vbs) {
			vb.setAlignment(Pos.BASELINE_CENTER);
		}
	}
}
