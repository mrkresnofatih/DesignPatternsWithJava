public class HyundaiCar implements ICar {
    private IWheels Wheels;

    public HyundaiCar(IWheels wheels) {
        Wheels = wheels;
    }

    public IWheels getWheels() {
        return Wheels;
    }

    public void setWheels(IWheels wheels) {
        Wheels = wheels;
    }

    @Override
    public void GoForward() {
        System.out.println("\nHyundai car tries to go forward");
        this.Wheels.Spin();
    }
}
