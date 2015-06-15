package jp.devmen.spellchecker.model;

import java.util.ArrayList;
import java.util.List;

public class CheckResult {

	/** 有効かどうか示す値 */
	private boolean isValid;

	/** 修正候補の単語リスト */
	private List<String> SuggestList = new ArrayList<>();

	public CheckResult(boolean isValid, List<String> suggestList) {
		super();
		this.isValid = isValid;
		SuggestList = suggestList;
	}

	public boolean isValid() {
		return isValid;
	}

	public List<String> getSuggestList() {
		return SuggestList;
	}
}
