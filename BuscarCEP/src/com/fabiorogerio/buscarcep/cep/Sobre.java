package com.fabiorogerio.buscarcep.cep;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
			JButton btnNewButton = new JButton("");
			btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnNewButton.setToolTipText("Perfil GitHub");
			btnNewButton.setIcon(new ImageIcon(Sobre.class.getResource("/com/fabiorogerio/buscarcep/img/github_icon.ico")));
			btnNewButton.setBackground(SystemColor.control);
			btnNewButton.setBounds(199, 98, 48, 48);
			getContentPane().add(btnNewButton);
		}
		{
			JButton btnNewButton_1 = new JButton("");
			btnNewButton_1.setToolTipText("Perfil linkedin");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton_1.setIcon(new ImageIcon(Sobre.class.getResource("/com/fabiorogerio/buscarcep/img/linkedin.ico")));
			btnNewButton_1.setBackground(SystemColor.control);
			btnNewButton_1.setBounds(199, 168, 48, 48);
			getContentPane().add(btnNewButton_1);
		}
	}

}
