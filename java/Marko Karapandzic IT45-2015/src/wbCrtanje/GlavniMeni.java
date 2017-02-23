package wbCrtanje;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import geometrija.Krug;
import geometrija.Kvadrat;
import geometrija.Linija;
import geometrija.Pravougaonik;
import geometrija.Tacka;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.List;

import javax.swing.JToggleButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GlavniMeni extends JFrame {

	private JPanel contentPane;
	JToggleButton tglbtnTacka = new JToggleButton("Tacka");
	JToggleButton tglbtnLinija = new JToggleButton("Linija");
	JToggleButton tglbtnKvadrat = new JToggleButton("Kvadrat");
	JToggleButton tglbtnPravougaonik = new JToggleButton("Pravougaonik");
	JToggleButton tglbtnKrug = new JToggleButton("Krug");
	Color bojaIvice = Color.BLACK;
	Color bojaUnutrasnjosti = Color.BLACK;
	Tacka[] nizT = new Tacka[2];
	int index = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GlavniMeni frame = new GlavniMeni();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void setSelected(JToggleButton model, boolean selected){
	    if (selected)
		      model.setSelected(true);
		    else 
		      model.setSelected(false);
	}


	/**
	 * Create the frame.
	 */
	public GlavniMeni() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		tglbtnLinija.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tglbtnLinija.isSelected()){
					tglbtnTacka.setSelected(false);
					tglbtnKvadrat.setSelected(false);
					tglbtnPravougaonik.setSelected(false);
					tglbtnKrug.setSelected(false);
				}
			}
		});
		
		GridBagConstraints gbc_tglbtnTacka = new GridBagConstraints();
		gbc_tglbtnTacka.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnTacka.gridx = 6;
		gbc_tglbtnTacka.gridy = 0;
		tglbtnTacka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tglbtnTacka.isSelected()){
					tglbtnLinija.setSelected(false);
					tglbtnKvadrat.setSelected(false);
					tglbtnPravougaonik.setSelected(false);
					tglbtnKrug.setSelected(false);
				}
			}
		});
		contentPane.add(tglbtnTacka, gbc_tglbtnTacka);
		GridBagConstraints gbc_tglbtnLinija = new GridBagConstraints();
		gbc_tglbtnLinija.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnLinija.gridx = 8;
		gbc_tglbtnLinija.gridy = 0;
		contentPane.add(tglbtnLinija, gbc_tglbtnLinija);
		
		tglbtnKvadrat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tglbtnKvadrat.isSelected()){
					tglbtnLinija.setSelected(false);
					tglbtnTacka.setSelected(false);
					tglbtnPravougaonik.setSelected(false);
					tglbtnKrug.setSelected(false);
				}
			}
		});
		GridBagConstraints gbc_tglbtnKvadrat = new GridBagConstraints();
		gbc_tglbtnKvadrat.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnKvadrat.gridx = 9;
		gbc_tglbtnKvadrat.gridy = 0;
		contentPane.add(tglbtnKvadrat, gbc_tglbtnKvadrat);
		
		tglbtnPravougaonik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tglbtnPravougaonik.isSelected()){
					tglbtnLinija.setSelected(false);
					tglbtnKvadrat.setSelected(false);
					tglbtnTacka.setSelected(false);
					tglbtnKrug.setSelected(false);
				}
			}
		});
		GridBagConstraints gbc_tglbtnPravougaonik = new GridBagConstraints();
		gbc_tglbtnPravougaonik.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnPravougaonik.gridx = 10;
		gbc_tglbtnPravougaonik.gridy = 0;
		contentPane.add(tglbtnPravougaonik, gbc_tglbtnPravougaonik);
		
		tglbtnKrug.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tglbtnKrug.isSelected()){
					tglbtnLinija.setSelected(false);
					tglbtnKvadrat.setSelected(false);
					tglbtnPravougaonik.setSelected(false);
					tglbtnTacka.setSelected(false);
				}
			}
		});
		GridBagConstraints gbc_tglbtnKrug = new GridBagConstraints();
		gbc_tglbtnKrug.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnKrug.gridx = 11;
		gbc_tglbtnKrug.gridy = 0;
		contentPane.add(tglbtnKrug, gbc_tglbtnKrug);
		
		JButton btnBoja = new JButton("Boja");
		GridBagConstraints gbc_btnBoja = new GridBagConstraints();
		gbc_btnBoja.insets = new Insets(0, 0, 5, 5);
		gbc_btnBoja.gridx = 13;
		gbc_btnBoja.gridy = 0;
		contentPane.add(btnBoja, gbc_btnBoja);
		
		JButton btnSelektuj = new JButton("Selektuj");
		GridBagConstraints gbc_btnSelektuj = new GridBagConstraints();
		gbc_btnSelektuj.insets = new Insets(0, 0, 5, 5);
		gbc_btnSelektuj.gridx = 14;
		gbc_btnSelektuj.gridy = 0;
		contentPane.add(btnSelektuj, gbc_btnSelektuj);
		
		//Crtanje i pozivanje dlgBoja
		DlgBoja dlgB = new DlgBoja();
		bojaIvice = dlgB.getBojaIvice();
		bojaUnutrasnjosti = dlgB.getBojaUnutrasnjosti();
		JPanel pnlCrtanje = new JPanel();
		pnlCrtanje.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent klik) {
				if(tglbtnTacka.isSelected()){ //Tacka
					int x = klik.getX();
					int y = klik.getY();
					bojaIvice = bojaIvice;
					bojaUnutrasnjosti = bojaUnutrasnjosti;
					new Tacka(x, y, bojaIvice, bojaUnutrasnjosti).crtajSe(pnlCrtanje.getGraphics());
				} else if(tglbtnLinija.isSelected()){ //Linija
					nizT[index] = new Tacka(klik.getX(), klik.getY());
					index++;
					if(index == 2){
						new Linija(nizT[0], nizT[1]).crtajSe(pnlCrtanje.getGraphics());
						index = 0;
					}
				} else if(tglbtnKvadrat.isSelected()){ //Kvadrat
					DlgDodajKvadrat dlgDK = new DlgDodajKvadrat();
					dlgDK.setVisible(true);
					new Kvadrat(
							new Tacka(klik.getX(), klik.getY()), 
							dlgDK.getDuzinaStranice(), 
							bojaIvice,
							bojaUnutrasnjosti
					).crtajSe(pnlCrtanje.getGraphics());
				} else if(tglbtnPravougaonik.isSelected()){ //Pravougaonik
					DlgDodajPravougaonik dlgDP = new DlgDodajPravougaonik();
					dlgDP.setVisible(true);
					new Pravougaonik(
							new Tacka(klik.getX(), klik.getY()),
							dlgDP.getVisina(),
							dlgDP.getSirina(),
							bojaIvice,
							bojaUnutrasnjosti
					).crtajSe(pnlCrtanje.getGraphics());
				} else if(tglbtnKrug.isSelected()){ //Krug
					DlgDodajKrug dlgDKrug = new DlgDodajKrug();
					dlgDKrug.setVisible(true);
					new Krug(
							new Tacka(klik.getX(), klik.getY()),
							dlgDKrug.getPoluPrecnik(),
							bojaIvice,
							bojaUnutrasnjosti
					).crtajSe(pnlCrtanje.getGraphics());;
				}
			}
		});
		pnlCrtanje.setForeground(Color.BLACK);
		GridBagConstraints gbc_pnlCrtanje = new GridBagConstraints();
		gbc_pnlCrtanje.gridwidth = 19;
		gbc_pnlCrtanje.gridheight = 11;
		gbc_pnlCrtanje.insets = new Insets(0, 0, 5, 0);
		gbc_pnlCrtanje.fill = GridBagConstraints.BOTH;
		gbc_pnlCrtanje.gridx = 0;
		gbc_pnlCrtanje.gridy = 1;
		contentPane.add(pnlCrtanje, gbc_pnlCrtanje);
	}
}
