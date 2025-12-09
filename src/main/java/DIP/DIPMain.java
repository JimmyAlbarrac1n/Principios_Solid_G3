package DIP;

public class DIPMain {
    public static void main(String[] args) {
        PaymentService copaymentService = new CopaymentService();
        PaymentProcessor copaymentProcessor = new PaymentProcessor(copaymentService);
        copaymentProcessor.process(50.0);

        PaymentService pointsService = new PointsService();
        PaymentProcessor pointsProcessor = new PaymentProcessor(pointsService);
        pointsProcessor.process(75.0);
    }
}
