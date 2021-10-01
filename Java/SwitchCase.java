package CaseControl;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, num1, num2;
        
            while(true){
                System.out.println("Press 1 For Add");
                System.out.println("Press 2 For Sub");
                System.out.println("Press 3 For Multiplication");
                System.out.println("Press 4 For Divison");
                System.out.println("Press 0 To Exit");
                System.out.println("Enter Your Choice : ");
                choice = sc.nextInt();
                sc.close();
                switch (choice) {
                    case 1:
                        System.out.println("Enter the First and Second Number Respectively : ");
                        num1 = sc.nextInt();
                        num2 = sc.nextInt();
                        System.out.println("Sum of the Giver numbers is : " + (num1 + num2));
                        break;

                    case 2:
                        System.out.println("Enter the First and Second Number Respectively : ");
                        num1 = sc.nextInt();
                        num2 = sc.nextInt();
                        System.out.println("Difference of the Giver numbers is : " + (num1 - num2));
                        break;    
            
                    case 3:
                        System.out.println("Enter the First and Second Number Respectively : ");
                        num1 = sc.nextInt();
                        num2 = sc.nextInt();
                        System.out.println("Multiplication of the Giver numbers is : " + (num1 * num2));
                        break;

                    case 4:
                        System.out.println("Enter the First and Second Number Respectively : ");
                        num1 = sc.nextInt();
                        num2 = sc.nextInt();
                        System.out.println("Division of the Giver numbers is : " + (num1 / num2));
                        break; 
                    case 0:
                        System.exit(0);
                        break;

                    default:
                     System.out.println("Enter the correct Choice.");
                        break;
                }           
        }
    }
    
}