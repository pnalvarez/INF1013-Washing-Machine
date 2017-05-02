package Main;

import View.WashingFrame;

    class Main {

    private static WashingFrame frame;
    
	public static void main(String[] args){
		
         initializeFrame(frame);
	}
	static void initializeFrame(WashingFrame fr){
		fr = new WashingFrame();
	}
}
