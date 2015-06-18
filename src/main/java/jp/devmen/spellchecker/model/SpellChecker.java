/**
 * 
 */
package jp.devmen.spellchecker.model;

import java.io.IOException;
import java.util.ArrayList;
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
	public ICheckResult check(String word) {
		List<RuleMatch> matchs = new ArrayList<>();
		try {
			// 単語を検査します。
			matchs = langTool.check(word);
		} catch (IOException e) {
			// 研修用なので読み捨てます。
			e.printStackTrace();
		}

		// matchs の長さが 0 であれば検査は正常です
		// 単語が不正であれば matchs の最初の要素の getSuggestedReplacements() で修正候補が取得できます。
		// see. http://wiki.languagetool.org/java-api
		if (matchs.size() == 0)
		{
			return ICheckResult.create(true, null);
		}

		return ICheckResult.create(false, matchs.get(0).getSuggestedReplacements());
	}
}
