package com.school.step13;

public class Mp3Runnable implements Runnable {
	
	@Override
	public void run(){
		while(true){
			System.out.println("Mp3 Ω««‡¡ﬂ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
