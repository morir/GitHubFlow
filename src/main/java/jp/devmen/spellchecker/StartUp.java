package jp.devmen.spellchecker;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class StartUp extends Application {

	@Override
	/**
	 * 起動処理
	 */
	public void start(Stage primaryStage) {
		FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("gui/MainPane.fxml"));
		Pane pane;
		try {
			pane = fxmlLoader.load();
			Scene scene = new Scene(pane, 800, 600);
			primaryStage.setTitle("SpellChecker");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
