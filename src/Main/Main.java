package Main;

import java.util.Observer;

import View.WashingFrame;

public class Main {

	public static void main(String[] args){
		
		WashingFrame fr=new WashingFrame();
		addAllObserversToObservable(fr,fr.panel);
		fr.setVisible(true);
	}
	
	public static void addAllObserversToObservable(WashingFrame frame,Observer o){
		
		frame.machine.facade.b.addObserver( o);
		frame.machine.facade.v.addObserver(o);
		frame.machine.facade.m.addObserver(o);
	}
}
