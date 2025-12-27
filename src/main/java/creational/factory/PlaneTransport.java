package behavioral.factory;

/**
 * PlaneTransport is one way to ship stuff. It follows the ITransport contract,
 * but does things the plane way (expensive, fast, strict weight limit, high
 * carbon penalty).
 *
 */
public class PlaneTransport implements ITransport {
    /**
     * Planes are expensive! Big base price.
     */
    public Double getBasePrice() {
        return 1000.0;
    }

    /**
     * Not for heavy stuff. Max 1000kg.
     */
    public Double getWeightLimit() {
        return 1000.0;
    }

    /**
     * Every kilometer costs a lot.
     */
    public Double getCostPerKm() {
        return 50.0;
    }

    /**
     * Planes aren't great for the planet. Big penalty.
     */
    public Integer getCarbonPenalty() {
        return 100;
    }
}
