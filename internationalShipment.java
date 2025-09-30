public class internationalShipment extends shipment{

    private double customsFee;
    private String destinationCountry;


    public internationalShipment(String trackingNumber, String sender, String receiver,
                                 double weight, double baseRate, double distanceKm,
                                 double customsFee, String destinationCountry) {
        super(trackingNumber, sender, receiver, weight, baseRate, distanceKm);
        this.customsFee = customsFee;
        this.destinationCountry = destinationCountry;
    }


    @Override
    public double calculateCost() {
        return super.calculateCost() + customsFee;
    }


     @Override
    public double getEstimatedDeliveryDays() {
        double days = Math.ceil(getDistanceKm() / 400.0) + 2;
        return days;
    }


    public boolean requiresCustomsDeclaration() {
        return getWeight() > 2.0;
    }


     @Override
    public String getDetails() {
        return super.getDetails() +
               "\nCustoms Fee: " + customsFee +
               "\nDestination Country: " + destinationCountry;
    }

}
