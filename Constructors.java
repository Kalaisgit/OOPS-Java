
class BankAccount
{
String name;
double balance;

public BankAccount()
{
  System.out.println("Default constructor called");
  name = "Kalai";
  balance = 100.25;
}

public BankAccount(String Name, double _balance)
{
  System.out.println("Parameterised constructor called");
  name = Name;
  balance = _balance;
}

public void PrintInfo()
{
  System.out.println(name+"'s balance :"+ balance);
}

public BankAccount(BankAccount obj2)
{
  System.out.println("Copy constructor called");
  name = obj2.name;
  balance = obj2.balance;
}

}


public class Constructors {

  public static void main(String[] args)
  {

    BankAccount c1 = new BankAccount();
    c1.PrintInfo();
    
    
    BankAccount c2 = new BankAccount("Raj",88.5);
    c2.PrintInfo();

    BankAccount c3 = new BankAccount(c2);
    c3.PrintInfo();


  }
  
}
