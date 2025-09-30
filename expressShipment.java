public class expressShipment extends shipment {

    private String priorityLevel;
    private double priorityFee;


    public expressShipment(String trackingNumber, String sender, String receiver,
                           double weight, double baseRate, double distanceKm,
                           String priorityLevel) {
        super(trackingNumber, sender, receiver, weight, baseRate, distanceKm);
        this.priorityLevel = priorityLevel;
        setPriorityFee(priorityLevel); // decide fee based on level
    }


    // Set priority fee depending on level
    private void setPriorityFee(String level) {
        if (level.equalsIgnoreCase("High")) {
            priorityFee = 200.0;
        } else if (level.equalsIgnoreCase("Rush")) {
            priorityFee = 500.0;
        } else {
            priorityFee = 0.0; // Normal
        }
    }


    // Override: cost includes priority fee
    @Override
    public double calculateCost() {
        return super.calculateCost() + priorityFee;
    }


    @Override
    public double getEstimatedDeliveryDays() {
        double days = Math.ceil(getDistanceKm() / 800.0);
        return days;
    }


    public boolean isHighPriority() {
        return priorityLevel.equalsIgnoreCase("High") || priorityLevel.equalsIgnoreCase("Rush");
    }


    @Override
    public String getDetails() {
        return super.getDetails() +
               "\nPriority Level: " + priorityLevel +
               "\nPriority Fee: " + priorityFee;
    }
    
}
