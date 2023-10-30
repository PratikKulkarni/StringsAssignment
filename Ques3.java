package neebalurukul.day8;

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String s=sc.nextLine();
		int flag=0;
		String s1="";
		int n=s.length();
		for(int i=0;i<n;i++) {
			if((s.charAt(i)!=',') && (s.charAt(i)!=' ')) {
				s1=s1+s.charAt(i);
			}
		}
		int n1=s1.length();
		for(int i=0;i<(n1/2);i++) {
			if(((s1.charAt(i)-'0')<=9) && ((s1.charAt(i)-'0')>=0)) {
				if(s1.charAt(i)==s1.charAt(n1-i-1))
					continue;
				else {
					flag=1;
					break;
				}
			}else {
				if(s1.charAt(i)==s1.charAt(n1-i-1)) {
					continue;
				}else {
					if(((s1.charAt(i)-'a')==(s1.charAt(n1-i-1)-'A')) || ((s1.charAt(i)-'A')==(s1.charAt(n1-i-1)-'a'))) {
						continue;
					}else {
						flag=1;
						break;
					}
				}
			}
		}
		if(flag==1) {
			System.out.println("False");
		}else {
			System.out.println("True");
		}
	}

}
