import java.util.Scanner;

public class FixedAccount {
    int accountNo;
    String accountHolder;
   double Principal;
    double interestRate;
    int duration;

    public FixedAccount( int accountNo, String  accountHolder, double principal, double interestRate, int duration) {
    this.accountNo= accountNo;
    this.accountHolder = accountHolder;
    this.Principal= principal;
    this.interestRate = interestRate;
    this.duration= duration;
    }

    public FixedAccount() {

    }


    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getPrincipal() {
        return Principal;
    }

    public void setPrincipal(double principal) {
       Principal = principal;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
       this.duration = duration;
    }


    public void CalculateInterest() {
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

        if (Principal < 0){
            throw new IllegalArgumentException("Principal amount must not be greater than 0");
        } else if (Principal > 0){
            System.out.println("-");
        }
        else if (duration < 30){
            throw new IllegalArgumentException("Duration must be greater than 30days");
        } else if (duration > 30) {
            System.out.println("-");
        }
        else if (interestRate < 0.05) {
            throw new IllegalArgumentException("Interest rate must be greater than 0.05");
        } else if (interestRate >= 0.01) {
            System.out.println("-");
        }

        System.out.println("AccountHolder: " + getAccountHolder() +
                "\nAccountNumber: " + getAccountNo() +
                "\nAmount: " + getPrincipal() +
                "\nInterestRate: " + getInterestRate() +
                "\nDuration: " + getDuration());





        System.out.println("Your Fixed account interest is: " + Principal * interestRate * duration/100);
    }


}