public class HelicopterSendPackageStrategy implements ISendPackageStrategy {
    @Override
    public void Send(String packageToBeSent, String destination) {
        System.out.printf("Send %s to %s by Helicopter\n\n", packageToBeSent, destination);
    }
}
