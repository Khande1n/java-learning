import java.util.*;
import java.lang.*;
import java.io.*;

public class Geeks {
	public static void main (String[] args) {
		//code
		//read the input
		//first line For loop times
		// second line a and (N-1)d, here d will be calculated
		//third line N
		//now print Nth term, a + (N-1)d
		Scanner scan = new Scanner (System.in);
		int T = scan.nextInt();
		for(int n=0; n<T; n++){
		    int A = scan.nextInt();
		    int B = scan.nextInt();
		    int N = scan.nextInt();
		    int d = B-A;
		    System.out.println(A + (N-1)*d);
		    A=0;
		    B=0;
		    N=0;
		    d=0;
		    
		}
	}
}
