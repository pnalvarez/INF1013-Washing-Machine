package Model;

public class MachineSpinning extends MachineState {

	@Override
	public String status() {
		// TODO Auto-generated method stub
		return "Spinning";
	}

	public MachineSpinning(){
		System.out.printf("%s %d\n",status(),machine.facade.ciclo);
		machine.facade.entrySpinning();
	}
	
	public MachineState timeOver(){
		
		if(machine.facade.ciclo==1){
			machine.facade.exitSpinningToFillTank();
			return new MachineFillingTank();
		}
		else{
			return new MachineAwaiting();
		}
	}
}
