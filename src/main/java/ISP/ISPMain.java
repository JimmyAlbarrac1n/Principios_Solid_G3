package ISP;

public class ISPMain {
    public static void main(String[] args) {
        Device phone = new Phone();
        Device camera = new DisposableCamera();

        phone.turnOn();
        phone.turnOff();
        ((ChargableDevice)phone).charge();

        camera.turnOn();
        camera.turnOff();
    }
}
