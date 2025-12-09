package DIP;

public class PaymentProcessor {
    private final PaymentService paymentService;

    public PaymentProcessor(PaymentService paymentService) {
        this.paymentService = paymentService;
    } 

        public void process(double amount) {
            paymentService.processPayment(amount);
            System.out.println("Payment of $" + amount + " processed.");
    }
}
