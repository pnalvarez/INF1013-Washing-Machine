package View;

import javax.swing.JFrame;

import Model.MachineController;

public class WashingFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	private WashingPanel panel;
	private MachineController machine;
	
	public WashingFrame(){
		
		super("Washing Machine simulator");
		setLayout(null);
		setSize(1000,1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		machine = new MachineController();
		panel=new WashingPanel(machine);
		getContentPane().add(panel);
		machine.facade.addObservers(panel);
		setVisible(true);
	}
	
}
