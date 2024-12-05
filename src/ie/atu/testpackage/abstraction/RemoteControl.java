package ie.atu.testpackage.abstraction;

public abstract class RemoteControl {
    protected boolean isOn;
    protected String deviceName;
    
    public RemoteControl(String deviceName) {
        this.deviceName = deviceName;
        this.isOn = false;
    }
    
    // All remote controls must implement these
    public abstract void powerButton();
    public abstract void volumeUp();
    public abstract void volumeDown();
    
    // All remote controls can use this
    public void displayStatus() {
        System.out.println(deviceName + " is " + (isOn ? "ON" : "OFF"));
    }
}
