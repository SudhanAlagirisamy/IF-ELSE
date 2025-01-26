import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String hasVoterCard = scanner.next();
       if(age<18){
            System.out.print("Not Eligible to Vote");
        }
        else 
        {
            if (age>=18)
            {
            
            if(hasVoterCard.equals("Yes"))
            {
                System.out.print("Eligible and can Vote");

            }
            else{
                System.out.print("Get a Voter ID");
            }
        }
        }

    }
}
