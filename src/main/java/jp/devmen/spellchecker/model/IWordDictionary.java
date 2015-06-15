package jp.devmen.spellchecker.model;

import java.util.List;

public interface IWordDictionary {

	/**
	 * 単語が登録されているかどうかを返します。
	 * 
	 * @param word
	 *            検査対象の単語
	 * @return 単語が登録されている場合 true
	 */
	boolean containts(String word);

	/**
	 * 単語を辞書に追加します。
	 * 
	 * @param word
	 *            追加する単語
	 */
	void addWord(String word);

	/**
	 * 辞書に登録されているすべての単語を取得します。
	 * 
	 * @return 単語のリスト
	 */
	List<String> getAllWord();

}
