package Model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import javax.swing.Timer;

public class Valve extends Observable implements ActionListener{

	private MachineController machine;
	private int level;
	private Timer t;
	
	public Valve(MachineController m){
		machine=m;
		level = 0;
		t=new Timer(1000,this);
	}
	
	public void open(){
		
		level=0;
		t.start();
	}
	
	public void close(){
		machine.full();
	}
	
	private boolean TankisFull(){
		return level==10;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		level++;
		setChanged();
		notifyObservers(level);
		
		if(TankisFull()){
			t.stop();
			close();
		}
		
	}
}
