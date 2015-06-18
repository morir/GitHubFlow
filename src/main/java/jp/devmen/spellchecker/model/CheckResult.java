package jp.devmen.spellchecker.model;

import java.util.List;

public class CheckResult implements ICheckResult {

	/**
	 * コンストラクタ
	 * 
	 * @param isValid
	 * @param SuggestList
	 */
	protected CheckResult(boolean isValid, List<String> SuggestList) {
	}

	@Override
	public boolean isValid() {
		return false;
	}

	@Override
	public List<String> getSuggestList() {
		return null;
	}
}
