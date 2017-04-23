package State;

public class MachineAwaiting extends MachineState {

	@Override
	public String status() {
		// TODO Auto-generated method stub
		return "Awaiting";
	}
	
	public MachineAwaiting(){
		System.out.println(status());
	}
	public MachineState start(){
		machine.facade.exitAwaiting();
		return new MachineFillingTank();
	}

}
