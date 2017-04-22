package Model;

public class MachineFacade {

	public Bomb b;
	public Motor m;
	public Valve v;
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
}
