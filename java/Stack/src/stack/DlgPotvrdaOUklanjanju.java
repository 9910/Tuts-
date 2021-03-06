package stack;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DlgPotvrdaOUklanjanju extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private boolean izbor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgPotvrdaOUklanjanju dialog = new DlgPotvrdaOUklanjanju();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgPotvrdaOUklanjanju() {
		setModal(true);
		setBounds(100, 100, 450, 300);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{434, 0};
		gridBagLayout.rowHeights = new int[]{261, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagConstraints gbc_contentPanel = new GridBagConstraints();
		gbc_contentPanel.fill = GridBagConstraints.BOTH;
		gbc_contentPanel.gridx = 0;
		gbc_contentPanel.gridy = 0;
		getContentPane().add(contentPanel, gbc_contentPanel);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblJesteLiSigurno = new JLabel("Jeste li sigurno da ocete da obrisete element?");
			GridBagConstraints gbc_lblJesteLiSigurno = new GridBagConstraints();
			gbc_lblJesteLiSigurno.insets = new Insets(0, 0, 5, 5);
			gbc_lblJesteLiSigurno.gridx = 4;
			gbc_lblJesteLiSigurno.gridy = 1;
			contentPanel.add(lblJesteLiSigurno, gbc_lblJesteLiSigurno);
		}
		{
			JButton btnDa = new JButton("Da");
			btnDa.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					izbor = true;
					setVisible(false);
				}
			});
			GridBagConstraints gbc_btnDa = new GridBagConstraints();
			gbc_btnDa.insets = new Insets(0, 0, 0, 5);
			gbc_btnDa.gridx = 3;
			gbc_btnDa.gridy = 3;
			contentPanel.add(btnDa, gbc_btnDa);
		}
		{
			JButton btnNe = new JButton("Ne");
			btnNe.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					izbor = false;
					setVisible(false);
				}
			});
			GridBagConstraints gbc_btnNe = new GridBagConstraints();
			gbc_btnNe.gridx = 5;
			gbc_btnNe.gridy = 3;
			contentPanel.add(btnNe, gbc_btnNe);
		}
	}

	public boolean isIzbor() {
		return izbor;
	}

	public void setIzbor(boolean izbor) {
		this.izbor = izbor;
	}

}
