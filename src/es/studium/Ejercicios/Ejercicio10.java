package es.studium.Ejercicios;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio10 implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Tres en raya");
	Button btnPrimero = new Button();
	Button btnSegundo = new Button();
	Button btnTercero = new Button();
	Button btnCuarto = new Button();
	Button btnQuinto = new Button();
	Button btnSexto = new Button();
	Button btnSeptimo = new Button();
	Button btnOctavo = new Button();
	Button btnNoveno = new Button();
	
	Dialog dlgMensaje = new Dialog(ventana, "Fin", true);
	Label lblMensaje = new Label("    ");
	
	int turno = 0; // 0 --> O; 1 --> X
	int contador = 0;
	boolean fin = false;
	
	public Ejercicio10()
	{
		ventana.setResizable(false);
		ventana.setSize(300, 300);
		ventana.setLayout(new GridLayout(3,3));
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);		
		
		dlgMensaje.setSize(200,150);
		dlgMensaje.setResizable(false);
		dlgMensaje.setBackground(Color.gray);
		dlgMensaje.setLocationRelativeTo(null);
		dlgMensaje.setLayout(new FlowLayout());
		
		ventana.addWindowListener(this);
		dlgMensaje.addWindowListener(this);
		
		ventana.add(btnPrimero);
		btnPrimero.addActionListener(this);
		ventana.add(btnSegundo);
		btnSegundo.addActionListener(this);
		ventana.add(btnTercero);
		btnTercero.addActionListener(this);
		ventana.add(btnCuarto);
		btnCuarto.addActionListener(this);
		ventana.add(btnQuinto);
		btnQuinto.addActionListener(this);
		ventana.add(btnSexto);
		btnSexto.addActionListener(this);
		ventana.add(btnSeptimo);
		btnSeptimo.addActionListener(this);
		ventana.add(btnOctavo);
		btnOctavo.addActionListener(this);
		ventana.add(btnNoveno);
		btnNoveno.addActionListener(this);
	}
	
	public static void main(String[] args)
	{
		new Ejercicio10();
	}

	@Override
	public void actionPerformed(ActionEvent evento)
	{
		if(evento.getSource().equals(btnPrimero))
		{
			if(turno==0)
			{
				btnPrimero.setLabel("O");
				turno = 1;
			}
			else
			{
				btnPrimero.setLabel("X");
				turno = 0;
			}
			btnPrimero.removeActionListener(this);;
		}
		else if(evento.getSource().equals(btnSegundo))
		{
			if(turno==0)
			{
				btnSegundo.setLabel("O");
				turno = 1;
			}
			else
			{
				btnSegundo.setLabel("X");
				turno = 0;
			}
			btnSegundo.removeActionListener(this);;
		}
		else if(evento.getSource().equals(btnTercero))
		{
			if(turno==0)
			{
				btnTercero.setLabel("O");
				turno = 1;
			}
			else
			{
				btnTercero.setLabel("X");
				turno = 0;
			}
			btnTercero.removeActionListener(this);;
		}
		else if(evento.getSource().equals(btnCuarto))
		{
			if(turno==0)
			{
				btnCuarto.setLabel("O");
				turno = 1;
			}
			else
			{
				btnCuarto.setLabel("X");
				turno = 0;
			}
			btnCuarto.removeActionListener(this);;
		}
		else if(evento.getSource().equals(btnQuinto))
		{
			if(turno==0)
			{
				btnQuinto.setLabel("O");
				turno = 1;
			}
			else
			{
				btnQuinto.setLabel("X");
				turno = 0;
			}
			btnQuinto.removeActionListener(this);;
		}
		else if(evento.getSource().equals(btnSexto))
		{
			if(turno==0)
			{
				btnSexto.setLabel("O");
				turno = 1;
			}
			else
			{
				btnSexto.setLabel("X");
				turno = 0;
			}
			btnSexto.removeActionListener(this);;
		}
		else if(evento.getSource().equals(btnSeptimo))
		{
			if(turno==0)
			{
				btnSeptimo.setLabel("O");
				turno = 1;
			}
			else
			{
				btnSeptimo.setLabel("X");
				turno = 0;
			}
			btnSeptimo.removeActionListener(this);;
		}
		else if(evento.getSource().equals(btnOctavo))
		{
			if(turno==0)
			{
				btnOctavo.setLabel("O");
				turno = 1;
			}
			else
			{
				btnOctavo.setLabel("X");
				turno = 0;
			}
			btnOctavo.removeActionListener(this);;
		}
		else if(evento.getSource().equals(btnNoveno))
		{
			if(turno==0)
			{
				btnNoveno.setLabel("O");
				turno = 1;
			}
			else
			{
				btnNoveno.setLabel("X");
				turno = 0;
			}
			btnNoveno.removeActionListener(this);;
		}
		contador++;
		comprobar(); //Si hay tres en raya
	}

	private void comprobar()
	{	
		if((btnPrimero.getLabel() == btnSegundo.getLabel()) && (btnSegundo.getLabel() == btnTercero.getLabel()) && (!btnPrimero.getLabel().equals("")))
		{
			lblMensaje.setText("Gana: " + btnPrimero.getLabel());
			fin = true;
		}
		else if ((btnCuarto.getLabel() == btnQuinto.getLabel()) && btnQuinto.getLabel() == btnSexto.getLabel() && (!btnCuarto.getLabel().equals("")))
		{
			lblMensaje.setText("Gana: " + btnCuarto.getLabel());
			fin = true;
		}
		else if ((btnSeptimo.getLabel() == btnOctavo.getLabel()) && btnOctavo.getLabel() == btnNoveno.getLabel() && (!btnSeptimo.getLabel().equals("")))
		{
			lblMensaje.setText("Gana: " + btnSeptimo.getLabel());
			fin = true;
		}
		else if ((btnPrimero.getLabel() == btnCuarto.getLabel()) && btnCuarto.getLabel() == btnSeptimo.getLabel() && (!btnSeptimo.getLabel().equals("")))
		{
			lblMensaje.setText("Gana: " + btnPrimero.getLabel());
			fin = true;
		}
		else if ((btnSegundo.getLabel() == btnQuinto.getLabel()) && btnQuinto.getLabel() == btnOctavo.getLabel() && (!btnSegundo.getLabel().equals("")))
		{
			lblMensaje.setText("Gana: " + btnSegundo.getLabel());
			fin = true;
		}
		else if ((btnTercero.getLabel() == btnSexto.getLabel()) && btnSexto.getLabel() == btnNoveno.getLabel() && (!btnTercero.getLabel().equals("")))
		{
			lblMensaje.setText("Gana: " + btnTercero.getLabel());
			fin = true;
		}
		else if ((btnPrimero.getLabel() == btnQuinto.getLabel()) && btnQuinto.getLabel() == btnNoveno.getLabel() && (!btnPrimero.getLabel().equals("")))
		{
			lblMensaje.setText("Gana: " + btnPrimero.getLabel());
			fin = true;
		}
		else if ((btnTercero.getLabel() == btnQuinto.getLabel()) && btnQuinto.getLabel() == btnSeptimo.getLabel() && (!btnSeptimo.getLabel().equals("")))
		{
			lblMensaje.setText("Gana: " + btnTercero.getLabel());
			fin = true;
		}
		else if(contador==9)
		{
			lblMensaje.setText("Empate");
			dlgMensaje.add(lblMensaje);
			dlgMensaje.setVisible(true);
		}
		if(fin == true)
		{
			dlgMensaje.add(lblMensaje);
			dlgMensaje.setVisible(true);
		}
	}

	@Override
	public void windowOpened(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e)
	{
		if(dlgMensaje.isActive())
		{
			dlgMensaje.setVisible(false);
			reiniciar();
		}
		else
		{
			System.exit(0);
		}
	}

	private void reiniciar()
	{
		// Reset del contador
		contador = 0;
		// Reset del turno
		turno = 0;
		// Reset del fin
		fin = false;
		// Botones: Quitar las etiquetas
		btnPrimero.setLabel("");
		btnSegundo.setLabel("");
		btnTercero.setLabel("");
		btnCuarto.setLabel("");
		btnQuinto.setLabel("");
		btnSexto.setLabel("");
		btnSeptimo.setLabel("");
		btnOctavo.setLabel("");
		btnNoveno.setLabel("");
		//Botones: Quitar el action listener
		btnPrimero.removeActionListener(this);
		btnSegundo.removeActionListener(this);
		btnTercero.removeActionListener(this);
		btnCuarto.removeActionListener(this);
		btnQuinto.removeActionListener(this);
		btnSexto.removeActionListener(this);
		btnSeptimo.removeActionListener(this);
		btnOctavo.removeActionListener(this);
		btnNoveno.removeActionListener(this);
		// Botones : Añadir otra vez los listener
		btnPrimero.addActionListener(this);
		btnSegundo.addActionListener(this);
		btnTercero.addActionListener(this);
		btnCuarto.addActionListener(this);
		btnQuinto.addActionListener(this);
		btnSexto.addActionListener(this);
		btnSeptimo.addActionListener(this);
		btnOctavo.addActionListener(this);
		btnNoveno.addActionListener(this);

	}
	@Override
	public void windowClosed(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}
}
