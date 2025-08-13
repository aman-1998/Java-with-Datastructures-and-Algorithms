package designPatterns.behavioural.observer.example1;

import java.util.Optional;

public class Striver extends Channel {
	
	public Striver(int channelId, String channelName) {
		super(channelId, channelName);
	}

	@Override
	public void uploadVideo(Video video) {
		getListOfVideo().add(video);
		getSubscribers().stream().forEach(user -> user.notify(getChannelName(), video.getTitle()));
	}

	@Override
	public void deleteVideo(String videoTitle) {
		Optional<Video> videoOp = getListOfVideo().stream().filter(video -> video.getTitle().equals(videoTitle))
		                         				         .findFirst();
		
		if(videoOp.isPresent()) {
			getListOfVideo().remove(videoOp.get());
		} else {
			System.out.println("Video with title " + videoTitle + " does not exist");
		}
	}
}
