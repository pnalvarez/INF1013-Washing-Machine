package State;

  class MachineAwaiting extends MachineState {

	@Override
	 String status() {
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
