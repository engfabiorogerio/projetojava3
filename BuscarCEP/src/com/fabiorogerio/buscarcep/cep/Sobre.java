package com.fabiorogerio.buscarcep.cep;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Sobre extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Sobre dialog = new Sobre();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setModal(true);
		setBounds(new Rectangle(150, 150, 0, 0));
		setTitle("Sobre");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/com/fabiorogerio/buscarcep/img/info_icon.ico")));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 261, 444, 10);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
		}
		{
			JLabel lblNewLabel = new JLabel("Projeto Java Buscar_Cep vers\u00E3o 1.0");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setToolTipText("");
			lblNewLabel.setBounds(23, 24, 380, 22);
			getContentPane().add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("@Author F\u00E1bio Rogerio");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(50, 57, 353, 30);
			getContentPane().add(lblNewLabel_1);
		}
		{
			JButton btnGitHub = new JButton("");
			btnGitHub.addActionListener(new ActionListener() {				
				public void actionPerformed(ActionEvent e) {
					link("https://github.com/engfabiorogerio");
				}
			});
			btnGitHub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnGitHub.setToolTipText("Perfil GitHub");
			btnGitHub.setIcon(new ImageIcon(Sobre.class.getResource("/com/fabiorogerio/buscarcep/img/github_icon.ico")));
			btnGitHub.setBackground(SystemColor.control);
			btnGitHub.setBounds(199, 98, 48, 48);
			getContentPane().add(btnGitHub);
		}
		{
			JButton btnLinkedin = new JButton("");
			btnLinkedin.setToolTipText("Perfil linkedin");
			btnLinkedin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					link("www.linkedin.com/in/fabiorogerio1");
				}
			});
			btnLinkedin.setIcon(new ImageIcon(Sobre.class.getResource("/com/fabiorogerio/buscarcep/img/linkedin.ico")));
			btnLinkedin.setBackground(SystemColor.control);
			btnLinkedin.setBounds(199, 168, 48, 48);
			getContentPane().add(btnLinkedin);
		}
		
		
		}
		private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		try {
			
			URI uri = new URI(site);
			desktop.browse(uri);			
			
		}catch (Exception e){
			System.out.println(e);
		}
	}

}
