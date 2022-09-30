public class Main {
    public static void main(String[] args) {
        var lightningClient = new LightningClient();

        var mac = new Mac();
        lightningClient.InsertLightningClientToComputer(mac);

        // Lightning client inserted to computer
        // Mac receives in lightning port

        var windows = new Windows();
        var windowsAdapter = new WindowsAdapter(windows);
        lightningClient.InsertLightningClientToComputer(windowsAdapter);

        // Windows receives in USB Port
        // Lightning client inserted to computer
        // Windows adapter receives in lightning port
    }
}