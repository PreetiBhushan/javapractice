import java.util.Scanner;
public class switchcase {
    public static void main(String[] args){
        int choice;
        System.out.println("Pick one: 1.Hi\t2. Hey\t3. Hello\t");
        Scanner sn = new Scanner(System.in);
        choice = sn.nextInt();
        switch(choice)
        {
            case 1: System.out.println("You've chosen Hi!");
                    break;
            case 2: System.out.println("You've chosen Hey!");
                    break;
            case 3: System.out.println("You've chosen Hello!"); 
                    break;
            default:System.out.println("Invalid choice!!");
        }
             
    }
}
