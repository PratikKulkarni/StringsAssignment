package neebalurukul.day8;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a string");
		String s=sc.next();
		int count=0;
		int n=s.length();
		String s1="";
		for(int i=0;i<(n-1);i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				if(count>=2) {
					count++;
				}
				else {
					count=2;
				}
			}
			else {
				if(count>=2) {
					s1=s1+s.charAt(i)+count;
					count=1;
				}else {
					s1=s1+s.charAt(i);
				}
			}
		}
		if(count>=2) {
			s1=s1+s.charAt(n-1)+count;
		}
		else {
			s1=s1+s.charAt(n-1);
		}
		System.out.println("Compressed string: "+s1);
	}

}
