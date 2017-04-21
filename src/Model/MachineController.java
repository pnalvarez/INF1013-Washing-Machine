package Model;

public class MachineController {

	public Bomb b;
	public Valve v;
	public Motor m;
	public int ciclo;
	private MachineState state;
	
	public MachineController(){
		b=new Bomb(this);
		v=new Valve(this);
		m=new Motor(this);
		state=MachineState.getInitialState(this);
		ciclo=0;
	}
	public void start(){
		
		MachineState ms= state.start();
		
		if(ms!=null)
			state=ms;
	}
	public void full() {
		
       MachineState ms= state.full();
		
		if(ms!=null)
			state=ms;
		
	}

	public void timeOver() {
		
     MachineState ms= state.timeOver();
		
		if(ms!=null)
			state=ms;
		
	}


}
