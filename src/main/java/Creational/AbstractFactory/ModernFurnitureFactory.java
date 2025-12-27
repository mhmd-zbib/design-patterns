package creational.abstractfactory;

/**
 * ModernFurnitureFactory creates modern style furniture (ModernChair,
 * ModernSofa).
 *
 * This factory encapsulates the creation of modern furniture products.
 */
public class ModernFurnitureFactory implements FurnitureFactory {
  @Override
  public Chair createChair() {
    return new ModernChair();
  }

  @Override
  public Sofa createSofa() {
    return new ModernSofa();
  }
}
