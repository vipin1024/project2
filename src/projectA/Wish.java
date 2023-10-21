package projectA;

import java.util.Scanner;

public class Wish {

	public static void main(String[] args) {
System.out.println("Enter time: ");
		Scanner sc= new Scanner(System.in);
int a= sc.nextInt();
		
		Solution1 obj = new Solution1();
obj.wishThem(a);
	}

}
class Solution1 {
	void wishThem (int time) {
	if (time>=5 && time<12) {
		System.out.println("Good morning");
	}
	else if(time>=12 && time<16) {
		System.out.println("Good afternoon");
	}
	else if (time>=16 && time< 20)
	{
		System.out.println("Good evening");
	}
	else if (time>=20 && time<23) {
		System.out.println("Good night");
	}
	else {
		System.out.println("Invalid time");
	}
	
	}
}

