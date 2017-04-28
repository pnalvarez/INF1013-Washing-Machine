package Facade;

import java.util.Observer;

import Model.Bomb;
import Model.MachineController;
import Model.Motor;
import Model.Valve;

public class MachineFacade {

	private Bomb b;
	private Motor m;
	private Valve v;
	private int cicle;
	
	public MachineFacade(MachineController machine){
		b=new Bomb(machine);
		m=new Motor(machine);
		v=new Valve(machine);
		cicle=0;
	}
	
	public void exitAwaiting(){
		cicle=1;
	}
	
	public void entryFillingTank(){
		v.open();
	}
	public void entryRinsing(){
		m.slow();
	}
	public void entryEmptyingTank(){
		b.start();
	}
	public void entrySpinning(){
		m.fast();
	}
	public void exitSpinningToFillTank(){
		cicle++;
	}
	public int getCicle(){
		return cicle;
	}
	public void addObservers(Observer o){
		b.addObserver(o);
		m.addObserver(o);
		v.addObserver(o);
	}
}
