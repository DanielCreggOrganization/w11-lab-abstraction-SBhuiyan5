package ie.atu.testpackage.abstraction;

public class TVRemote extends RemoteControl {
    public TVRemote() {
        super("TV");
    }
    
    @Override
    public void powerButton() {
        isOn = !isOn;
        System.out.println("TV turning " + (isOn ? "on" : "off"));
    }
    
    @Override
    public void volumeUp() {
        if (isOn) {
            System.out.println("TV volume increasing");
        }
    }
    
    @Override
    public void volumeDown() {
        if (isOn) {
            System.out.println("TV volume decreasing");
        }
    }
}
