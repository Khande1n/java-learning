import java.util.*;
import java.lang.*;
import java.io.*;


public class Datatypes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        for(int i = 0; i < loop; i++) {
            try {
                long num = sc.nextLong();
                System.out.printf("%d can be fitted in:%n", num);
                if (num >= -Math.pow(2, 7) && num <= (Math.pow(2, 7) - 1 )) {
                    System.out.println("* byte");
                }
                if (num >= -Math.pow(2, 15) && num <= (Math.pow(2, 15) - 1 )) {
                    System.out.println("* short");
                }
                if (num >= -Math.pow(2, 31) && num <= (Math.pow(2, 31) - 1 )) {
                    System.out.println("* int");
                }
                if (num >= -Math.pow(2, 63) && num <= (Math.pow(2, 63) - 1 )) {
                    System.out.println("* long");
                }
            }
            catch(InputMismatchException e) {
                String str = sc.next();
               System.out.printf("%s can't be fitted anywhere.%n", str);
            }
            catch(NoSuchElementException e) {
               System.out.println("No element present");
            }
        }
    }
}