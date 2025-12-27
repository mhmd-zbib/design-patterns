/**
 * Client demonstrates the usage of the Abstract Factory pattern for furniture.
 *
 * The client code works with factories and products only through their abstract interfaces.
 * This allows easy switching between different families of products (modern, victorian) without changing the client code.
 */
package creational.abstractfactory;

public class Client {
  public static void main(String[] args) {
    FurnitureFactory modernFactory = new ModernFurnitureFactory();
    Chair modernChair = modernFactory.createChair();
    Sofa modernSofa = modernFactory.createSofa();
    modernChair.sitOn();
    modernSofa.lieOn();

    FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
    Chair victorianChair = victorianFactory.createChair();
    Sofa victorianSofa = victorianFactory.createSofa();
    victorianChair.sitOn();
    victorianSofa.lieOn();
  }
}
