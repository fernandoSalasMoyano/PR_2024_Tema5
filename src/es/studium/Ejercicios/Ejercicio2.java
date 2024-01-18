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

public class Ejercicio2 implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Calcular el IVA");
	Label lblEtiqueta1 = new Label("Introduzca la cantidad: ");
	Label lblEtiqueta2 = new Label("Introduzca el porcentaje: ");
	Label lblEtiqueta3 = new Label("Resultado: ");
	TextField txtPrimero = new TextField(15);
	TextField txtSegundo = new TextField(15);
	TextField txtTercero = new TextField(15);
	Button btnCalcular = new Button("Calcular");
	
	public Ejercicio2()
	{
		ventana.setSize(900,80);
		ventana.setVisible(true);
		ventana.setResizable(false);
		ventana.addWindowListener(this);
		ventana.setLayout(new FlowLayout());
		ventana.setLocationRelativeTo(null);
		ventana.add(lblEtiqueta1);
		ventana.add(txtPrimero);
		ventana.add(lblEtiqueta2);
		ventana.add(txtSegundo);
		ventana.add(btnCalcular);
		ventana.add(lblEtiqueta3);
		ventana.add(txtTercero);
		txtTercero.setEnabled(false);
	}

	public static void main(String[] args)
	{
		new Ejercicio2();
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
		
		
	}

}
