package behavioral.factory;

/**
 * TruckTransport is the land option. It follows ITransport, but does things the
 * truck way (medium weight, medium cost, some carbon penalty).
 *
 */
public class TruckTransport implements ITransport {
    public Double getBasePrice() {
        return 50.0;
    }

    public Double getWeightLimit() {
        return 20000.0;
    }

    public Double getCostPerKm() {
        return 5.0;
    }

    public Integer getCarbonPenalty() {
        return 20;
    }
}