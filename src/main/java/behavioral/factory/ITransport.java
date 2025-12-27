package behavioral.factory;

public interface ITransport {
    Double getBasePrice();
    Double getWeightLimit();
    Double getCostPerKm();
    Integer getCarbonPenalty();
}