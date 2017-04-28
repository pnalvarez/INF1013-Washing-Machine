package View;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

import Model.MachineController;
import Model.Bomb;
import Model.Valve;

 class WashingPanel extends JPanel implements Observer,ActionListener{

	private static final long serialVersionUID = 1L;
	private JButton start;
	private MachineController machine;
	private int currentLevel=0;
	private int currentImage = 0;
	private List<ImageIcon> images = new ArrayList<ImageIcon>();
	private JLabel machineImage;
	
	 WashingPanel(MachineController m){
		
		setBounds(0,0,1000,1000);
		setBackground(Color.WHITE);
		images.add(new ImageIcon("images/img01.jpg"));
		images.add(new ImageIcon("images/img02.jpg"));
		images.add(new ImageIcon("images/img03.jpg"));
		machine=m;
		setLayout(null);
		start=new JButton("Start");
		start.setBounds(790, 30, 100, 70);
		start.addActionListener(this);
		start.setVisible(true);
		add(start);
		machineImage = new JLabel(images.get(0));
		machineImage.setBounds(90, 100, 500, 500);
		add(machineImage);
		
	}
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
				
		machineImage.setIcon(images.get(currentImage));
		g.setColor(Color.cyan);
		
		for(int i=0;i<currentLevel;i++)
			g.fillRect(790, 600-50*i, 70, 50);
		
		g.setColor(Color.black);
		
		for(int i=0;i<10;i++)
			g.drawRect(790, 600-50*i, 70, 50);
		
			g.drawString("Tank", 800, 680);
			g.drawString("Machine", 150+50+100, 620);
	}
	@Override
	public void update(Observable o, Object arg) {
		
		if(o instanceof Valve || o instanceof Bomb )
			currentLevel = (Integer) arg;		
		else
			currentImage = (Integer) arg;
		
		repaint();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		machine.start();
		
	}

}
