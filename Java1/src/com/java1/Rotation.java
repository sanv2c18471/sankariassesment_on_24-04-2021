package com.java1;

public class Rotation {
	static boolean areRotating(String s1, String s2) {
		return(s1.length()==s2.length() && (s1+s2).indexOf(s2)!=-1);
	}
	
	
public static void main(String[] args) {
	String s1="XYZ";
	String s2="ZXY";
	if(areRotating(s1,s2))
		System.out.println("true");
	else
		System.out.println("false");
}
}
