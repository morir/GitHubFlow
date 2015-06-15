/**
 * 
 */
package jp.devmen.spellchecker.model;

import java.io.IOException;
import java.util.List;

import org.languagetool.JLanguageTool;
import org.languagetool.language.BritishEnglish;
import org.languagetool.rules.RuleMatch;

/**
 * @author Hiroyuki
 *
 */
public class SpellChecker implements ISpellChecker {

	private static SpellChecker spellChecker = new SpellChecker();
	private static JLanguageTool langTool = new JLanguageTool(new BritishEnglish());

	private SpellChecker() {
	}

	public static ISpellChecker getInstance() {
		return spellChecker;
	}

	/*
	 * (非 Javadoc)
	 * 
	 * @see jp.devmen.spellchecker.model.ISpellChecker#check(java.lang.String)
	 */
	@Override
	public List<String> check(String word) {
		try {
			List<RuleMatch> matchs = langTool.check(word);
		} catch (IOException e) {
			// 研修用なので読み捨てます。
			e.printStackTrace();
		}

		return null;
	}
}
