public class BlueBerryToppingDecorator implements IIceCream {
    private IIceCream IceCream;

    public BlueBerryToppingDecorator(IIceCream iceCream) {
        IceCream = iceCream;
    }

    @Override
    public String getIceCream() {
        return this.IceCream.getIceCream() + " with BlueBerry Topping";
    }
}
