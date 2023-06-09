import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Main 
{
	private static char turn = 'X';
	private static JLabel title2;
	private static ArrayList<JLabel> labels = new ArrayList<JLabel>();
	private static String winner = " ";
	private static char[][] chars = new char[3][3];
	private static boolean enabled = true;
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Tic Tac Toe");
		frame.setSize(500,570);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new BorderLayout());
		frame.setBackground(Color.white);
		
		JLabel title = new JLabel("Tic Tac Toe Game");
		title.setBackground(Color.black);
		title.setForeground(Color.orange);
		title.setOpaque(true);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		title.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.add(title, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 3, 7, 7));
		panel.setBackground(Color.blue);
		
		title2 = new JLabel("Player 1, it's your turn");
		title2.setHorizontalAlignment(SwingConstants.CENTER);
		title2.setBackground(Color.black);
		title2.setForeground(Color.orange);
		title2.setOpaque(true);
		title2.setFont(new Font("Tahoma", Font.BOLD, 25));
		title2.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				JLabel label = new JLabel(" ");
				label.setOpaque(true);
				label.setBackground(Color.black);
				label.setFont(new Font("Tahoma", Font.BOLD, 60));
				label.setHorizontalAlignment(SwingConstants.CENTER);
				int m = i;
				int n = j;
				label.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent e) {}
					
					@Override
					public void mousePressed(MouseEvent e) {}
					
					@Override
					public void mouseExited(MouseEvent e) {}
					
					@Override
					public void mouseEntered(MouseEvent e) {}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						if (enabled) {
							if (label.getText().toString().equals(" ")) {
								label.setText(String.valueOf(turn));
								chars[m][n]=turn;
								
								if (turn=='X') {
									label.setForeground(Color.red);
									turn = 'O';
									title2.setText("Player 2, it's your turn");
									title2.setForeground(Color.orange);
								}else {
									label.setForeground(Color.green);
									turn = 'X'; 
									title2.setText("Player 1, it's your turn");
									title2.setForeground(Color.orange);
								}
								
							}else {
								title2.setText("Position taken!");
							}
							if(checkWinner() && winner.equals("X")) {
								title2.setText("Player 1 wins!");
								title2.setForeground(Color.MAGENTA);
								enabled = false;
							}else if(checkWinner() && winner.equals("O")) {
								title2.setText("Player 2 wins!");
								title2.setForeground(Color.GREEN);
								enabled = false;
							}else if(!draw()) {
								title2.setText("Draw");
								enabled = false;
							}
						}
					}
				});
				labels.add(label);
				panel.add(label);
			}
		}
		
		frame.add(panel, BorderLayout.CENTER);
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2, 1));
		p.add(title2);
		
		JButton btn = new JButton("New Game");
		btn.setBackground(Color.ORANGE);
		btn.setForeground(Color.BLUE);
		btn.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				reboot();
			}
		});
		
		p.add(btn);
		
		frame.add(p, BorderLayout.SOUTH);
		frame.setVisible(true);
	}
	
	private static boolean checkWinner() {
		boolean win = false;
		if(chars[0][0]==chars[0][1] && chars[0][0]==chars[0][2] && chars[0][0]!=0) {
			win = true;
			winner = String.valueOf(chars[0][0]);
		}else if(chars[1][0]==chars[1][1] && chars[1][0]==chars[1][2] && chars[1][0]!=0) {
			win = true;
			winner = String.valueOf(chars[1][0]);
		}else if(chars[2][0]==chars[2][1] && chars[2][0]==chars[2][2] && chars[2][0]!=0) {
			win = true;
			winner = String.valueOf(chars[2][0]);
		}else if(chars[0][0]==chars[1][0] && chars[0][0]==chars[2][0] && chars[0][0]!=0) {
			win = true;
			winner = String.valueOf(chars[0][0]);
		}else if(chars[0][1]==chars[1][1] && chars[0][1]==chars[2][1] && chars[0][1]!=0) {
			win = true;
			winner = String.valueOf(chars[0][1]);
		}else if(chars[0][2]==chars[1][2] && chars[0][2]==chars[2][2] && chars[0][2]!=0) {
			win = true;
			winner = String.valueOf(chars[0][2]);
		}else if(chars[0][0]==chars[1][1] && chars[0][0]==chars[2][2] && chars[0][0]!=0) {
			win = true;
			winner = String.valueOf(chars[0][0]);
		}else if(chars[2][0]==chars[1][1] && chars[2][0]==chars[0][2] && chars[2][0]!=0) {
			win = true;
			winner = String.valueOf(chars[2][0]);
		}
		return win;
	}
	
	private static void reboot() {
		chars = new char[3][3];
		winner = " ";
		title2.setText("Player 1, it's your turn");
		title2.setForeground(Color.orange);
		turn = 'X';
		enabled = true;
		for(JLabel label : labels) {
			label.setText(" ");
		}	
	}
	private static boolean draw() {
		boolean draw = false;
		for(char[] a : chars) {
			for(char b : a) {
				if(b==0) {
					draw = true;
					break;
				}
			}
		}
		return draw;
	}
}
