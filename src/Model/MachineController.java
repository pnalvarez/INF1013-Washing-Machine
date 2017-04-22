package Model;

public class MachineController {

	public MachineFacade facade;
	private MachineState state;
	
	public MachineController(){
		facade = new MachineFacade(this);
		state=MachineState.getInitialState(this);
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
