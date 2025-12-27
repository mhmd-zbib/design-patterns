package creational.factory;

/**
 * Logistics is the base class for planning deliveries. The whole point here is
 * to use the Factory Method pattern:
 *
 * Instead of hardcoding which transport to use (truck, ship, plane), we let
 * subclasses decide. This keeps the code flexible and open for new types of
 * transport later.
 *
 * Why? Because each transport does shipping in its own way, with its own rules
 * and costs. By using this pattern, we keep the creation logic out of the main
 * flow and make it easy to add or change transport types without breaking
 * everything else.
 */
public abstract class Logistics {

    protected abstract ITransport createTransport();

    public void planDelivery(Double weight, Double distance) {
        ITransport transport = createTransport();

        if (weight > transport.getWeightLimit()) {
            System.out.println("Shipment REJECTED for " + transport.getClass().getSimpleName());
            return;
        }

        double total = transport.getBasePrice() + (distance * transport.getCostPerKm()) + transport.getCarbonPenalty();

        System.out.println("Mode: " + transport.getClass().getSimpleName());
        System.out.println("Total Cost: $" + total);
    }

    public static ITransport initialize(TransportModes mode) {
        return switch (mode) {
            case TransportModes.AIRPLANE -> new PlaneTransport();
            case TransportModes.TRUCK -> new TruckTransport();
            case TransportModes.SHIP -> new ShipTransport();
        };
    }

}