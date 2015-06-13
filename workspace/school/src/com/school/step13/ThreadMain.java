package com.school.step13;

public class ThreadMain {
	public static void main(String[] args) {
		Thread mp3Thread = new Thread(new Mp3Runnable());
		Thread timeThread = new Thread(new TimeRunnable());

		mp3Thread.start();
		timeThread.start();
		mp3Thread.run();
	}
}
