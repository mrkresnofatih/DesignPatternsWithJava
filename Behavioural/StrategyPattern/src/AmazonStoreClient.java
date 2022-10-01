public class AmazonStoreClient implements IPackageSenderClient {
    private String packageToBeSent;
    private String destination;
    private ISendPackageStrategy sendPackageStrategy;

    @Override
    public void SetPackageToBeSent(String packageToBeSent) {
        this.packageToBeSent = packageToBeSent;
    }

    @Override
    public void SetSendPackageStrategy(ISendPackageStrategy sendPackageStrategy) {
        this.sendPackageStrategy = sendPackageStrategy;
    }

    @Override
    public void SetPackageDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public void ExecuteSend() {
        System.out.println("AmazonStoreClient executing Send Operation!");
        this.sendPackageStrategy.Send(this.packageToBeSent, this.destination);
    }
}
