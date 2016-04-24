package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaPrincipal extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane, panelSuperior, panelTablero, panelInferior;
	private JLabel etiquetaSuperior;
	private JButton btnCambiarJugador, btnDeshacer, btnRehacer, btnSalir, btnGuardar;
	private JButton[][] tablero;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setTitle("Sokoban");
		{
			panelSuperior = new JPanel();
			panelSuperior.setLayout(new FlowLayout());
			{
				etiquetaSuperior = new JLabel("Jugando como: ");
			}
			{
				btnCambiarJugador = new JButton("Cambiar");
				btnCambiarJugador.addActionListener(this);
			}
			panelSuperior.add(etiquetaSuperior);
			panelSuperior.add(btnCambiarJugador);
			contentPane.add(panelSuperior, BorderLayout.NORTH);
		}
		
		{
			panelTablero = new JPanel();
			panelTablero.setLayout(new GridLayout(20, 20));
			{
				tablero = new JButton[20][20];
				for (int i = 0; i < tablero.length; i++) {
					for (int j = 0; j < tablero[i].length; j++) {
						tablero[i][j] = new JButton();
						tablero[i][j].addActionListener(this);
						panelTablero.add(tablero[i][j]);
					}
				}
			}
			contentPane.add(panelTablero, BorderLayout.CENTER);
		}
		
		{
			panelInferior = new JPanel();
			panelInferior.setLayout(new FlowLayout());
			{
				btnDeshacer = new JButton("Deshacer");
				btnRehacer = new JButton("Rehacer");
				btnGuardar = new JButton("Guardar");
				btnSalir = new JButton("Salir");
				btnDeshacer.addActionListener(this);
				btnRehacer.addActionListener(this);
				btnGuardar.addActionListener(this);
				btnSalir.addActionListener(this);
			}
			panelInferior.add(btnDeshacer);
			panelInferior.add(btnRehacer);
			panelInferior.add(btnGuardar);
			panelInferior.add(btnSalir);
			contentPane.add(panelInferior, BorderLayout.SOUTH);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
