public class TiramisuDressingDecorator implements IIceCream {
    private IIceCream IceCream;

    public TiramisuDressingDecorator(IIceCream iceCream) {
        IceCream = iceCream;
    }

    @Override
    public String getIceCream() {
        return this.IceCream.getIceCream() + " with Tiramisu Dressing";
    }
}
