// Simple Car loan calculator
public class CarLoan {
	public static void main(String[] args) {
    int carLoan = 10_000;
    int loanLength = 3;
    int interestRate = 5;
    int downPayment = 2_000;

    if (loanLength <= 0 || interestRate <= 0) {
      System.out.println("Error! you must take out a valid car loan.");
    } else if (downPayment >= carLoan) {
      System.out.println("The car can be paid in full.");
    } else {
      int remainingBalance = (carLoan - downPayment);
      int months = (loanLength * 12);
      int monthlyBalance = (remainingBalance / months);
      int interest = (monthlyBalance * interestRate) / 100;
      int monthlyPayment = (monthlyBalance + interest);

      System.out.println(monthlyPayment);
    }
	}
}
