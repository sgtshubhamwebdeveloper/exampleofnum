package myexamples;

public class Palindromenumber {
	public static void main(String[] args) {
		int t,sum,n=80,r;
		t=n;
		for(sum=0;n>0;n/=10)
		{
			r=n%10;
			sum=(sum*10)+r;
			
		}
		if(sum==t)
			System.out.println(t+ " is palindrome number ");
		else
			System.out.println(t+ " is not palindrome number ");
		}
}

