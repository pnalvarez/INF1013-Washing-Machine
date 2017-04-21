package Model;

public class MachineSpinning extends MachineState {

	@Override
	public String status() {
		// TODO Auto-generated method stub
		return "Spinning";
	}

	public MachineSpinning(){
		System.out.printf("%s %d\n",status(),machine.ciclo);
		machine.m.fast();
	}
	
	public MachineState timeOver(){
		
		if(machine.ciclo==1){
			machine.ciclo++;
			return new MachineFillingTank();
		}
		else{
			return new MachineAwaiting();
		}
	}
}
