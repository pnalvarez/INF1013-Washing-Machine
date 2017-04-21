package Model;

public class MachineFillingTank extends MachineState {

	@Override
	public String status() {

		return "Filling Tank";
	}
	
	public MachineFillingTank(){
		System.out.println(status());
		machine.v.open();
	}
	
	public MachineState full(){
		return new MachineRinsing();
	}

}
