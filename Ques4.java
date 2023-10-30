package neebalurukul.day8;

import java.util.Scanner;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a string containing parantheses: ");
		String s=sc.nextLine();
		int n=s.length();
		int[] a=new int[n];
		int ind=0;
		if(s.charAt(0)=='(') {
			a[ind]=1;
			ind++;
		}
		else {
			a[ind]=2;
			ind++;
		}
		for(int i=1;i<n;i++) {
			if(ind==0)
			{
				if(s.charAt(ind)=='(') {
					a[ind]=1;
					ind++;
				}
				else {
					a[ind]=2;
					ind++;
				}
			}
			else {
				if(s.charAt(i)=='(') {
					a[ind]=1;
					ind++;
				}else {
					if(a[ind-1]==1) {
						ind--;
					}else {
						a[ind]=2;
						ind++;
					}
				}
			}
			
		}
		if(ind==0) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
