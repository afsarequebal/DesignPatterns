package strategyPattern;

public class TravelByFoot implements TravelBehavior {

  @Override
  public void travel() {
   System.out.println("Lets travel by Foot");
  }

}
