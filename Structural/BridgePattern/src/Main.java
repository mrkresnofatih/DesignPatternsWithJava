public class Main {
    public static void main(String[] args) {
        var normalWheels = new NormalWheels();
        var premiumWheels = new PremiumWheels();

        var hyundaiCar = new HyundaiCar(normalWheels);
        hyundaiCar.GoForward();

        hyundaiCar.setWheels(premiumWheels);
        hyundaiCar.GoForward();

        var toyotaCar = new ToyotaCar(premiumWheels);
        toyotaCar.GoForward();

        // Bridge Example
        // 1. a car provides the user with one api for "moving the car" (go forward, interface for the user)
        // 2. a car should not have to care about what brand of wheels
        //    it's got to move the car, so long as it implements a standard api to communicate with the car (spin, interface for the car)
        // 3. a wheel should not care about what kind of car it is to start spinning

        // Hyundai car tries to go forward
        // Normal Wheels Are Spinning!
        //
        // Hyundai car tries to go forward
        // Premium Wheels Are Spinning!
        //
        // Toyota car tries to go forward
        // Premium Wheels Are Spinning!
    }
}