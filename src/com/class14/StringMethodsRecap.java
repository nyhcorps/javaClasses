package com.class14;

public class StringMethodsRecap {

	public static void main(String[] args) {
		// .replace
		
		String str="Syntax Technologies. is your place to study";
		System.out.println(str.replace('y', 'i'));
		
		System.out.println("************************");
		System.out.println(str.replace("your", "My"));
		
		System.out.println("**************************");

		//.replaceAll
		String str2="Video provides a powerful way to help you " + "prove your point. When you click Online Video,"
				+ " you can paste in the embed code for the video you "
				+ "want to add. You can also type a keyword to search "
				+ "online for the video that best fits your document.";;
		System.out.println(str2.replaceAll("way(.*)", ""));
		
		System.out.println("******************************");
		
		String str3="01234Hell987o&&&****^^^^";
		System.out.println(str3.replaceAll("[0-9]", ""));
		System.out.println(str3.replaceAll("[^A-z]", ""));
		
		System.out.println("*********************************");
		System.out.println(str2.replaceFirst(" ", ""));
	}

}
