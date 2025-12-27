package creational.abstractfactory;

/**
 * VictorianChair is a concrete implementation of Chair.
 * Represents a victorian style chair with its own behavior.
 */
public class VictorianChair implements Chair {
  @Override
  public void sitOn() {
    System.out.println("You are sitting on a victorian chair.");
  }
}
