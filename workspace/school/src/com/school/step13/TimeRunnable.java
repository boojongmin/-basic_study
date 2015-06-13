package com.school.step13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeRunnable implements Runnable {
	
	@Override
	public void run(){
		while(true){
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			System.out.println("현재시간 : " + sdf.format(new Date()));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
