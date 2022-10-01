public class Main {
    public static void main(String[] args) {
        var amazon = new AmazonStoreClient();

        var books = "Books";
        var cityOfChicago = "Chicago";
        var planeSendStrategy = new PlaneSendPackageStrategy();

        amazon.SetPackageToBeSent(books);
        amazon.SetPackageDestination(cityOfChicago);
        amazon.SetSendPackageStrategy(planeSendStrategy);
        amazon.ExecuteSend();

        var phones = "Phones";
        var cityOfBerlin = "Berlin";
        var chopperSendStrategy = new HelicopterSendPackageStrategy();
        var shipSendStrategy = new ShipSendPackageStrategy();

        amazon.SetPackageToBeSent(phones);
        amazon.SetPackageDestination(cityOfBerlin);
        amazon.SetSendPackageStrategy(chopperSendStrategy);
        amazon.SetSendPackageStrategy(shipSendStrategy);
        amazon.ExecuteSend();

        //  Output
        //  ======
        //  AmazonStoreClient executing Send Operation!
        //  Send Books to Chicago by Plane
        //
        //  AmazonStoreClient executing Send Operation!
        //  Send Phones to Berlin by Ship
    }
}