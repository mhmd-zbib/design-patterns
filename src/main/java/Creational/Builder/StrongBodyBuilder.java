package Creational.Builder;

/**
 * Concrete builder for creating a strong body.
 * Implements the steps defined in BodyBuilder to build a specific variant.
 */
public class StrongBodyBuilder implements BodyBuilder {
  private Body body;

  public StrongBodyBuilder() {
    body = new Body();
  }

  @Override
  public void buildHead() {
    body.setHead("Strong head");
  }

  @Override
  public void buildTorso() {
    body.setTorso("Muscular torso");
  }

  @Override
  public void buildArms() {
    body.setArms("Powerful arms");
  }

  @Override
  public void buildLegs() {
    body.setLegs("Sturdy legs");
  }

  @Override
  public Body getResult() {
    return body;
  }
}
