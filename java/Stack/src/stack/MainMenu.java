package stack;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import geometrija.Kvadrat;
import geometrija.Tacka;

import java.awt.GridBagLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;

public class MainMenu extends JFrame {
	
	DefaultListModel<Kvadrat> kv = new DefaultListModel<>();

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{130, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JList lstKvadrati = new JList();
		lstKvadrati.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lstKvadrati.setSelectedIndex(0);
		GridBagConstraints gbc_lstKvadrati = new GridBagConstraints();
		gbc_lstKvadrati.insets = new Insets(0, 0, 5, 0);
		gbc_lstKvadrati.fill = GridBagConstraints.BOTH;
		gbc_lstKvadrati.gridx = 2;
		gbc_lstKvadrati.gridy = 0;
		contentPane.add(lstKvadrati, gbc_lstKvadrati);
		lstKvadrati.setModel(kv);
		
		//Dodavanje na Stack
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DlgDodaj dlgD = new DlgDodaj();
				dlgD.setVisible(true);
				
				if(dlgD.isDodaj()){
					Kvadrat kvad = new Kvadrat(dlgD.getGoreLevo(), dlgD.getDuzinaStranice(), dlgD.getBojaIvice(), dlgD.getBojaUnutrasnjosti());
					kv.addElement(kvad);
				}
			}
		});
		
		GridBagConstraints gbc_btnDodaj = new GridBagConstraints();
		gbc_btnDodaj.insets = new Insets(0, 0, 5, 5);
		gbc_btnDodaj.gridx = 0;
		gbc_btnDodaj.gridy = 0;
		contentPane.add(btnDodaj, gbc_btnDodaj);
		
		JButton btnUkloni = new JButton("Ukloni");
		btnUkloni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(kv.getSize() - 1 >= 0){
					DlgPotvrdaOUklanjanju dlgP = new DlgPotvrdaOUklanjanju();
					dlgP.setVisible(true);
					if(dlgP.isIzbor())
						kv.removeElementAt(kv.getSize() - 1);
				}
			}
		});
		GridBagConstraints gbc_btnUkloni = new GridBagConstraints();
		gbc_btnUkloni.insets = new Insets(0, 0, 0, 5);
		gbc_btnUkloni.gridx = 0;
		gbc_btnUkloni.gridy = 1;
		contentPane.add(btnUkloni, gbc_btnUkloni);
	}

}
