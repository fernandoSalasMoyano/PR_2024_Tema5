package es.studium.Ejercicios;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio3 implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Conversión de temperaturas");
	Label lblCelsius = new Label("Celsius:");
	Label lblFarenheit = new Label("Farenheit:");
	TextField txtCelsius = new TextField();
	TextField txtFarenheit = new TextField();
	Button btnCelFah = new Button("Celsius a Farenheit");
	Button btnFahCel = new Button("Farenheit a Celsius");

	public Ejercicio3() 
	{
		ventana.setVisible(true);
		ventana.setSize(500,200);
		ventana.setResizable(false);
		ventana.setLayout(new GridLayout(3,2));
		ventana.setLocationRelativeTo(null);
		ventana.addWindowListener(this);
		btnCelFah.addActionListener(this);
		btnFahCel.addActionListener(this);
		ventana.add(lblCelsius);
		ventana.add(txtCelsius);
		ventana.add(lblFarenheit);
		ventana.add(txtFarenheit);
		ventana.add(btnCelFah);
		ventana.add(btnFahCel);
	}
	public static void main(String[] args)
	{
		new Ejercicio3();
	}
	@Override
	public void actionPerformed(ActionEvent evento)
	{
		if(evento.getSource().equals(btnCelFah))
		{
			float celsius = Float.parseFloat(txtCelsius.getText());
			float resultado = (celsius * 9.0f / 5.0f) + 32.0f;
			txtFarenheit.setText(resultado+"");
			txtCelsius.setText("");

		}
		else if(evento.getSource().equals(btnFahCel))
		{
			float fahrenheit = Float.parseFloat(txtFarenheit.getText());
			float resultado = (5.0f / 9.0f) * (fahrenheit - 32.0f);
			txtCelsius.setText(resultado+"");
			txtFarenheit.setText("");

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
}
