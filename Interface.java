interface animals
{
  void mammal();
  void reptiles();
  //abstract method even without specifying the keyword, every method inside interface is abstract
  //no need of definition of method, must be implemented in derived classes
}

interface intellectual
{
  void abilities(); 
  //abstract method even without specifying the keyword, every method inside interface is abstract
  //no need of definition of method, must be implemented in derived classes
}

class Bat implements animals
{
  public void mammal()
  {
      System.out.println("They give birth to babies and feed them milk");
  }

  public void reptiles()
  {
    System.out.println("They are not reptiles");
  }
  

}

class Human implements animals,intellectual //allows inheritance of multiple interfaces
{
  public void mammal()
  {
      System.out.println("They give birth to babies and feed them milk");
  }

  public void abilities()
  {
    System.out.println("They have the ability to think and behave");
  }

  public void reptiles()
  {
    System.out.println("They are not reptiles");
  }
}



public class Interface {
    public static void main(String[] args) 
    {
       Human human = new Human();
       human.mammal();
       human.abilities();
       human.reptiles();


       Bat bat = new Bat();
       bat.mammal();
       bat.reptiles();
  }
  
}
