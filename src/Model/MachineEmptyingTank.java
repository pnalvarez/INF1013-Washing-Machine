package Model;

public class MachineEmptyingTank extends MachineState {

	@Override
	public String status() {
		// TODO Auto-generated method stub
		return "Emptying Tank";
	}
	
	public MachineEmptyingTank(){
		System.out.println(status());
		machine.b.start();
	}

	public MachineState timeOver(){
		return new MachineSpinning();
	}
}