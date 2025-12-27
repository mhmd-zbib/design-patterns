package behavioral.factory;


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