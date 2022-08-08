package abstraction;

public class SamsungRemoteImpl implements Remote {

	@Override
	public void soundControl() {
		System.out.println("Increase decrease sound");
	}

	@Override
	public void channelControl() {
		System.out.println("Go to any channel of your choice");
	}

	@Override
	public void screenBrightness() {
		System.out.println("Adjust screen brightness");
	}
	
}
