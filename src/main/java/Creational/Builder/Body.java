package Creational.Builder;

/**
 * Product class representing a complex object to be built step by step.
 * This class is used in the Builder design pattern to demonstrate how
 * to construct objects with many optional parts or configurations.
 */
public class Body {
  private String head;
  private String torso;
  private String arms;
  private String legs;

  // Setters for each part
  void setHead(String head) {
    this.head = head;
  }

  void setTorso(String torso) {
    this.torso = torso;
  }

  void setArms(String arms) {
    this.arms = arms;
  }

  void setLegs(String legs) {
    this.legs = legs;
  }

  /**
   * Returns a string representation of the body.
   */
  public String describe() {
    return "Body [head=" + head + ", torso=" + torso + ", arms=" + arms + ", legs=" + legs + "]";
  }
}
