
//In below method's properties we have two options for savingAccount and loanAccout
//1.make properties public
//2.make private properties variables and make getter and setter method

class account{
    String accountNumber;
    String name;
    String address;
    String phoneNumber;
    String dateOfBirthday;

    double balance;

    //constructor

    public account(String accountNumber, String name, String address, String phoneNumber, String dateOfBirthday, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirthday = dateOfBirthday;
        this.balance = balance;
    }

    //GETTER AND SETTER METHODS

    //GETTER

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public double getBalance() {
        return balance;
    }


    //SETTER

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class savingsAccount extends account{

    public double fixDepoAmmount;
    public double depositAmmount;
    public double widrawAmmount;

    public void setFixDepoAmmount(double fixDepoAmmount) {
        this.fixDepoAmmount = fixDepoAmmount;
    }

    public void setDepositAmmount(double depositAmmount) {
        this.depositAmmount = depositAmmount;
    }

    public void setWidrawAmmount(double widrawAmmount) {
        this.widrawAmmount = widrawAmmount;
    }

    public savingsAccount(String accountNumber, String name, String address, String phoneNumber, String dateOfBirthday, double balance) {
        super(accountNumber, name, address, phoneNumber, dateOfBirthday, balance);
    }

    public void deposit(){
        balance= depositAmmount+balance;

    }
    public double widraw(double widrawAmmount){
        return balance-widrawAmmount;
    }

    public double fixdeposit(double fixDepoAmmount){
        return balance-fixDepoAmmount;
    }
}

class loanAccount extends account{

    public double EMIAmmount;
    public loanAccount(String accountNumber, String name, String address, String phoneNumber, String dateOfBirthday, double balance) {
        super(accountNumber, name, address, phoneNumber, dateOfBirthday, balance);
    }

    public double payEMI(double EMIAmmount){
        return EMIAmmount;
    }

    public double topUpLoan(double topUpLoanAmt){
        return topUpLoanAmt;
    }

}

public class AccountInheritance {
    public static void main(String[] args) {


        savingsAccount sa=new savingsAccount("20112003","amar","24,swaminarayan colony, unjha","91579509110","18-04-03",5000.00);
        sa.setDepositAmmount(1000.00);
        sa.deposit();

        System.out.println("Total balance after deposit "+sa.getBalance());

    }
}
