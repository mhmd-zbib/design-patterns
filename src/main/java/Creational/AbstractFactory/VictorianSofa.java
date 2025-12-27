package creational.abstractfactory;

/**
 * VictorianSofa is a concrete implementation of Sofa.
 * Represents a victorian style sofa with its own behavior.
 */
public class VictorianSofa implements Sofa {
  @Override
  public void lieOn() {
    System.out.println("You are lying on a victorian sofa.");
  }
}
