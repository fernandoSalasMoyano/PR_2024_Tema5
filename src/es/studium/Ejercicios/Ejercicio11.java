package es.studium.Ejercicios;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio11 implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Mi calculadora");
	GridBagConstraints restricciones = new GridBagConstraints();
	Button btnBoton0 = new Button("0");
	Button btnBoton1 = new Button("1");
	Button btnBoton2 = new Button("2");
	Button btnBoton3 = new Button("3");
	Button btnBoton4 = new Button("4");
	Button btnBoton5 = new Button("5");
	Button btnBoton6 = new Button("6");
	Button btnBoton7 = new Button("7");
	Button btnBoton8 = new Button("8");
	Button btnBoton9 = new Button("9");
	Button btnBotonCE = new Button("CE");
	Button btnBotonDivision = new Button("/");
	Button btnBotonMultiplicacion = new Button("*");
	Button btnBotonResta = new Button("-");
	Button btnBotonSuma = new Button("+");
	Button btnBotonPunto = new Button(".");
	Button btnBotonIgual = new Button("=");
	TextField txtPantalla = new TextField();
	
	float operador1;
	float operador2;
	float resultado;
	int operacion; //0 será suma, 1 será resta, 2 será producto, 3 será división
	
	
	public Ejercicio11() 
	{
		ventana.setLayout(new GridBagLayout());
		
		//Comunes
		restricciones.fill = GridBagConstraints.BOTH;
		restricciones.weightx = 1.0;
		restricciones.weighty = 1.0;

		//Particulares
		restricciones.gridx = 0;
		restricciones.gridy = 0;
		restricciones.gridwidth = 4;
		txtPantalla.setEnabled(false);
		ventana.add(txtPantalla, restricciones);
		
		restricciones.gridy = 1;
		restricciones.gridwidth = 1;
		ventana.add(btnBotonCE, restricciones);
		btnBotonCE.addActionListener(this);
		
		restricciones.gridx = 1;
		ventana.add(btnBotonDivision, restricciones);
		btnBotonDivision.addActionListener(this);

		
		restricciones.gridx = 2;
		ventana.add(btnBotonMultiplicacion, restricciones);
		btnBotonMultiplicacion.addActionListener(this);

		
		restricciones.gridx = 3;
		ventana.add(btnBotonResta, restricciones);
		btnBotonResta.addActionListener(this);

		
		restricciones.gridx = 0;
		restricciones.gridy = 2;
		ventana.add(btnBoton7, restricciones);
		btnBoton7.addActionListener(this);

		
		restricciones.gridx = 1;
		restricciones.gridy = 2;
		ventana.add(btnBoton8, restricciones);
		btnBoton8.addActionListener(this);

		
		restricciones.gridx = 2;
		restricciones.gridy = 2;
		ventana.add(btnBoton9, restricciones);
		btnBoton9.addActionListener(this);

		
		restricciones.gridx = 3;
		restricciones.gridy = 2;
		restricciones.gridheight = 2;
		ventana.add(btnBotonSuma, restricciones);
		btnBotonSuma.addActionListener(this);

		
		restricciones.gridx = 0;
		restricciones.gridy = 3;
		restricciones.gridheight = 1;
		ventana.add(btnBoton4, restricciones);
		btnBoton4.addActionListener(this);

		
		restricciones.gridx = 1;
		ventana.add(btnBoton5, restricciones);
		btnBoton5.addActionListener(this);

		
		restricciones.gridx = 2;
		ventana.add(btnBoton6, restricciones);
		btnBoton6.addActionListener(this);

		
		restricciones.gridx = 0;
		restricciones.gridy = 4;
		ventana.add(btnBoton1, restricciones);
		btnBoton1.addActionListener(this);
		
		restricciones.gridx = 1;
		ventana.add(btnBoton2, restricciones);
		btnBoton2.addActionListener(this);

		
		restricciones.gridx = 2;
		ventana.add(btnBoton3, restricciones);
		btnBoton3.addActionListener(this);
		
		restricciones.gridx = 3;
		restricciones.gridy = 4;
		restricciones.gridheight = 2;
		ventana.add(btnBotonIgual, restricciones);
		btnBotonIgual.addActionListener(this);

		
		restricciones.gridx = 0;
		restricciones.gridy = 5;
		restricciones.gridwidth = 2;
		restricciones.gridheight = 1;
		ventana.add(btnBoton0, restricciones);
		btnBoton0.addActionListener(this);

		
		restricciones.gridwidth = 1;
		restricciones.gridx = 2;
		ventana.add(btnBotonPunto, restricciones);
		btnBotonPunto.addActionListener(this);

		
		ventana.setSize(350,250);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		
		ventana.addWindowListener(this);
	}
	
	public static void main(String[] args)
	{
		new Ejercicio11();
	}

	@Override
	public void actionPerformed(ActionEvent evento)
	{
		if(evento.getSource().equals(btnBoton0))
		{
			txtPantalla.setText(txtPantalla.getText() + "0");
		}
		else if(evento.getSource().equals(btnBoton1))
		{
			txtPantalla.setText(txtPantalla.getText() + "1");
		}
		else if(evento.getSource().equals(btnBoton2))
		{
			txtPantalla.setText(txtPantalla.getText() + "2");
		}
		else if(evento.getSource().equals(btnBoton3))
		{
			txtPantalla.setText(txtPantalla.getText() + "3");
		}
		else if(evento.getSource().equals(btnBoton4))
		{
			txtPantalla.setText(txtPantalla.getText() + "4");
		}
		else if(evento.getSource().equals(btnBoton5))
		{
			txtPantalla.setText(txtPantalla.getText() + "5");
		}
		else if(evento.getSource().equals(btnBoton6))
		{
			txtPantalla.setText(txtPantalla.getText() + "6");
		}
		else if(evento.getSource().equals(btnBoton7))
		{
			txtPantalla.setText(txtPantalla.getText() + "7");
		}
		else if(evento.getSource().equals(btnBoton8))
		{
			txtPantalla.setText(txtPantalla.getText() + "8");
		}
		else if(evento.getSource().equals(btnBoton9))
		{
			txtPantalla.setText(txtPantalla.getText() + "9");
		}
		else if(evento.getSource().equals(btnBotonCE))
		{
			txtPantalla.setText("");
			operador1 = 0;
			operador2 = 0;
		}
		else if(evento.getSource().equals(btnBotonMultiplicacion))
		{
			operador1 = Float.parseFloat(txtPantalla.getText());
			operacion = 2;
			txtPantalla.setText("");
			btnBotonPunto.removeActionListener(this);
			btnBotonPunto.addActionListener(this);

		}
		else if(evento.getSource().equals(btnBotonDivision))
		{
			operador1 = Float.parseFloat(txtPantalla.getText());
			operacion = 3;
			txtPantalla.setText("");
			btnBotonPunto.removeActionListener(this);
			btnBotonPunto.addActionListener(this);

		}
		else if(evento.getSource().equals(btnBoton9))
		{
			txtPantalla.setText(txtPantalla.getText() + "9");
		}
		else if(evento.getSource().equals(btnBotonResta))
		{
			operador1 = Float.parseFloat(txtPantalla.getText());
			operacion = 1;
			txtPantalla.setText("");
			btnBotonPunto.removeActionListener(this);
			btnBotonPunto.addActionListener(this);
		}
		else if(evento.getSource().equals(btnBotonSuma))
		{
			operador1 = Float.parseFloat(txtPantalla.getText());
			operacion = 0;
			txtPantalla.setText("");
			btnBotonPunto.removeActionListener(this);
			btnBotonPunto.addActionListener(this);
		}
		else if(evento.getSource().equals(btnBotonPunto))
		{
			txtPantalla.setText(txtPantalla.getText() + ".");
			btnBotonPunto.removeActionListener(this);
		}
		else if(evento.getSource().equals(btnBotonIgual))
		{
			operador2 = Float.parseFloat(txtPantalla.getText());
			switch(operacion)
			{
				case 0:
					resultado = operador1 + operador2;
					break;
				case 1:
					resultado = operador1 - operador2;
				case 2:
					resultado = operador1 * operador2;
				case 3:
					resultado = operador1 / operador2;
			}
			txtPantalla.setText(resultado+"");
			btnBotonPunto.removeActionListener(this);
			btnBotonPunto.addActionListener(this);
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
