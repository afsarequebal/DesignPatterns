package strategyPattern;

public abstract class Student {
  protected TravelBehavior travelBehavior;
  
  protected Student(TravelBehavior travelBehavior) {
    this.travelBehavior = travelBehavior;
  }
  
  public void executeTravel() {
    travelBehavior.travel();
  }
}
