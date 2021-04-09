public class voterage{
  public static void main(String[] args){
    int age;
    System.out.println("Enter your Age: ");
    Scanner s = new Scanner(System.in);
    age = s.nextInt();
    if(age>18)
      System.out .println("Eligible to vote!");
    else 
      System.out.println("Sorry, you're not eligible to vote.");
  }
}

    
