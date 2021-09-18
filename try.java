package forloop;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter base number");
		int x = sc.nextInt();
		System.out.println("enter power number");
		int y = sc.nextInt();
		 long result = 1;
        for(int i = 0;i<y;i++){
        	result = result*x;
        }
		System.out.println("base "+x+" power "+y+" = "+result);
		
		

	}

}
