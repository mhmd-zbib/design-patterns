package creational.abstractfactory;

/**
 * Chair is the contract for all types of chairs (modern, victorian, etc).
 *
 * The idea: every chair can be sat on, but each has its own style and behavior.
 * This interface lets us treat all chairs the same in the main code, while
 * allowing different implementations for each style.
 */
public interface Chair {
  void sitOn();
}
