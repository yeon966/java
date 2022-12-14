import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Prac4 extends JFrame {
	
	
	
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prac4 frame = new Prac4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Prac4() {
		Set<Player> team = new HashSet<>();
		team.add(new Player(1, "김승규"));
		team.add(new Player(12, "송범근"));
		team.add(new Player(21, "조현우"));
		team.add(new Player(20, "권경원"));
		team.add(new Player(15, "김문환"));
		team.add(new Player(4, "김민재"));
		team.add(new Player(19, "김영권"));
		team.add(new Player(3, "김진수"));
		team.add(new Player(23, "김태환"));
		team.add(new Player(2, "윤종규"));
		team.add(new Player(24, "조유민"));
		team.add(new Player(14, "홍철"));
		team.add(new Player(22, "권창훈"));
		team.add(new Player(17, "나상호"));
		team.add(new Player(8, "백승호"));
		team.add(new Player(13, "손준호"));
		team.add(new Player(7, "손흥민"));
		team.add(new Player(26, "송민규"));
		team.add(new Player(18, "이강인"));
		team.add(new Player(10, "이재성"));
		team.add(new Player(5, "정우영"));
		team.add(new Player(25, "정우영"));
		team.add(new Player(6, "황인범"));
		team.add(new Player(11, "황희찬"));
		team.add(new Player(9, "조규성"));
		team.add(new Player(16, "황의조"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("국가대표 선발 명단");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 15));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("추가");
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("제거");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(Color.WHITE);
		panel_2.add(panel_4_1);
		panel_4_1.setLayout(new GridLayout(5, 6, 10, 10));
		for (Player p : team) {
			
		}
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setBackground(Color.WHITE);
		panel_2.add(panel_5_1);
		panel_5_1.setLayout(new GridLayout(11, 1, 10, 10));
	}
}
