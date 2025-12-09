package DIP;

public class PointsService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing points payment of $" + amount);
    }
    
}
