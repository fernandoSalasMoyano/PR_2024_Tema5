package es.studium.Ejercicios;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio5 implements WindowListener, ActionListener
{
	Panel pnlDatos = new Panel();
	Panel pnlBoton = new Panel();
	
	Frame ventana = new Frame("Vehículos");
	Label lblPrimera = new Label("Tipo de motorización: ");
	Label lblSegunda = new Label("Número de puertas: ");
	Label lblTercera = new Label("Pintura metalizada: ");
	Button btnCalcular = new Button("Calcular presupuesto");
	CheckboxGroup chgMotor = new CheckboxGroup();
	Checkbox chkGasolina = new Checkbox("Gasolina", false, chgMotor);
	Checkbox chkDiesel = new Checkbox("Diésel", false, chgMotor);
	Checkbox chkHibrido = new Checkbox("Híbrido", false, chgMotor);
	Checkbox chkElectrico = new Checkbox("Eléctrico", false, chgMotor);
	CheckboxGroup chgPuertas = new CheckboxGroup();
	Checkbox chk3Puertas = new Checkbox("3 Puertas", false, chgPuertas);
	Checkbox chk4Puertas = new Checkbox("4 Puertas", false, chgPuertas);
	Checkbox chk5Puertas = new Checkbox("5 Puertas", false, chgPuertas);
	CheckboxGroup chgMetalizada = new CheckboxGroup();
	Checkbox chkSi= new Checkbox("Sí", false, chgMetalizada);
	Checkbox chkNo = new Checkbox("No", false, chgMetalizada);
	TextField txtResultado = new TextField(15);

	
	public Ejercicio5()
	{
		ventana.setSize(430, 200);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setLayout(new BorderLayout());
		
		pnlDatos.add(lblPrimera);
		pnlDatos.add(chkGasolina);
		pnlDatos.add(chkDiesel);
		pnlDatos.add(chkHibrido);
		pnlDatos.add(chkElectrico);
		
		pnlDatos.add(lblSegunda);
		pnlDatos.add(chk3Puertas);
		pnlDatos.add(chk4Puertas);
		pnlDatos.add(chk5Puertas);
		
		pnlDatos.add(lblTercera);
		pnlDatos.add(chkSi);
		pnlDatos.add(chkNo);
		
		pnlDatos.add(txtResultado);
		
		ventana.add("Center", pnlDatos);
		
		pnlBoton.add(btnCalcular);
		pnlBoton.add(txtResultado);
		ventana.add("South", pnlBoton);
		
		ventana.addWindowListener(this);
		btnCalcular.addActionListener(this);
		
		
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Ejercicio5();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		int precio = 0;
		if(chkGasolina.getState())
		{
			precio = 7000;
		}
		else if(chkDiesel.getState())
		{
			precio = 8000;
		}
		else if(chkHibrido.getState())
		{
			precio = 9000;
		}
		else if(chkElectrico.getState())
		{
			precio = 8500;
		}
		if(chk3Puertas.getState())
		{
			precio = precio + 2000;
		}
		else if(chk4Puertas.getState())
		{
			precio = precio + 3000;

		}
		else if(chk5Puertas.getState())
		{
			precio = precio + 2500;
		}
		if(chkSi.getState())
		{
			precio = precio + 1500;
		}
		
		txtResultado.setText(precio+"");
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
