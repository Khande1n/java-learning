import java.util.*;
import java.lang.*;

public class Calr {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int month = sc.nextInt();
    int day = sc.nextInt();
    int year = sc.nextInt();
    // System.out.printf("%d %d %d", month, day, year);

    Calendar c = Calendar.getInstance();
    c.clear();
    c.set(year, month, day);
    System.out.println(c.getTimeZone());
    System.out.println(c.getTime());
    Locale locale = Locale.getDefault();
    String dayWekk = c.getDisplayName(Calendar.DAY_OF_MONTH, 2, locale);
    System.out.printf("%s", dayWekk);
    // sc.close();

  }
}