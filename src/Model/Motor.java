package Model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import javax.swing.Timer;

public class Motor extends Observable implements ActionListener{

	private MachineController machine;
	private Timer t;
	private int MaxTime;
	private int animation=0;
	private int time_count = 0;
	private String SpeedMode;
	
	public Motor(MachineController m){
		machine=m;
	}
	
	public void slow(){
		t=new Timer(100,this); 
		SpeedMode = "Slow";
		time_count=0;
		MaxTime=100; //0.1 seconds x 100 = 10 seconds
		t.start();
	}
	public void fast(){
		t=new Timer(50,this);
		SpeedMode = "Fast";
		time_count=0;
		MaxTime=60;//0.05 seconds x 60 =  3 seconds
		t.start();
	}
	
	public void stop(){
		t.stop();
		machine.timeOver();
	}
	private void showTime(String speedMode, int time){
		
		if(speedMode=="Slow"){
			if(time%10==0)
			System.out.printf("Motor %d seconds\n",time_count/10);
		}
		else{
			if(time%20==0)
			System.out.printf("Motor %d seconds\n",time_count/20);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		time_count++;
		
		showTime(SpeedMode,time_count);
		
		if(time_count<MaxTime){
			
			
			if(animation<2)
				animation++;
			else
				animation=0;
			
			setChanged();
			notifyObservers(animation);
		}
		else{
			animation=0;
		    setChanged();
			notifyObservers(animation);
			stop();
		}
		
	}

	
}
