package creational.abstractfactory;

/**
 * ModernSofa is a concrete implementation of Sofa.
 * Represents a modern style sofa with its own behavior.
 */
public class ModernSofa implements Sofa {
  @Override
  public void lieOn() {
    System.out.println("You are lying on a modern sofa.");
  }
}
