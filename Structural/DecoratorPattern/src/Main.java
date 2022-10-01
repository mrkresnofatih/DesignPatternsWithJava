public class Main {
    public static void main(String[] args) {
        var myIceCream = new VanillaIceCream();
        var myIceCreamWithChocolateFrost = new ChocolateFrostingDecorator(myIceCream);
        var myIceCreamWithChocolateFrostWithBlueBerryTopping = new BlueBerryToppingDecorator(myIceCreamWithChocolateFrost);
        System.out.println(myIceCreamWithChocolateFrostWithBlueBerryTopping.getIceCream());
        // Vanilla Ice Cream with Chocolate Frosting with BlueBerry Topping

        var myNewIceCream = new StrawberryIceCream();
        var myNewIceCreamWithTiramisu = new TiramisuDressingDecorator(myNewIceCream);
        System.out.println(myNewIceCreamWithTiramisu.getIceCream());
        // Strawberry Ice Cream with Tiramisu Dressing
    }
}