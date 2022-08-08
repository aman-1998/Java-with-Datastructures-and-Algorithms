package abstraction;

public class Main_N3 {
	public static void main(String[] args) {
		Remote remote = new SamsungRemoteImpl();
		remote.soundControl();
		remote.channelControl();
		remote.screenBrightness();
	}
}
