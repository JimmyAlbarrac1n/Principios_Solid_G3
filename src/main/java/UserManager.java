import static utils.CommonValidations.*;
import Data.DbContext;

class UserManager {

    Email emailService = new Email();

    public void addUser(String email, String password) {
        if (isValidEmail(email) && isValidPassword(password)) {
            DbContext.saveToDatabase(email, password);
            emailService.sendWelcomeEmail(email);
        } else {
            System.out.println("Invalid email or password. User not added.");
        }
    }
}

