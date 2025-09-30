public class standardShipment extends shipment {
    private double insuranceFee;


    // Constructor
    public standardShipment(String trackingNumber, String sender, String receiver,
                            double weight, double baseRate, double distanceKm,
                            double insuranceFee) {
        super(trackingNumber, sender, receiver, weight, baseRate, distanceKm);
        this.insuranceFee = insuranceFee;
    }


    // Override: cost includes insurance fee
    @Override
    public double calculateCost() {
        return super.calculateCost() + insuranceFee;
    }


    // Override: standard delivery speed (500 km/day)
    @Override
    public double getEstimatedDeliveryDays() {
        double days = Math.ceil(getDistanceKm() / 500.0);
        return days;
    }


    // Details with Insurance info
    @Override
    public String getDetails() {
        return super.getDetails() +
               "\nInsurance Fee: " + insuranceFee;
    }

    
}
