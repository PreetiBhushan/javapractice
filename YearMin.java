import java.util.Scanner;
public class YearMin{
  public static void main(String[] args){
    double a = 60*24*365;
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Enter the minutes: ");
    double min = sc1.nextDouble();
    long y = (long) (min/a);
    int d = (int) (min/60/24) % 365;
    System.out.println((int) min + "Minutes approximately " +y+ "years and" +d+ "days");
  }
}
