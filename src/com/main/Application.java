package com.main;

public class Application {

	public static void main(String[] args) {
//		String[] array = new String[] {"U","D","D","D","U","D","U","U"};
//	    int vadi=0;
//		int seaLevel=0;
//		int birOncekiSeviye;
//		
//		for (String string : array) {
//			birOncekiSeviye=seaLevel;
//			if(string.equals("U")) {
//				seaLevel++;
//			}
//			else if(string.equals("D")){seaLevel--;}
//			if(seaLevel==0 && birOncekiSeviye<0) {
//				vadi++;
//			}
//			
//		}
//		System.out.println("vadi :" + vadi);
		String path = "DDUDUDUUDUDDDUUDUU";
		int level=0;
		int birOncekiSeviye=0;
		int vadi=0;
		for (int i = 0; i < path.length(); i++) {
			birOncekiSeviye=level;
			if(path.substring(i,i+1).equals("U")) level++; else level--;
			if(level==0 && birOncekiSeviye<0) {
				vadi++;
			}
		}
		System.out.println("vadi = " + vadi);
	}

}
