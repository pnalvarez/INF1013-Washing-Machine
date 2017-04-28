package Model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import javax.swing.Timer;

public class Bomb extends Observable implements ActionListener{

	private MachineController machine;
	private int level;
	private Timer t;
	
	public Bomb(MachineController m){
		machine=m;
		level=10;
		t = new Timer(1000,this);
	}
	
	public void start(){
		
		level=10;
		t.start();
	}
	public void stop(){
		
		t.stop();
		machine.timeOver();
	}
	private boolean TankisEmpty(){
		return level==0;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		level--;
		
		setChanged();
		notifyObservers(level);
		
		if(TankisEmpty())
			stop();
		
		
	}

	
}
