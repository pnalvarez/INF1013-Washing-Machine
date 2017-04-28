package State;

    class MachineSpinning extends MachineState {

	@Override
	 String status() {
		return "Spinning";
	}

	public MachineSpinning(){
		System.out.printf("%s cicle %d\n",status(),machine.facade.getCicle());
		machine.facade.entrySpinning();
	}
	
	public MachineState timeOver(){
		
		if(machine.facade.getCicle()==1){
			machine.facade.exitSpinningToFillTank();
			return new MachineFillingTank();
		}
		else{
			return new MachineAwaiting();
		}
	}
}
