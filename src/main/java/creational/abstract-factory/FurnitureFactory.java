package creational.abstractfactory;

/**
 * FurnitureFactory is the abstract factory interface for creating families of
 * related furniture products.
 *
 * The idea: lets you create sets of objects (chairs, sofas) that are designed
 * to work together,
 * while keeping the actual creation logic separate from the client code.
 */
public interface FurnitureFactory {
  Chair createChair();

  Sofa createSofa();
}
