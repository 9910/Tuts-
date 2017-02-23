package wbCrtanje;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgDodajKrug extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtPoluPrecnik;
	private int poluPrecnik;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgDodajKrug dialog = new DlgDodajKrug();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgDodajKrug() {
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblPoluPrecnik = new JLabel("Polu precnik");
			GridBagConstraints gbc_lblPoluPrecnik = new GridBagConstraints();
			gbc_lblPoluPrecnik.insets = new Insets(0, 0, 0, 5);
			gbc_lblPoluPrecnik.anchor = GridBagConstraints.EAST;
			gbc_lblPoluPrecnik.gridx = 0;
			gbc_lblPoluPrecnik.gridy = 3;
			contentPanel.add(lblPoluPrecnik, gbc_lblPoluPrecnik);
		}
		{
			txtPoluPrecnik = new JTextField();
			GridBagConstraints gbc_txtPoluPrecnik = new GridBagConstraints();
			gbc_txtPoluPrecnik.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtPoluPrecnik.gridx = 1;
			gbc_txtPoluPrecnik.gridy = 3;
			contentPanel.add(txtPoluPrecnik, gbc_txtPoluPrecnik);
			txtPoluPrecnik.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnPotvrdi = new JButton("Potvrdi");
				btnPotvrdi.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						poluPrecnik = Integer.parseInt(txtPoluPrecnik.getText());
						setVisible(false);
					}
				});
				btnPotvrdi.setActionCommand("OK");
				buttonPane.add(btnPotvrdi);
				getRootPane().setDefaultButton(btnPotvrdi);
			}
			{
				JButton btnOdustani = new JButton("Odustani");
				btnOdustani.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				btnOdustani.setActionCommand("Cancel");
				buttonPane.add(btnOdustani);
			}
		}
	}

	public int getPoluPrecnik() {
		return poluPrecnik;
	}

	public void setPoluPrecnik(int poluPrecnik) {
		this.poluPrecnik = poluPrecnik;
	}

}
