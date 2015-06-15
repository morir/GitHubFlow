package jp.devmen.spellchecker.model;

import java.util.List;

public interface ISpellChecker {

	/**
	 * 単語を検査します。
	 * 
	 * @param word
	 *            検査対象の単語
	 * @return 単語が存在しない場合、修正候補の単語をリストで返却します。
	 */
	List<String> check(String word);
}
