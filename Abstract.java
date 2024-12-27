abstract class Animal
{
  abstract void sound();

  public void sleep() 
  //if it also includes static keyword, 
  //we can directly call it from main method using Animal.sleep();
  {
    System.out.println("Sleeping");
  }
}

class Cat extends Animal
{
  public void sound()
  {
    System.out.println("Meow Meow Meow !");
  }
}

class Dog extends Animal
{
  public void sound()
  {
    System.out.println("Bow Bow Bow !");
  }

  @Override
  public void sleep()
  {
    System.out.println("Your pet dog Jimmy is dreaming !!");
  }
}


public class Abstract {
  public static void main(String[] args) {

    Cat cat = new Cat();
    cat.sound();
    cat.sleep();
    //Animal animal = new Animal (); -> abstract class cannot have object, it shows error
    //Animal.sleep(); this is allowed if sleep method is set to static , we can directly call it

    Dog dog = new Dog();
    dog.sound();
    dog.sleep();

    
  }
  
}
