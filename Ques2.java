package neebalurukul.day8;

import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String s=sc.nextLine();
		System.out.println("Please enter the character to be replaced: ");
		char ch = sc.next().charAt(0);
		System.out.println("Please enter the character to be replaced with: ");
		char ch1 = sc.next().charAt(0);
		int n=s.length();
		String s1="";
		for(int i=0;i<n;i++) {
			if(s.charAt(i)==ch) {
				s1=s1+ch1;
			}
			else {
				s1=s1+s.charAt(i);
			}
		}
		System.out.println("Output String: "+s1);
	}

}
