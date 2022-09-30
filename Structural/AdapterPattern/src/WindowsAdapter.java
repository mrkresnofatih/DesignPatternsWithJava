public class WindowsAdapter implements IComputer {
    public Windows windows;

    public WindowsAdapter(Windows windows) {
        windows.ReceiveInUSBPort();
        this.windows = windows;
    }

    public void setWindows(Windows windows) {
        this.windows = windows;
    }

    @Override
    public void ReceiveInLightningPort() {
        System.out.println("Windows adapter receives in lightning port");
    }
}
