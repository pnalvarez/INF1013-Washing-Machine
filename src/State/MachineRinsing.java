package State;

public class MachineRinsing extends MachineState {

	@Override
	public String status() {
		// TODO Auto-generated method stub
		return "rinsing";
	}
	
	public MachineRinsing(){
		System.out.println(status());
		machine.facade.entryRinsing();
	}
	
	public MachineState timeOver(){
		return new MachineEmptyingTank();
	}

}
