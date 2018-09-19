import java.util.*;

public class EndOfFile {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		while(sc.hasNextLine()){
		    String line = sc.nextLine();
		    Scanner scannedLine = new Scanner(line);
		    
			try {
			    String word = scannedLine.next();
				while(scannedLine.hasNext()) {
					word += " " + scannedLine.next();
				}
				System.out.printf("%d" +" "+ "%s %n", num, word);
				num++;
				scannedLine.close();
			}
			catch (IllegalStateException e) {
				sc.close();
			}
			
		}
	}
}