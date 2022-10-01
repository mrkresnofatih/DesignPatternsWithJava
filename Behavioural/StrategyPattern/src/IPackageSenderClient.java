public interface IPackageSenderClient {
    public void SetPackageToBeSent(String packageToBeSent);

    public void SetSendPackageStrategy(ISendPackageStrategy sendPackageStrategy);

    public void SetPackageDestination(String destination);

    public void ExecuteSend();
}
