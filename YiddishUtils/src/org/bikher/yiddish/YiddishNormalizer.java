package org.bikher.yiddish;

import java.util.HashMap;
import java.util.Map;

public class YiddishNormalizer {

	private static final Map<Character, Character> charNormalizationMap;
	
	static {
		charNormalizationMap = new HashMap<Character, Character>();
		charNormalizationMap.put('ן', 'נ');
		charNormalizationMap.put('ם', 'מ');
		charNormalizationMap.put('ך', 'כ');
		charNormalizationMap.put('ף', 'פ');
		charNormalizationMap.put('ץ', 'צ');
	}
	
	public static String normalize(String s) {
		char lastChar = s.charAt(s.length()-1);
		if (charNormalizationMap.containsKey(lastChar)) {
			s = s.substring(0, s.length()-1) + charNormalizationMap.get(lastChar);
		}
		return s;
	}
	
	public static void main(String[] args) {
		String s1 = "קאַץ";
		String s2 = "הילף";
		System.out.println(s2);
		s2 = normalize(s2);
		System.out.println(s2);
	}
}
