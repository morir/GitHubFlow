/**
 * 
 */
package jp.devmen.spellchecker.model;

import java.util.Arrays;
import java.util.List;

/**
 * @author Hiroyuki
 *
 */
public class WordDictionary implements IWordDictionary {

	private static WordDictionary wordDictionary = new WordDictionary();

	private WordDictionary() {
	}

	public static IWordDictionary getInstance() {
		return wordDictionary;
	}

	/*
	 * (非 Javadoc)
	 * 
	 * @see
	 * jp.devmen.spellchecker.model.IWordDictionary#containts(java.lang.String)
	 */
	@Override
	public boolean containts(String word) {
		return false;
	}

	/*
	 * (非 Javadoc)
	 * 
	 * @see
	 * jp.devmen.spellchecker.model.IWordDictionary#addWord(java.lang.String)
	 */
	@Override
	public void addWord(String word) {
	}

	/*
	 * (非 Javadoc)
	 * 
	 * @see jp.devmen.spellchecker.model.IWordDictionary#getAllWord()
	 */
	@Override
	public List<String> getAllWord() {
		return Arrays.asList("Cat", "Dog", "Animal", "Fish", "Cow");
	}

}
