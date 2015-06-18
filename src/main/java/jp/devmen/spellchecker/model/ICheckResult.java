package jp.devmen.spellchecker.model;

import java.util.List;

/**
 * 単語チェック結果クラスです。
 */
public interface ICheckResult {

	/**
	 * 単語チェック結果を生成します。
	 * 
	 * @param isValid
	 *            正常かどうかを示す値
	 * @param SuggestList
	 *            修正単語のリスト
	 * @return 単語チェック結果
	 */
	static ICheckResult create(boolean isValid, List<String> SuggestList) {
		return null;
	}

	/**
	 * チェックが正常かどうかを示す値を返します。
	 * 
	 * @return 正常な場合 true
	 */
	boolean isValid();

	/**
	 * チェック結果が正常ではない場合の修正候補の単語リスト
	 * 
	 * @return 修正候補の単語リスト
	 */
	List<String> getSuggestList();
}
