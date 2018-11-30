package views;

import java.awt.*;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UI extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	CardLayout c1= new CardLayout();
	
	
	///////////////////////////////////////////////
	//Game Variables
	///////////////////////////////////////////////
	public static int HP=100,RP=0;
	public static String name;
	
	
	
	/*public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	*/
	
	
	public UI() {
		
		initComponents();
		createEvents();
		
	}
	

	
	public void initComponents() {
		

		///////////////////////////////////////////////
		//Creating Frame
		///////////////////////////////////////////////

		setIconImage(Toolkit.getDefaultToolkit().getImage(UI.class.getResource("/resources/rev.png")));
		setTitle("---Revenge The Game---");
		setBackground(Color.BLACK);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(800,600);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(c1);

		///////////////////////////////////////////////
		//Start Screen
		///////////////////////////////////////////////

		JPanel startScreen = new JPanel();
		startScreen.setBackground(Color.BLACK);
		contentPane.add(startScreen, "1");

		JLabel revengeImage = new JLabel("");
		revengeImage.setBackground(Color.BLACK);
		revengeImage.setIcon(new ImageIcon(UI.class.getResource("/resources/Revenge MainMenu600-356.jpg")));
		revengeImage.setPreferredSize(new Dimension(600, 357));
		revengeImage.setMaximumSize(new Dimension(600, 357));
		revengeImage.setMinimumSize(new Dimension(600, 357));
		revengeImage.setOpaque(true);
		revengeImage.setSize(600,357);

		JButton creditButton = new JButton("Credits");
		creditButton.setForeground(Color.WHITE);
		buttonGroup.add(creditButton);
		creditButton.setBackground(Color.BLACK);

		JButton startButton = new JButton("Start!");
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.next(contentPane);
			}
		});
		
		startButton.setForeground(Color.WHITE);
		buttonGroup.add(startButton);
		startButton.setBackground(Color.BLACK);
		
		GroupLayout gl_startScreen = new GroupLayout(startScreen);
		gl_startScreen.setHorizontalGroup(
				gl_startScreen.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_startScreen.createSequentialGroup()
						.addGap(92)
						.addGroup(gl_startScreen.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_startScreen.createSequentialGroup()
										.addComponent(creditButton, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(startButton, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
								.addComponent(revengeImage, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(92, Short.MAX_VALUE))
				);
		gl_startScreen.setVerticalGroup(
				gl_startScreen.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_startScreen.createSequentialGroup()
						.addGap(70)
						.addComponent(revengeImage, GroupLayout.PREFERRED_SIZE, 338, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
						.addGroup(gl_startScreen.createParallelGroup(Alignment.BASELINE)
								.addComponent(creditButton)
								.addComponent(startButton))
						.addGap(63))
				);
		startScreen.setLayout(gl_startScreen);
		
		///////////////////////////////////////////////
		//StoryScreen1
		///////////////////////////////////////////////
		
		JPanel storyScreen1 = new JPanel();
		storyScreen1.setBackground(Color.BLACK);
		contentPane.add(storyScreen1, "2");

		JLabel storyScreen1Image = new JLabel("");
		storyScreen1Image.setIcon(new ImageIcon(UI.class.getResource("/resources/StoryImage1Last2.jpg")));
		storyScreen1Image.setBackground(Color.BLACK);
		storyScreen1Image.setOpaque(true);

		JButton storyScreen1contButton = new JButton("");
		storyScreen1contButton.setBackground(Color.DARK_GRAY);
		storyScreen1contButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.next(contentPane);
			}
		});
		GroupLayout gl_storyScreen1 = new GroupLayout(storyScreen1);
		gl_storyScreen1.setHorizontalGroup(
			gl_storyScreen1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_storyScreen1.createSequentialGroup()
					.addContainerGap(19, Short.MAX_VALUE)
					.addGroup(gl_storyScreen1.createParallelGroup(Alignment.LEADING)
						.addComponent(storyScreen1Image, GroupLayout.PREFERRED_SIZE, 765, GroupLayout.PREFERRED_SIZE)
						.addComponent(storyScreen1contButton, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
		);
		gl_storyScreen1.setVerticalGroup(
			gl_storyScreen1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_storyScreen1.createSequentialGroup()
					.addComponent(storyScreen1Image, GroupLayout.PREFERRED_SIZE, 540, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
					.addComponent(storyScreen1contButton, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE))
		);
		storyScreen1.setLayout(gl_storyScreen1);

		///////////////////////////////////////////////
		//StoryScreen2
		///////////////////////////////////////////////

		JPanel storyScreen2 = new JPanel();
		storyScreen2.setBackground(Color.BLACK);
		contentPane.add(storyScreen2, "3");

		JLabel storyScreen2Image = new JLabel("");
		storyScreen2Image.setIcon(new ImageIcon(UI.class.getResource("/resources/storyScreen2Last1.jpg")));
		storyScreen2Image.setBackground(Color.BLACK);
		storyScreen2Image.setOpaque(true);

		JButton storyScreen2contButton = new JButton("");
		storyScreen2contButton.setBackground(Color.DARK_GRAY);
		storyScreen2contButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.next(contentPane);
			}
		});
		GroupLayout gl_storyScreen2 = new GroupLayout(storyScreen2);
		gl_storyScreen2.setHorizontalGroup(
			gl_storyScreen2.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_storyScreen2.createSequentialGroup()
					.addGap(18)
					.addComponent(storyScreen2Image, GroupLayout.PREFERRED_SIZE, 766, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_storyScreen2.createSequentialGroup()
					.addContainerGap(741, Short.MAX_VALUE)
					.addComponent(storyScreen2contButton, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_storyScreen2.setVerticalGroup(
			gl_storyScreen2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_storyScreen2.createSequentialGroup()
					.addComponent(storyScreen2Image)
					.addPreferredGap(ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
					.addComponent(storyScreen2contButton, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE))
		);
		storyScreen2.setLayout(gl_storyScreen2);

		///////////////////////////////////////////////
		//StoryScreen3
		///////////////////////////////////////////////

		JPanel storyScreen3 = new JPanel();
		storyScreen3.setBackground(Color.BLACK);
		contentPane.add(storyScreen3, "4");

		JLabel storyScreen3Image = new JLabel("");
		storyScreen3Image.setIcon(new ImageIcon(UI.class.getResource("/resources/storyImage3Last1.jpg")));
		storyScreen3Image.setBackground(Color.BLACK);
		storyScreen3Image.setOpaque(true);

		JButton storyScreen3contButton = new JButton("");
		storyScreen3contButton.setBackground(Color.DARK_GRAY);
		storyScreen3contButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.next(contentPane);
			}
		});
		GroupLayout gl_storyScreen3 = new GroupLayout(storyScreen3);
		gl_storyScreen3.setHorizontalGroup(
			gl_storyScreen3.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_storyScreen3.createSequentialGroup()
					.addContainerGap(741, Short.MAX_VALUE)
					.addComponent(storyScreen3contButton)
					.addContainerGap())
				.addGroup(Alignment.LEADING, gl_storyScreen3.createSequentialGroup()
					.addGap(18)
					.addComponent(storyScreen3Image, GroupLayout.PREFERRED_SIZE, 766, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_storyScreen3.setVerticalGroup(
			gl_storyScreen3.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_storyScreen3.createSequentialGroup()
					.addComponent(storyScreen3Image, GroupLayout.PREFERRED_SIZE, 492, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
					.addComponent(storyScreen3contButton, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE))
		);
		storyScreen3.setLayout(gl_storyScreen3);

		///////////////////////////////////////////////
		//AcceptancePanel
		///////////////////////////////////////////////

		JPanel accaptence = new JPanel();
		accaptence.setBackground(Color.BLACK);
		contentPane.add(accaptence, "5");

		JLabel accaptencePanelimg = new JLabel("");
		accaptencePanelimg.setBackground(Color.BLACK);
		accaptencePanelimg.setOpaque(true);

		JButton gaveUpButton = new JButton("Gave up like a loser!");
		gaveUpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.first(contentPane);
			}
		});
		gaveUpButton.setForeground(Color.WHITE);
		gaveUpButton.setBackground(Color.BLACK);

		JButton acceptButton = new JButton("Accept the Mission!");
		acceptButton.setForeground(Color.WHITE);
		acceptButton.setBackground(Color.BLACK);
		GroupLayout gl_accaptence = new GroupLayout(accaptence);
		gl_accaptence.setHorizontalGroup(
				gl_accaptence.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_accaptence.createSequentialGroup()
						.addContainerGap()
						.addComponent(accaptencePanelimg, GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
						.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_accaptence.createSequentialGroup()
						.addGap(137)
						.addComponent(gaveUpButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(253)
						.addComponent(acceptButton)
						.addGap(136))
				);
		gl_accaptence.setVerticalGroup(
				gl_accaptence.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_accaptence.createSequentialGroup()
						.addComponent(accaptencePanelimg, GroupLayout.PREFERRED_SIZE, 383, GroupLayout.PREFERRED_SIZE)
						.addGap(77)
						.addGroup(gl_accaptence.createParallelGroup(Alignment.BASELINE)
								.addComponent(gaveUpButton)
								.addComponent(acceptButton))
						.addContainerGap())
				);
		accaptence.setLayout(gl_accaptence);
		
		///////////////////////////////////////////////
		//mainScreenOutside
		///////////////////////////////////////////////
		
		JPanel mainScreenOutside = new JPanel();
		contentPane.add(mainScreenOutside, "6");
		
		///////////////////////////////////////////////
		//guardPanel
		///////////////////////////////////////////////
		
		JPanel guardPanel = new JPanel();
		contentPane.add(guardPanel, "7");
		
		///////////////////////////////////////////////
		//mainScreenInside
		///////////////////////////////////////////////
		
		JPanel mainScreenInside = new JPanel();
		contentPane.add(mainScreenInside, "8");
		
	}
	public void createEvents(){
			
		c1.show(contentPane, "1");
		
		
	}
}
