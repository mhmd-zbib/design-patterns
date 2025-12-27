# Factory Pattern

## What is the Factory Pattern?

The Factory Pattern is a way to create objects without having to specify the exact class of the object that will be created. Instead, you use a factory (a method or class) to handle the creation for you.

## When & Why Use It?

- When you have a bunch of related classes and you want to decide which one to use at runtime.
- When you want to keep the code that creates objects separate from the code that uses them.
- When you want to make your code more flexible and easier to extend (add new types without breaking old code).

## How Does It Work?

You define an interface (or abstract class) for the type of object you want to create, and then have one or more factory classes/methods that return instances of those types. The client code just asks the factory for an object, and doesn't care about the details.

## Why Bother?

- Cleaner code: No big switch/case or if/else blocks for object creation.
- Easier to add new types: Just add a new class and update the factory.
- Decouples creation from usage: Makes your code more modular and testable.

## Example

In this folder, you'll find code that shows how to use the Factory pattern to create different types of transport (like Truck, Ship, Plane) without the client code needing to know the details.

## Real World Example

Think about ordering a ride from a transportation app (like Uber or Bolt). You just say you want a ride, but you don’t care if it’s a car, a van, or a bike—the app decides what’s available and sends the right vehicle. The app acts as a factory: you ask for a ride, and it gives you the right type of transport without you worrying about the details. This is exactly what the Factory Pattern does in code!

---

## Imagine This

You have a truck, a ship, and a plane. They all do shipping, but each one does it in its own way:

- Truck: Good for land, medium weight, medium cost.
- Ship: Huge loads, slow, super cheap.
- Plane: Fast, expensive, strict weight limits.

The Factory Pattern lets you pick the right one for the job, without your main code caring about the details. Each class (TruckTransport, ShipTransport, PlaneTransport) handles its own logic, so you can add or change types easily.

We put the main explanation in each class, not every function, because what matters is what makes each transport unique—not the tiny details of every method. The big picture is why these classes exist and how they fit the pattern.

---

This is a super common pattern in real-world code, especially when you want to keep things flexible and open for change. Check out the code for practical examples!
