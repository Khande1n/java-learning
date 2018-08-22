import java.util.*;
import java.math.*;

public class Looping {
	
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
       		int num = sc.nextInt();
        	int multiple = 0;
        	for(int i = 1; i < 11; i++) {
                	multiple = num * i;
                	System.out.printf("%d x %d = %d %n", num, i, multiple);
        	}
		sc.close();
	}
}
