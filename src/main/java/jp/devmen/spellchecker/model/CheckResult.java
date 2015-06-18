package jp.devmen.spellchecker.model;

import java.util.ArrayList;
import java.util.List;

public class CheckResult implements ICheckResult {

	private boolean result = false;
	private List<String> suggestList = new ArrayList<>();

	/**
	 * コンストラクタ
	 * 
	 * @param isValid
	 * @param SuggestList
	 */
	protected CheckResult(boolean isValid, List<String> SuggestList) {
		this.result = isValid;
		this.suggestList = SuggestList;
	}

	@Override
	public boolean isValid() {
		return this.result;
	}

	@Override
	public List<String> getSuggestList() {
		return this.suggestList;
	}
}
