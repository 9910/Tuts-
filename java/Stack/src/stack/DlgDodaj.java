package stack;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import geometrija.Tacka;

import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class DlgDodaj extends JDialog {

	private boolean dodaj;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtDuzina;
	private JTextField txtGornjaTacka;
	JComboBox cbxBojaIvice = new JComboBox();
	JComboBox cbxBojaUnutrasnjosti = new JComboBox();
	private int duzinaStranice;
	private Tacka goreLevo;
	private String bojaIvice;
	private String bojaUnutrasnjosti;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgDodaj dialog = new DlgDodaj();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgDodaj() {
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblUnesiGornjuLevu = new JLabel("Gornja Leva Tacka(X,Y)");
			GridBagConstraints gbc_lblUnesiGornjuLevu = new GridBagConstraints();
			gbc_lblUnesiGornjuLevu.gridwidth = 2;
			gbc_lblUnesiGornjuLevu.insets = new Insets(0, 0, 5, 5);
			gbc_lblUnesiGornjuLevu.anchor = GridBagConstraints.EAST;
			gbc_lblUnesiGornjuLevu.gridx = 0;
			gbc_lblUnesiGornjuLevu.gridy = 0;
			contentPanel.add(lblUnesiGornjuLevu, gbc_lblUnesiGornjuLevu);
		}
		{
			txtGornjaTacka = new JTextField();
			GridBagConstraints gbc_txtGornjaTacka = new GridBagConstraints();
			gbc_txtGornjaTacka.insets = new Insets(0, 0, 5, 0);
			gbc_txtGornjaTacka.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtGornjaTacka.gridx = 2;
			gbc_txtGornjaTacka.gridy = 0;
			contentPanel.add(txtGornjaTacka, gbc_txtGornjaTacka);
			txtGornjaTacka.setColumns(10);
		}
		{
			JLabel lblDuzina = new JLabel("Duzina");
			GridBagConstraints gbc_lblDuzina = new GridBagConstraints();
			gbc_lblDuzina.gridwidth = 2;
			gbc_lblDuzina.insets = new Insets(0, 0, 5, 5);
			gbc_lblDuzina.gridx = 0;
			gbc_lblDuzina.gridy = 1;
			contentPanel.add(lblDuzina, gbc_lblDuzina);
		}
		{
			txtDuzina = new JTextField();
			GridBagConstraints gbc_txtDuzina = new GridBagConstraints();
			gbc_txtDuzina.insets = new Insets(0, 0, 5, 0);
			gbc_txtDuzina.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtDuzina.gridx = 2;
			gbc_txtDuzina.gridy = 1;
			contentPanel.add(txtDuzina, gbc_txtDuzina);
			txtDuzina.setColumns(10);
		}
		{
			JLabel lblBojaIvice = new JLabel("Boja ivice");
			GridBagConstraints gbc_lblBojaIvice = new GridBagConstraints();
			gbc_lblBojaIvice.gridwidth = 2;
			gbc_lblBojaIvice.insets = new Insets(0, 0, 5, 5);
			gbc_lblBojaIvice.gridx = 0;
			gbc_lblBojaIvice.gridy = 2;
			contentPanel.add(lblBojaIvice, gbc_lblBojaIvice);
		}
		{
			cbxBojaIvice.setModel(new DefaultComboBoxModel(new String[] {"", "Crna", "Bela", "Plava", "Zelena", "Zuta", "Pink", "Crvena"}));
			cbxBojaIvice.setSelectedIndex(0);
			GridBagConstraints gbc_cbxBojaIvice = new GridBagConstraints();
			gbc_cbxBojaIvice.insets = new Insets(0, 0, 5, 0);
			gbc_cbxBojaIvice.fill = GridBagConstraints.HORIZONTAL;
			gbc_cbxBojaIvice.gridx = 2;
			gbc_cbxBojaIvice.gridy = 2;
			contentPanel.add(cbxBojaIvice, gbc_cbxBojaIvice);
		}
		{
			JLabel lblBojaUnutrasnjosti = new JLabel("Boja unutrasnjosti");
			GridBagConstraints gbc_lblBojaUnutrasnjosti = new GridBagConstraints();
			gbc_lblBojaUnutrasnjosti.gridwidth = 2;
			gbc_lblBojaUnutrasnjosti.insets = new Insets(0, 0, 0, 5);
			gbc_lblBojaUnutrasnjosti.gridx = 0;
			gbc_lblBojaUnutrasnjosti.gridy = 3;
			contentPanel.add(lblBojaUnutrasnjosti, gbc_lblBojaUnutrasnjosti);
		}
		{
			cbxBojaUnutrasnjosti.setModel(new DefaultComboBoxModel(new String[] {"", "Crna", "Bela", "Plava", "Zelena", "Zuta", "Pink", "Crvena"}));
			GridBagConstraints gbc_cbxBojaUnutrasnjosti = new GridBagConstraints();
			gbc_cbxBojaUnutrasnjosti.fill = GridBagConstraints.HORIZONTAL;
			gbc_cbxBojaUnutrasnjosti.gridx = 2;
			gbc_cbxBojaUnutrasnjosti.gridy = 3;
			contentPanel.add(cbxBojaUnutrasnjosti, gbc_cbxBojaUnutrasnjosti);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Dodaj");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String niz[] = txtGornjaTacka.getText().toString().split(",", 2);
						int x = Integer.parseInt(niz[0]);
						int y = Integer.parseInt(niz[1]);
						System.out.println(x + " " + y);
						goreLevo = new Tacka(x, y);
						duzinaStranice = Integer.parseInt(txtDuzina.getText().toString());
						bojaIvice = cbxBojaIvice.getSelectedItem().toString();
						bojaUnutrasnjosti = cbxBojaUnutrasnjosti.getSelectedItem().toString();
						dodaj = true;
						setVisible(false);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Odustani");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dodaj = false;
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public int getDuzinaStranice() {
		return duzinaStranice;
	}

	public void setDuzinaStranice(int duzinaStranice) {
		this.duzinaStranice = duzinaStranice;
	}

	public Tacka getGoreLevo() {
		return goreLevo;
	}

	public void setGoreLevo(Tacka goreLevo) {
		this.goreLevo = goreLevo;
	}

	public String getBojaIvice() {
		return bojaIvice;
	}

	public void setBojaIvice(String bojaIvice) {
		this.bojaIvice = bojaIvice;
	}

	public String getBojaUnutrasnjosti() {
		return bojaUnutrasnjosti;
	}

	public void setBojaUnutrasnjosti(String bojaUnutrasnjosti) {
		this.bojaUnutrasnjosti = bojaUnutrasnjosti;
	}

	public boolean isDodaj() {
		return dodaj;
	}

	public void setDodaj(boolean dodaj) {
		this.dodaj = dodaj;
	}

}
