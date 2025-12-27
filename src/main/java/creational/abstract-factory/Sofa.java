package creational.abstractfactory;

/**
 * Sofa is the contract for all types of sofas (modern, victorian, etc).
 *
 * The idea: every sofa can be lied on, but each has its own style and behavior.
 * This interface lets us treat all sofas the same in the main code, while
 * allowing different implementations for each style.
 */
public interface Sofa {
  void lieOn();
}
