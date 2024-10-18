package Main;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank ();

//        Checking checkingAccount1 = new Checking();
//
//        Customer customer1 = new Customer("John", "Doe" , checkingAccount1);
//
//        bank.addCustomer(customer1);
//
//        customer1.getAccount().deposit(2000);
//
//        customer1.getAccount().withdraw(100);
//
//        customer1.getAccount().withdraw(50);
//
//        customer1.getAccount().deposit(60);
//
//        customer1.getAccount().deposit(-50);
//
//
//        bank.printAllCustomers();
//
//        Savings savingsAccount1 = new Savings();
//
//        Customer customer2 = new Customer("Ryan","Boodhoo",savingsAccount1);
//
//        bank.addCustomer(customer2);
//
//        customer2.getAccount().deposit(500);
//
//        customer2.getAccount().withdraw(1000000);
//
//        customer2.getAccount().withdraw(100);
//
//        bank.printAllCustomers();

        Checking checkingAccount2 = new Checking();

        Customer customer3 = new Customer("The","Batman",checkingAccount2);

        bank.addCustomer(customer3);

        customer3.getAccount().deposit(1000);

        customer3.getAccount().withdraw(100);

        bank.printAllCustomers();

       Account.printTotalNumberOfAccounts();
    }
}
