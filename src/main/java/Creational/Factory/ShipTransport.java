package behavioral.factory;

/**
 * ShipTransport is another way to ship stuff. It follows ITransport, but does
 * things the ship way (huge weight, slow, cheap, no carbon penalty).
 *
 */
public class ShipTransport implements ITransport {
    public Double getBasePrice() {
        return 500.0;
    }

    public Double getWeightLimit() {
        return Double.MAX_VALUE;
    }

    public Double getCostPerKm() {
        return 1.0;
    }

    public Integer getCarbonPenalty() {
        return 0;
    }
}
