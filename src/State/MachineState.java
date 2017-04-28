package State;

import Model.MachineController;

 public abstract class MachineState {

	public static MachineController machine;

	public static MachineState getInitialState(MachineController m) {
		machine=m;
		return new MachineAwaiting();
	}
	
    abstract String status();

	public MachineState start() {
		return null;
	}

	public MachineState full() {
		return null;
	}

	public MachineState timeOver() {
		return null;
	}

}
