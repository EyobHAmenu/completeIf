import java.util.Scanner;

public class complete {
        public static void main(String[] args) {
            /*
            This code accept number from user and check if the number is
            greater than, less than, or equal to 10.
             */
            int number;
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter any number ?");
            number = sc.nextInt();
            if (number > 10) {
                System.out.println("Number is greater than 10.");
            }
            else if (number < 10) {
                System.out.println("Number is less than 10.");
            } else{
                System.out.println("Number is equal to 10.");
            }

            System.out.println("Application finished.");
        }
}
