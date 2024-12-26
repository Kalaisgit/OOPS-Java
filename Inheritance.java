class Vehicle //Base class
{
  String Numberplate;

  public Vehicle( String Numberplate)
  {
    this.Numberplate = Numberplate;
  }

  public void Honk()
  {
    System.out.println(" Honks !!");
  }

  public void printNumberPlate()
  {
    System.out.println("Number plate : "+Numberplate);
  }

}

class Car extends Vehicle
{
  String CarNumberPlate; 
  private int seats; //encapsulation

  public Car(String CarNumberPlate)
  {
    super(CarNumberPlate);
  }

  public void setCarSeats(int seats)
  {
    this.seats = seats;
  }

  public void printCarSeats()
  {
    System.out.println("Seats in car:"+seats);
  }
}

class Bus extends Vehicle
{

  private int seats;
  
  public Bus( String BusNumberPlate)
  {
    super(BusNumberPlate);
  }

  public void setBusSeats(int seats)
  {
    this.seats = seats;
  }

  public void printBusSeats()
  {
    System.out.println("Seats in car:"+seats);
  }
}


public class Inheritance {
  public static void main(String[] args)
  {
     Car car = new Car("KAB234");
     car.Honk();
     car.printNumberPlate();
     car.setCarSeats(4);
     car.printCarSeats();

     Bus bus = new Bus("KAB234456");
     bus.Honk();
     bus.printNumberPlate();
     bus.setBusSeats(20);
     bus.printBusSeats();
  }
}
