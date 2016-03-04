package Introduction;

import gov.nasa.worldwind.BasicModel;
import gov.nasa.worldwind.awt.*;
import javax.swing.*;

import Introduction.puntos_Geograficos;

public class HiWorld extends JFrame

{
	public HiWorld()
	{
		WorldWindowGLCanvas world = new WorldWindowGLCanvas();
		world.setPreferredSize(new java.awt.Dimension(800, 600));
		this.getContentPane().add(world, java.awt.BorderLayout.CENTER);
		world.setModel(new BasicModel());
		world.setFocusable(isAlwaysOnTop());
		
		puntos_Geograficos mycapaPuntos = new puntos_Geograficos();
		mycapaPuntos.addPuntos(world, 17.1725, -97.9249, "Puebla");
		mycapaPuntos.addPuntos(world, 19.1168, -95.8910, "anton Beach");
		mycapaPuntos.addPuntos(world, 20.9594, -86.5560, "Cancún");
		
	}
	
	public static void main(String[]args)
	{
		java.awt.EventQueue.invokeLater(new Runnable() 
		{
			@Override
			public void run() {
				// TODO Auto-generated method stub
				JFrame frame = new HiWorld();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				frame.setUndecorated(true);
				frame.pack();
				frame.setVisible(true);
				
			}
		});
	}

}
