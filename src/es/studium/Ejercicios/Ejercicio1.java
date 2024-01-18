package es.studium.Ejercicios;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio1 implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Par/Impar");
	TextField txtText = new TextField(10);
	Button btnCalcular = new Button("Calcular");
	Label lblParImpar = new Label("              ");
	
	
	public Ejercicio1()
	{
		ventana.setSize(400, 80);
		ventana.add(txtText);
		ventana.add(btnCalcular);
		ventana.add(lblParImpar);
		ventana.addWindowListener(this);
		btnCalcular.addActionListener(this);
		ventana.setVisible(true);
		ventana.setLayout(new FlowLayout());
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
	}
	public static void main(String[] args)
	{
		new Ejercicio1();
	}
	@Override
	public void windowOpened(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
		
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
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// Coger el número escrito
		int numero = Integer.parseInt(txtText.getText());
		// Comprar si es Par o Impar
		String mensaje = "";
		if (numero % 2 == 0)
		{
			mensaje = "Es PAR";
		}
		else
		{
			mensaje = "Es IMPAR";
		}
		// Mostrar el resultado
		lblParImpar.setText(mensaje);
	}
}