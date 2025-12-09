package DIP;

public class CopaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing copayment of $" + amount);
    }
    
}
