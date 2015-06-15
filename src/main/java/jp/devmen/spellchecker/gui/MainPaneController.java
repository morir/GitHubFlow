package jp.devmen.spellchecker.gui;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import jp.devmen.spellchecker.model.IWordDictionary;
import jp.devmen.spellchecker.model.WordDictionary;

import com.sun.javafx.collections.ObservableListWrapper;

public class MainPaneController {

	@FXML
	private ListView<String> listDictionary;

	@FXML
	private TextField txtFieldWord;

	@FXML
	private Label labelSuggested;

	private IWordDictionary wordDictionary;

	@FXML
	void initialize() {
		wordDictionary = WordDictionary.getInstance();

		List<String> allWord = wordDictionary.getAllWord();
		listDictionary.setItems(new ObservableListWrapper<String>(allWord));
	}

	@FXML
	void addButtonFired(ActionEvent event) {
		// 画面チームの実装箇所
	}

	private void refreshAllwordList() {
		listDictionary.setItems(null);
		List<String> allWord = wordDictionary.getAllWord();
		listDictionary.setItems(new ObservableListWrapper<String>(allWord));
	}
}
