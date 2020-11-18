import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUITest {

	private static final int HEIGHT = 400;
	private static final int WIDTH = 400;

	public static void main(String[] args)
	{
		// so far, all our programs have been sequential and they reached the END
		
		JFrame frame = new JFrame("Dark wave");
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocationRelativeTo(null);
		// Clash
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout layout = new FlowLayout();
		frame.setLayout(layout);
		
		JButton b1 = new JButton("Man who stare");
		JButton b2 = new JButton("at goats");
		JButton b52 = new JButton("at Code Monkeys");
		JButton doNotPushMe = new JButton("my finger is on the button");
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Stop staring!!!");
			}
			
		});
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b52);
		frame.add(doNotPushMe);
		
		frame.pack();
		
		frame.setVisible(true);
		
	}
}
