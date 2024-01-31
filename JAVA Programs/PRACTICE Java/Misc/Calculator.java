import java.util.Scanner;
public class Calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter two numbers");
            double num1=sc.nextInt();
            double num2=sc.nextInt();
            if(num1==0 && num2==0){
                break;
            }
            System.out.println("Operation:");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");

            System.out.println("Choose operation from above");
            int option=sc.nextInt();

            switch(option){
                case 1: 
                    System.out.println("Sum is: " + (num1+num2));
                    break;
                case 2:
                    System.out.println("Substracted value is: " + (num1-num2));
                    break;
                case 3:
                    System.out.println("Product is: "  + (num1*num2));
                    break;
                case 4:
                    System.out.println("Quotient is: " + ((double)num1 / (double)num2));
                    break;
                case 5:
                    System.out.println("Modulus is: " + (num1%num2));
                    break;
                case 6:
                    System.out.println("Power is: "+ (Math.pow(num1,num2)));
                default:
                    System.out.println("Please Enter vaild Option");
            }
            if(option<1 || option>6){
                break;
            }
        }
        

        
    }
}