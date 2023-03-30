package week1.day2;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
int b=1;
int sum=0;
int n=8;

System.out.println(a);
System.out.println(b);

for (int i = 0; i < n; i++) { 
	sum=a+b;
	System.out.println(sum);
	a=b;
	b=sum;
}
	
}
	}


