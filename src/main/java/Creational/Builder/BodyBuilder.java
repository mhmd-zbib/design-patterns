package Creational.Builder;

/**
 * Builder interface defines all possible ways to configure a Body object.
 * This interface is essential for the Builder pattern, allowing different
 * concrete builders to construct variations of the Body product.
 */
public interface BodyBuilder {
  void buildHead();

  void buildTorso();

  void buildArms();

  void buildLegs();

  Body getResult();
}
