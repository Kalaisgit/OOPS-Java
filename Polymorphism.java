class Vehicles //Base class
{
  String Numberplate;

  public Vehicles( String Numberplate)
  {
    this.Numberplate = Numberplate;
  }

  public void Honking()
  {
    System.out.println(" Honks !!");
  }

  public void printNumberPlate()
  {
    System.out.println("Number plate : "+Numberplate);
  }

}

class Cars extends Vehicles
{
  String CarNumberPlate; 
  private int seats; //encapsulation

  public Cars(String CarNumberPlate)
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

  //overriding - run time polymorphism 
  public void Honking()
  {
    System.out.println("beep beep beep");
  }
}

class Buses extends Vehicles
{

  private int seats;
  
  public Buses( String BusNumberPlate)
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


public class Polymorphism {
  public static void main(String[] args)
  {
     Cars car = new Cars("KAB234");
     car.Honking();
     car.printNumberPlate();
     car.setCarSeats(4);
     car.printCarSeats();

     Buses bus = new Buses("KAB234456");
     bus.Honking();
     bus.printNumberPlate();
     bus.setBusSeats(20);
     bus.printBusSeats();
  }
}
