package Model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import javax.swing.Timer;

public class Valve extends Observable implements ActionListener{

	private boolean opened;
	private MachineController machine;
	private int level;
	private Timer t;
	
	public Valve(MachineController m){
		machine=m;
		opened = false;
		level = 0;
		t=new Timer(1000,this);
	}
	
	public void open(){
		
		opened=true;
		level=0;
		t.start();
	}
	
	public void close(){
		opened=false;
		machine.full();
	}
	
	private boolean isFull(){
		return level==10;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		level++;
		setChanged();
		notifyObservers(level);
		
		if(isFull()){
			t.stop();
			close();
		}
		
	}
}
