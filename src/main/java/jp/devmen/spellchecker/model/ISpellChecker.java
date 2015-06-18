package jp.devmen.spellchecker.model;


public interface ISpellChecker {

	/**
	 * 単語を検査します。
	 * 
	 * @param word
	 *            検査対象の単語
	 * @return 単語の検査結果
	 */
	ICheckResult check(String word);
}
