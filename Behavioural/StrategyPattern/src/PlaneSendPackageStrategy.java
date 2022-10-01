public class PlaneSendPackageStrategy implements ISendPackageStrategy {
    @Override
    public void Send(String packageToBeSent, String destination) {
        System.out.printf("Send %s to %s by Plane\n\n", packageToBeSent, destination);
    }
}
