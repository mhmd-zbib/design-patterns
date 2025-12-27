package creational.abstractfactory;

/**
 * ModernChair is a concrete implementation of Chair.
 * Represents a modern style chair with its own behavior.
 */
public class ModernChair implements Chair {
  @Override
  public void sitOn() {
    System.out.println("You are sitting on a modern chair.");
  }
}
