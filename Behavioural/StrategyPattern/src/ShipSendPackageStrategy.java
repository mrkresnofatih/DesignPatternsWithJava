public class ShipSendPackageStrategy implements ISendPackageStrategy {
    @Override
    public void Send(String packageToBeSent, String destination) {
        System.out.printf("Send %s to %s by Ship\n\n", packageToBeSent, destination);
    }
}
