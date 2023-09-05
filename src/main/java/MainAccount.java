import java.util.InputMismatchException;
import java.util.Scanner;
public class MainAccount {

    public static void main(String[] args) {
        FixedAccount account = new FixedAccount();
        SavingsAccount account2 = new SavingsAccount() ;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("FixedAccount enter 1 \nSavingsAccount 2 \n>>");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    account.CalculateInterest();
                    break;
                case 2:
                    account2.CalculateInterest();
                    break;
                default:
                    throw new InputMismatchException("Unexpected value: input should be between 1 and 2");
            }
        } catch (InputMismatchException e) {
            System.out.println("Something went wrong: Input Mismatch \nReload and try again.");
        }



    }
}
