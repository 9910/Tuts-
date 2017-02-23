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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgBoja extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JFrame mainFrame;
	private Color bojaIvice;
	private Color bojaUnutrasnjosti;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgBoja dialog = new DlgBoja();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgBoja() {
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JButton btnBojaIvice = new JButton("Boja Ivice");
			btnBojaIvice.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					bojaIvice = JColorChooser.showDialog(
							mainFrame, 
							"Izaberite boju ivice", 
							Color.BLACK
					);
				}
			});
			contentPanel.add(btnBojaIvice, BorderLayout.WEST);
		}
		{
			JButton btnBojaUnutrasnjosti = new JButton("Boja Unutrasnjosti");
			btnBojaUnutrasnjosti.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					bojaUnutrasnjosti = JColorChooser.showDialog(
							mainFrame, 
							"Izaberite boju unutrasnjosti", 
							Color.BLACK
					);
				}
			});
			contentPanel.add(btnBojaUnutrasnjosti, BorderLayout.EAST);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnIzadji = new JButton("Izadji");
				btnIzadji.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				btnIzadji.setActionCommand("Cancel");
				buttonPane.add(btnIzadji);
			}
		}
	}

	public JFrame getMainFrame() {
		return mainFrame;
	}

	public void setMainFrame(JFrame mainFrame) {
		this.mainFrame = mainFrame;
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
