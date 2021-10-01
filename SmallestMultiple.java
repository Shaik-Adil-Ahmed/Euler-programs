package myhcl;

import java.util.Scanner;

public class SmallestMultiple {
	public static void main(String[] args) {
		long a=10;
		int b=1,c=0;
		while(b==1) {
			c=0;
			for(int i=1;i<=20;i++) {
				if(a%i==0) {
					c+=1;
				}
			}
				if(c==20) {
					b=0;
				}
				else {
					a=a+10;
				}
			
		}
		System.out.println(a);
	}

}

	
