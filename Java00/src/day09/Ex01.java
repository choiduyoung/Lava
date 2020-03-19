package day09;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		char no1 = '0';
		char no2 = 'A';
		char[] no3 = {'가','나','다','라','마','바','사','아','자','차'};
		char[][] ch1 = new char[3][10];
		
		for(int i = 0; i < ch1.length; i++) {
			for(int j = 0; j < ch1[i].length; j++) {
			ch1[0][j] = (char)(no1+j);
			ch1[1][j] = (char)(no2+j);
			ch1[2][j] = no3[j];
		
			
		}
	}
		char[][] ch2 = new char[2][10];
		for(int i = 0; i < ch1.length; i++) {
			for(int j = 0; j < ch1[i].length; j++) {
				ch2[0][j] = ch1[0][j];
				ch2[1][j] = ch1[1][j];
			}
		}
		char[][] ch3 = new char[2][10];
		for(int i = 0; i < ch1.length; i++) {
			for(int j = 0; j < ch1[i].length; j++) {
				ch3[0][j] = ch1[0][j];
				ch3[1][j] = ch1[2][j];
			}
		}
		
		char[][] ch4 = new char[10][3];
		for(int i = 0; i < ch1[0].length; i++) {
			for(int j = 0; j < ch1.length; j++) {
			ch4[i][0] = ch1[0][i];
			ch4[i][1] = ch1[1][i];
			ch4[i][2] = ch1[2][i];
			
		}
		}
		char[][] ch5 = new char[10][2];
		for(int i = 0; i < ch1[0].length; i++) {
			for(int j =0; j < ch1.length; j++) {
				ch5[i][0] = ch1[0][i];
				ch5[i][1] = ch1[1][i];
			}
		}
		char[][] ch6 = new char[10][2];
		for(int i = 0; i < ch1[0].length; i++) {
			for(int j = 0; j < ch1.length; j++) {
				ch6[i][0] = ch1[0][i];
				ch6[i][1] = ch1[2][i];
				
			}
		}
//		System.out.println(Arrays.deepToString(ch1));
		for(char[] a : ch1) {
			System.out.println(a);
		}
		System.out.println();
//		System.out.println(Arrays.deepToString(ch2));
		for(char[] a : ch2) {
			System.out.println(a);
		}
		System.out.println();
//		System.out.println(Arrays.deepToString(ch3));
		for(char[] a : ch3) {
			System.out.println(a);
			
		}
		 System.out.println();
		for(char[] a : ch4) {
			System.out.println("["+a[0]+"]["+ a[1] +"][" + a[2] + "]");
		}
		System.out.println();
//		System.out.println(Arrays.deepToString(ch5));
		for(char[] b : ch5) {
			System.out.println("["+b[0]+"]["+ b[1] +"]");
		}
		System.out.println();
//		System.out.println(Arrays.deepToString(ch6));
		for(char[] a : ch6) {
			System.out.println("["+a[0]+"]["+ a[1] +"]");
		}
	
		System.out.println("\n-----------------------------------------------------------------------------------------------------------------------");
	}
}
