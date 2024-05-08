package myexamples;

public class Primenumber {
	public static void main(String[] args) {
		int n=51;
		boolean a=false;
		for(int i=2;i<=n;i++) {
			if(n % i == 0) {
				a=true;
			}
		}
		if(!a) {
		System.out.println(n+" is prime number");
		}
		else { 
		System.out.println(n+" is not prime number");
		}
		}
}


