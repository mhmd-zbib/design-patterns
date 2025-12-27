# Abstract Factory Pattern

## What is the Abstract Factory Pattern?

The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes. It lets you produce sets of objects that are designed to work together, while keeping the actual creation logic separate from the client code.

## When & Why Use It?

- When you need to create families of related objects (e.g., UI components for different operating systems).
- When you want to ensure that products from the same family are used together.
- When you want to decouple the creation of objects from their usage, making your code more flexible and extensible.

## How Does It Work?

You define an abstract factory interface with methods for creating each kind of product. Concrete factory classes implement this interface to produce products that belong to a specific family. The client code uses the abstract factory to get products, without knowing the concrete classes.

## Why Bother?

- Ensures consistency among products in a family.
- Makes it easy to swap out entire families of products.
- Decouples product creation from usage, improving modularity and testability.

## Example

Let's say you want to create families of furniture for different styles—Modern and Victorian. Each family includes a Chair and a Sofa. The Abstract Factory pattern lets you create a set of related furniture objects that match the chosen style, without mixing Modern chairs with Victorian sofas.

### Abstract Factory Interface
```java
public interface FurnitureFactory {
	Chair createChair();
	Sofa createSofa();
}
```

### Concrete Factories
```java
public class ModernFurnitureFactory implements FurnitureFactory {
	public Chair createChair() {
		return new ModernChair();
	}
	public Sofa createSofa() {
		return new ModernSofa();
	}
}

public class VictorianFurnitureFactory implements FurnitureFactory {
	public Chair createChair() {
		return new VictorianChair();
	}
	public Sofa createSofa() {
		return new VictorianSofa();
	}
}
```

### Product Interfaces and Implementations
```java
public interface Chair {
	void sitOn();
}

public class ModernChair implements Chair {
	public void sitOn() {
		System.out.println("Sitting on a modern chair.");
	}
}

public class VictorianChair implements Chair {
	public void sitOn() {
		System.out.println("Sitting on a Victorian chair.");
	}
}

public interface Sofa {
	void lieOn();
}

public class ModernSofa implements Sofa {
	public void lieOn() {
		System.out.println("Lying on a modern sofa.");
	}
}

public class VictorianSofa implements Sofa {
	public void lieOn() {
		System.out.println("Lying on a Victorian sofa.");
	}
}
```

### Client Code
```java
public class FurnitureApp {
	private final Chair chair;
	private final Sofa sofa;

	public FurnitureApp(FurnitureFactory factory) {
		chair = factory.createChair();
		sofa = factory.createSofa();
	}

	public void showRoom() {
		chair.sitOn();
		sofa.lieOn();
	}
}

// Usage:
// FurnitureFactory factory = new ModernFurnitureFactory();
// FurnitureApp app = new FurnitureApp(factory);
// app.showRoom();
```

## Real World Example

Think of an online furniture store that lets you pick a style (Modern or Victorian). When you choose a style, all the furniture in your room matches that style. The Abstract Factory ensures you get a matching set, not a mix of different styles.

---

## Imagine This

You want to furnish a room with a consistent look. The Abstract Factory Pattern lets you create a family of related furniture objects (chair, sofa, table, etc.) for a specific style, ensuring everything matches. You can add new styles or furniture types without changing the client code.

---

This is a powerful pattern for building scalable and maintainable code, especially when you need to support multiple families of related products. Check out the code for practical examples!
