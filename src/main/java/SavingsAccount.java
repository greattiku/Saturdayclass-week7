import java.util.Scanner;

public class SavingsAccount extends FixedAccount {

    double savingsBalance;
    int interest;
    public SavingsAccount (double savingsBalance, int interest, int accountNo, String accountHolder, double principal, double interestRate, int duration){
        super(accountNo, accountHolder, principal, interestRate, duration);
        this.savingsBalance= savingsBalance;
        this.interest= interest;
    }

    public SavingsAccount() {

    }


    public void deposit(double principal){
        savingsBalance += principal;
   }

    public void CalculateInterest(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter AccountNo: ");
        setAccountNo(sc.nextInt());

        System.out.println("Enter AccountName: ");
        setAccountHolder(sc.nextLine());

        System.out.println("Enter Principal amount: ");
        setPrincipal(sc.nextDouble());

        System.out.println("Enter Interestrate: ");
        setInterestRate(sc.nextDouble());

        System.out.println("Enter duration");
        setDuration(sc.nextInt());

        if (savingsBalance >= Principal){
            double Interest = (Principal * interestRate * duration) / 100;
            System.out.println("Your savings account Interest is: " + Interest );
            interest++;
        }


    }
}