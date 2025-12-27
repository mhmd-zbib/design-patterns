package behavioral.factory;

/**
 * ITransport is the contract for all types of transport (truck, ship, plane,
 * etc).
 *
 * The idea: every transport does shipping, but each has its own way of handling
 * price, weight, and eco impact.
 *
 * This interface lets us treat all transports the same in the main code, while
 * letting each one do its own thing under the hood.
 */
public interface ITransport {
    Double getBasePrice();

    Double getWeightLimit();

    Double getCostPerKm();

    Integer getCarbonPenalty();
}