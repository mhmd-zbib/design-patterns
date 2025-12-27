package creational.abstractfactory;

/**
 * VictorianFurnitureFactory creates victorian style furniture (VictorianChair,
 * VictorianSofa).
 *
 * This factory encapsulates the creation of victorian furniture products.
 */
public class VictorianFurnitureFactory implements FurnitureFactory {
  @Override
  public Chair createChair() {
    return new VictorianChair();
  }

  @Override
  public Sofa createSofa() {
    return new VictorianSofa();
  }
}
