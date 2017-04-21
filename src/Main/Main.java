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
		
		frame.machine.b.addObserver( o);
		frame.machine.v.addObserver(o);
		frame.machine.m.addObserver(o);
	}
}
