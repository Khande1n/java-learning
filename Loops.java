import java.util.*;
import java.math.*;
import java.lang.Math;

public class Loops{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();

		for(int i = 0; i < loop; i++){
			sc.nextLine();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
		    int second = 0;
			for(int j = 0; j < n; j++){
				second += (int)Math.pow(2, j) * b;
                System.out.printf("%d ", a + second);
			}
            second = 0;
            System.out.printf("%n");
		}
	}
}