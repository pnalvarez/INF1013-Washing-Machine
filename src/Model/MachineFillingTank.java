package Model;

public class MachineFillingTank extends MachineState {

	@Override
	public String status() {

		return "Filling Tank";
	}
	
	public MachineFillingTank(){
		System.out.println(status());
		machine.facade.entryFillingTank();
	}
	
	public MachineState full(){
		return new MachineRinsing();
	}

}
