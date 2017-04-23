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
	public int ciclo;
	
	public MachineController machine;
	
	public MachineFacade(MachineController machine){
		this.machine=machine;
		b=new Bomb(machine);
		m=new Motor(machine);
		v=new Valve(machine);
		ciclo=0;
	}
	
	public void exitAwaiting(){
		ciclo=1;
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
		ciclo++;
	}
	public void addObservers(Observer o){
		b.addObserver(o);
		m.addObserver(o);
		v.addObserver(o);
	}
}
