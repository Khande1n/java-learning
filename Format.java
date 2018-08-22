import java.util.*;


public class Format {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String sone = s.next();
		int ione = s.nextInt();
		s.nextLine();
		String stwo = s.next();
		int itwo = s.nextInt();
		s.nextLine();
		String sthree = s.next();
		int ithree = s.nextInt();

		System.out.println("================================\n");
		System.out.printf("%-15s %03d% \n", sone, ione);
		System.out.printf("%-15s %03d% \n", stwo, itwo);
		System.out.printf("%-15s %03d% \n", sthree, ithree);
		System.out.println("================================\n");
	}
}
