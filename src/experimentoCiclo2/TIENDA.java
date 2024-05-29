package experimentoCiclo2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;

public class TIENDA extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	//Lanza la aplicación
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TIENDA frame = new TIENDA();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//CREA LA GUI
	public TIENDA() {
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.BLACK);
		menuBar.setBackground(Color.BLACK);
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		mnArchivo.setForeground(Color.WHITE);
		menuBar.add(mnArchivo);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setForeground(Color.WHITE);
		menuBar.add(mnMantenimiento);
		
		JMenu mnClientes = new JMenu("Clientes");
		mnMantenimiento.add(mnClientes);
		
		JMenuItem mntmIngresoCli = new JMenuItem("Ingreso");
		mnClientes.add(mntmIngresoCli);
		
		JMenuItem mntmModificacionCli = new JMenuItem("Modificación");
		mnClientes.add(mntmModificacionCli);
		
		JMenuItem mntmConsultacCli = new JMenuItem("Consulta");
		mnClientes.add(mntmConsultacCli);
		
		JMenuItem mntmEliminacionCli = new JMenuItem("Eliminación");
		mnClientes.add(mntmEliminacionCli);
		
		JMenuItem mntmListadoCli = new JMenuItem("Listado");
		mnClientes.add(mntmListadoCli);
		
		JMenu mnProductos = new JMenu("Productos");
		mnMantenimiento.add(mnProductos);
		
		JMenuItem mntmIngresoProd = new JMenuItem("Ingreso");
		mnProductos.add(mntmIngresoProd);
		
		JMenuItem mntmModificacionProd = new JMenuItem("Modificación");
		mnProductos.add(mntmModificacionProd);
		
		JMenuItem mntmConsultaProd = new JMenuItem("Consulta");
		mnProductos.add(mntmConsultaProd);
		
		JMenuItem mntmEliminacionProd = new JMenuItem("Eliminación");
		mnProductos.add(mntmEliminacionProd);
		
		JMenuItem mntmListadoProd = new JMenuItem("Listado");
		mnProductos.add(mntmListadoProd);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
