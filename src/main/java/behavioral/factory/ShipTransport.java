package behavioral.factory;


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
