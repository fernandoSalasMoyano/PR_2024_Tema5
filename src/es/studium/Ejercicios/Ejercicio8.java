package es.studium.Ejercicios;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.WindowEvent;

import java.awt.event.WindowListener;

public class Ejercicio8 implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Menú");
	MenuBar barraMenu = new MenuBar();
	
	Menu mnuArticulos = new Menu("Artículos");
	Menu menuClientes = new Menu("Clientes");
	Menu menuFacturas = new Menu("Facturas");
	
	// Elementos de Articulos
	MenuItem mniArticuloNuevo = new MenuItem("Nuevo Artículo");
	MenuItem mniArticuloEliminar = new MenuItem("Eliminar Artículo");
	MenuItem mniArticuloConsultar = new MenuItem("Consultar Artículo");
	
	// Elementos de Clientes
		MenuItem mniClienteNuevo = new MenuItem("Nuevo Cliente");
		MenuItem mniClienteEliminar = new MenuItem("Eliminar Cliente");
		MenuItem mniClienteConsultar = new MenuItem("Consultar Cliente");
	
	// Elementos de Facturas
	MenuItem mniFacturaNueva = new MenuItem("Nueva Factura");
	MenuItem mniFacturaConsultar = new MenuItem("Consultar Factura");
		
	Dialog dlgMensaje = new Dialog(ventana, "Diálogo con mensaje", true);
	Label lblMensaje = new Label("       ");



	public Ejercicio8()
	{
		ventana.setLayout(new FlowLayout());
		dlgMensaje.setLayout(new FlowLayout());
		lblMensaje.setForeground(Color.green);;
		ventana.addWindowListener(this);

		dlgMensaje.addWindowListener(this);
		mniArticuloNuevo.addActionListener(this);
		mniArticuloEliminar.addActionListener(this);
		mniArticuloConsultar.addActionListener(this);
		
		mniClienteNuevo.addActionListener(this);
		mniClienteEliminar.addActionListener(this);
		mniClienteConsultar.addActionListener(this);
		
		mniFacturaNueva.addActionListener(this);
		mniFacturaConsultar.addActionListener(this);
		
		mnuArticulos.add(mniArticuloNuevo);
		mnuArticulos.add(mniArticuloEliminar);
		mnuArticulos.add(mniArticuloConsultar);
		
		menuClientes.add(mniClienteNuevo);
		menuClientes.add(mniClienteEliminar);
		menuClientes.add(mniClienteConsultar);
		
		menuFacturas.add(mniFacturaNueva);
		menuFacturas.add(mniFacturaConsultar);
		
		barraMenu.add(mnuArticulos);
		barraMenu.add(menuClientes);
		barraMenu.add(menuFacturas);
		
		ventana.setMenuBar(barraMenu);

		ventana.setSize(450,160);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);



		dlgMensaje.setSize(200,150);
		dlgMensaje.setResizable(false);
		dlgMensaje.setBackground(Color.gray);
		dlgMensaje.setLocationRelativeTo(null);

		ventana.setVisible(true);

	}



	public static void main(String[] args)
	{
		new Ejercicio8();
	}

	@Override
	public void windowOpened(WindowEvent e){}
	
	@Override
	public void windowClosing(WindowEvent e)
	{
		if(dlgMensaje.isActive())
		{
			dlgMensaje.setVisible(false);;
		}

		else
		{
			System.exit(0);
		}
	}

	@Override
	public void windowClosed(WindowEvent e){}

	@Override
	public void windowIconified(WindowEvent e){}

	@Override
	public void windowDeiconified(WindowEvent e){}

	@Override
	public void windowActivated(WindowEvent e){}

	@Override
	public void windowDeactivated(WindowEvent e){}

	@Override
	public void actionPerformed(ActionEvent evento)
	{
		//Averiguar que opcion se ha elegido
		//getSource();
		
		if(evento.getSource().equals(mniArticuloNuevo))
		{
			lblMensaje.setText("Artículo nuevo");
		}
		
		else if(evento.getSource().equals(mniArticuloEliminar))
		{
			lblMensaje.setText("Eliminar Artículo");
		}
		
		else if(evento.getSource().equals(mniArticuloConsultar))
		{
			lblMensaje.setText("Consultar Artículo");
		}
		
		else if(evento.getSource().equals(mniClienteNuevo))
		{
			lblMensaje.setText("Nuevo Cliente");
		}
		
		else if(evento.getSource().equals(mniClienteEliminar))
		{
			lblMensaje.setText("Eliminar Cliente");
		}
		
		else if(evento.getSource().equals(mniClienteConsultar))
		{
			lblMensaje.setText("Consultar Cliente");
		}
		
		else if(evento.getSource().equals(mniClienteConsultar))
		{
			lblMensaje.setText("Consultar Cliente");
		}
		
		else if(evento.getSource().equals(mniFacturaConsultar))
		{
			lblMensaje.setText("Consultar Factura");
		}
		
		else if(evento.getSource().equals(mniFacturaNueva))
		{
			lblMensaje.setText("Nueva Factura");
		}
		
//		lblMensaje.setText(evento.getActionCommand());
		dlgMensaje.add(lblMensaje);
		dlgMensaje.setVisible(true);

	}

}