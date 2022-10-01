public class ChocolateFrostingDecorator implements IIceCream {
    private IIceCream IceCream;

    public ChocolateFrostingDecorator(IIceCream iceCream) {
        IceCream = iceCream;
    }

    @Override
    public String getIceCream() {
        return this.IceCream.getIceCream() + " with Chocolate Frosting";
    }
}
