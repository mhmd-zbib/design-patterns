package behavioral.factory;

public class PlaneTransport implements ITransport {
    public Double getBasePrice() {
        return 1000.0;
    }

    public Double getWeightLimit() {
        return 1000.0;
    }

    public Double getCostPerKm() {
        return 50.0;
    }

    public Integer getCarbonPenalty() {
        return 100;
    }
}
