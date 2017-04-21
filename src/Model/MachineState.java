package Model;

public abstract class MachineState {

	public static MachineController machine;

	public static MachineState getInitialState(MachineController m) {
		// TODO Auto-generated method stub
		machine=m;
		return new MachineAwaiting();
	}
	
	public abstract String status();

	public MachineState start() {
		// TODO Auto-generated method stub
		return null;
	}

	public MachineState full() {
		// TODO Auto-generated method stub
		return null;
	}

	public MachineState timeOver() {
		// TODO Auto-generated method stub
		return null;
	}

}
