package State;

     class MachineFillingTank extends MachineState {

	@Override
	 String status() {
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
