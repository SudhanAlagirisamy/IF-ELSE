import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String completedHighSchool = scanner.next();
        if(age<18){
            System.out.print("Not Eligible to Apply");
        }
        else 
        {
            if (age>=18)
            {
            
            if(completedHighSchool.equals("Yes"))
            {
                System.out.print("Eligible to Apply");

            }
            else{
                System.out.print("Complete High School");
            }
        }   
        }    

    }
}
