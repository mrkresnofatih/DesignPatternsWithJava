public class LightningClient {
    public void InsertLightningClientToComputer(IComputer computer) {
        System.out.println("Lightning client inserted to computer");
        computer.ReceiveInLightningPort();
    }
}
