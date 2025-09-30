public class shipment {

    // Attributes in private can't be accessed directly
    private String trackingNumber;
    private String sender;
    private String receiver;
    private double weight;
    private double baseRate;
    private double distanceKm;
    private boolean delivered;

    // Constructor: initialize to shipment details
    public shipment(String trackingNumber, String sender, String receiver,
                    double weight, double baseRate, double distanceKm) {
        this.trackingNumber = trackingNumber;
        this.sender = sender;
        this.receiver = receiver;
        setWeight(weight);
        setBaseRate(baseRate);
        setDistanceKm(distanceKm);
        this.delivered = false;
    }


    // Calculate cost: base formula (weight x baseRate)
    public double calculateCost(){
        return weight * baseRate;
    }


    public void markDelivered() {
        delivered = true;
    }


    // Delivery status (text form)
    public String getDeliveryStatus() {
        return delivered ? "Delivered" : "In Transit";
    }


    // Estimated delivery days (basic formula, overridden in subclasses)
    public double getEstimatedDeliveryDays() {
        // Default: assume 500 km/day
        double days = Math.ceil(distanceKm / 500.0);
        return days;
    }


    // Get full details of shipment
    public String getDetails() {
        return "Tracking: " + trackingNumber +
               "\nSender: " + sender +
               "\nReceiver: " + receiver +
               "\nWeight: " + weight + " kg" +
               "\nBase Rate: " + baseRate +
               "\nDistance: " + distanceKm + " km" +
               "\nCost: " + calculateCost() +
               "\nStatus: " + getDeliveryStatus();
    }


    // Getters & Setters with validation 
    public String getTrackingNumber() { return trackingNumber; }
    public String getSender() { return sender; }
    public String getReceiver() { return receiver; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) {
        if (weight > 0) this.weight = weight;
        else this.weight = 1; // default if invalid
    }


    public double getBaseRate() { return baseRate; }
    public void setBaseRate(double baseRate) {
        if (baseRate > 0) this.baseRate = baseRate;
        else this.baseRate = 1;
    }


    public double getDistanceKm() { return distanceKm; }
    public void setDistanceKm(double distanceKm) {
        if (distanceKm > 0) this.distanceKm = distanceKm;
        else this.distanceKm = 1;
    }


    
}
