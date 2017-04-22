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
	private int seconds = 0;
	
	public Motor(MachineController m){
		machine=m;
	}
	
	public void slow(){
		t=new Timer(100,this);
		seconds=0;
		MaxTime=100;
		t.start();
	}
	public void fast(){
		t=new Timer(50,this);
		seconds=0;
		MaxTime=200;
		t.start();
	}
	
	public void stop(){
		t.stop();
		machine.timeOver();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		seconds++;
		System.out.printf("Motor %f seconds\n",(double)seconds/10);
		this.setChanged();
		
		if(seconds<MaxTime){
			
			
			if(animation<2)
				animation++;
			else
				animation=0;
			
	
			this.notifyObservers(new Integer(animation));
		}
		else{
			
			this.notifyObservers(null);
			stop();
		}
		
	}

	
}
