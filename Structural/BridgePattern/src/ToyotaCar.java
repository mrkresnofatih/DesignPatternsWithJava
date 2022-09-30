public class ToyotaCar implements ICar {
    private IWheels Wheels;

    public ToyotaCar(IWheels wheels) {
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
        System.out.println("\nToyota car tries to go forward");
        this.Wheels.Spin();
    }
}
