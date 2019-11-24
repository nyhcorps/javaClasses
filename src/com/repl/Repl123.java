package com.repl;

public class Repl123 {
	String makeThreeSubstr(String word, int startIndex, int endIndex) {
		String makeThreeSubstr = word.substring(startIndex, endIndex);

		makeThreeSubstr = makeThreeSubstr + makeThreeSubstr + makeThreeSubstr;

		return makeThreeSubstr;
	}

	public static void main(String[] args) {
		Repl123 str = new Repl123();
		System.out.println(str.makeThreeSubstr("hello", 0, 2));

	}

}
