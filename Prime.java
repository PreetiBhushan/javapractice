import java.util.Scanner;
public  class Prime {
	public static void main(String[] args) {
	Scanner sc1 = new Scanner (System.in)	;
	System.out.print("Enter a number:" );
	int a = sc1.nextInt();
	boolean num =false;
	for (int i=2;i<=a;i++) {
		if(a%i==0) {
			num=true;
		}
	}
	if(num) {
		System.out.println(a+ " Is a prime number.");
		}
	else {
		System.out.println(a+ " Is not a prime number.");
	}
	}
	}
