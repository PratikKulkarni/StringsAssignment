package neebalurukul.day8;

import java.util.Scanner;

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		String s=sc.nextLine();
		int n=s.length();
		String s1="";
		String s2="";
		String[] str_arr=new String[100];
		int ind=0;
		for(int i=0;i<n;i++) {
			if((s.charAt(i)==' ') || (s.charAt(i)=='.')) {
				if((s2.equals("")) || (s2.equals("."))) {
					s2="";
					continue;
				}
				else {
					str_arr[ind]=s2;
					ind++;
					s2="";
				}
			}else {
				s2=s2+s.charAt(i);
			}
		}
		if((!s2.equals("")) && (!s2.equals('.'))) {
			str_arr[ind]=s2;
			ind++;
		}
		
		
		String temp;
		/*for(int i=0;i<ind;i++) {
			System.out.println(str_arr[i]);
		}*/
		for(int i=0;i<(ind/2);i++) {
			temp=str_arr[i];
			str_arr[i]=str_arr[ind-i-1];
			str_arr[ind-i-1]=temp;
		}
		for(int i=0;i<ind;i++) {
			if(i==(ind-1))
			s1=s1+str_arr[i];
			else {
				s1=s1+str_arr[i]+" ";
			}
		}
		System.out.println(s1);
	}

}
