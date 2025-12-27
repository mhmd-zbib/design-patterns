package Creational.Builder;

/**
 * Concrete builder for creating a slim body.
 * Implements the steps defined in BodyBuilder to build a specific variant.
 */
public class SlimBodyBuilder implements BodyBuilder {
  private Body body;

  public SlimBodyBuilder() {
    body = new Body();
  }

  @Override
  public void buildHead() {
    body.setHead("Slim head");
  }

  @Override
  public void buildTorso() {
    body.setTorso("Lean torso");
  }

  @Override
  public void buildArms() {
    body.setArms("Thin arms");
  }

  @Override
  public void buildLegs() {
    body.setLegs("Long legs");
  }

  @Override
  public Body getResult() {
    return body;
  }
}
