// Main class: shippingSystem
public class shippingSystem {
    public static void main(String[] args) {

        // === Standard Shipment  ===
        standardShipment s1 = new standardShipment(
                "STD001", "Glessly", "Aiza",
                5.0, 50.0, 146.0, 20.0);

        System.out.println("\n=== Standard Shipment Details ===");
        System.out.println(s1.getDetails());
        System.out.println("Estimated Days: " + s1.getEstimatedDeliveryDays());
        System.out.println("Before Delivery: " + s1.getDeliveryStatus());
        s1.markDelivered();
        System.out.println("After Delivery: " + s1.getDeliveryStatus());

        // === Express Shipment  ===
        expressShipment e1 = new expressShipment(
                "EXP001", "Aliyah", "Christine",
                2.0, 80.0, 58.0, "High");

        System.out.println("\n=== Express Shipment Details ===");
        System.out.println(e1.getDetails());
        System.out.println("Estimated Days: " + e1.getEstimatedDeliveryDays());
        System.out.println("High Priority? " + e1.isHighPriority());
        System.out.println("Before Delivery: " + e1.getDeliveryStatus());
        e1.markDelivered();
        System.out.println("After Delivery: " + e1.getDeliveryStatus());

        // === International Shipment  ===
        internationalShipment i1 = new internationalShipment(
                "INT001", "Justin", "Jacob",
                10.0, 100.0, 750.0, 150.0, "Japan");

        System.out.println("\n=== International Shipment Details ===");
        System.out.println(i1.getDetails());
        System.out.println("Estimated Days: " + i1.getEstimatedDeliveryDays());
        System.out.println("Requires Customs? " + i1.requiresCustomsDeclaration());
        System.out.println("Before Delivery: " + i1.getDeliveryStatus());
        i1.markDelivered();
        System.out.println("After Delivery: " + i1.getDeliveryStatus());

        // End of program
        System.out.println("\nAll shipments processed. Program finished.");
    }
}
