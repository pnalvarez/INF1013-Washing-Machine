package State;

    class MachineRinsing extends MachineState {

	@Override
	 String status() {
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
