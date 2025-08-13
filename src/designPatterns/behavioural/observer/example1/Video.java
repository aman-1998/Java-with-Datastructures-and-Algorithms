package designPatterns.behavioural.observer.example1;

import java.util.ArrayList;
import java.util.List;

public class Video {
	
	private String title;
	private int videoLengthInMins;
	private int noOfLikes;
	private int noOfDislikes;
	private List<String> comments = new ArrayList<>();
	
	public Video(String title, int videoLengthInMins) {
		this.title = title;
		this.videoLengthInMins = videoLengthInMins;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getVideoLengthInMins() {
		return videoLengthInMins;
	}

	public void setVideoLengthInMins(int videoLengthInMins) {
		this.videoLengthInMins = videoLengthInMins;
	}

	public int getNoOfLikes() {
		return noOfLikes;
	}

	public void setNoOfLikes(int noOfLikes) {
		this.noOfLikes = noOfLikes;
	}

	public int getNoOfDislikes() {
		return noOfDislikes;
	}

	public void setNoOfDislikes(int noOfDislikes) {
		this.noOfDislikes = noOfDislikes;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}
	
	
}
