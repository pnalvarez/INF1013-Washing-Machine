package State;

    class MachineEmptyingTank extends MachineState {

	@Override
	 String status() {
		return "Emptying Tank";
	}
	
	public MachineEmptyingTank(){
		System.out.println(status());
		machine.facade.entryEmptyingTank();
	}

	public MachineState timeOver(){
		return new MachineSpinning();
	}
}
