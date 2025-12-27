package Creational.Builder;

/**
 * Director class defines the order in which to call building steps.
 * This class is important in the Builder pattern to encapsulate the
 * construction logic.
 */
public class BodyDirector {
  private BodyBuilder builder;

  public BodyDirector(BodyBuilder builder) {
    this.builder = builder;
  }

  /**
   * Constructs the body by calling the builder's steps in a specific order.
   */
  public void constructBody() {
    builder.buildHead();
    builder.buildTorso();
    builder.buildArms();
    builder.buildLegs();
  }
}
