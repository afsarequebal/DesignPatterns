package strategyPattern;

public class TravelByBus implements TravelBehavior {

  @Override
  public void travel() {
   System.out.println("Lets travel by Bus");
  }

}
