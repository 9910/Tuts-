package wbCrtanje;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;
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

public class DlgDodajKvadrat extends JDialog {

	private boolean dodaj;
	private JFrame mainFrame;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtDuzina;
	private int duzinaStranice;
	private Tacka goreLevo;
	private Color bojaIvice;
	private Color bojaUnutrasnjosti;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgDodajKvadrat dialog = new DlgDodajKvadrat();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgDodajKvadrat() {
		setModal(true);
		setBounds(100, 100, 200, 156);
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
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Dodaj");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						duzinaStranice = Integer.parseInt(txtDuzina.getText().toString());
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


	public boolean isDodaj() {
		return dodaj;
	}

	public void setDodaj(boolean dodaj) {
		this.dodaj = dodaj;
	}

	public Color getBojaIvice() {
		return bojaIvice;
	}

	public void setBojaIvice(Color bojaIvice) {
		this.bojaIvice = bojaIvice;
	}

	public Color getBojaUnutrasnjosti() {
		return bojaUnutrasnjosti;
	}

	public void setBojaUnutrasnjosti(Color bojaUnutrasnjosti) {
		this.bojaUnutrasnjosti = bojaUnutrasnjosti;
	}

}