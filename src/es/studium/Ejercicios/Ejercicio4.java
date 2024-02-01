package es.studium.Ejercicios;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio4 implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Aficiones");
	Checkbox chkCorrer = new Checkbox("Correr");
	Checkbox chkNadar = new Checkbox("Nadar");
	Checkbox chkAndar = new Checkbox("Andar");
	Checkbox chkLeer = new Checkbox("Leer");
	Checkbox chkCine = new Checkbox("Ir al Cine");
	Checkbox chkBailar = new Checkbox("Bailar");
	Checkbox chkFutbol = new Checkbox("Fútbol");
	Checkbox chkTenis = new Checkbox("Tenis");
	Checkbox chkBaloncesto = new Checkbox("Baloncesto");
	Checkbox chkDeportesVela = new Checkbox("Deportes de Vela");
	
	Button btnComprobar = new Button("Comprobar");
	
	TextArea txaResultado = new TextArea(10,50);

	
	public Ejercicio4()
	{
		ventana.setVisible(true);
		ventana.setSize(400, 300);
		ventana.setLayout(new FlowLayout());
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.addWindowListener(this);
		btnComprobar.addActionListener(this);
		
		ventana.add(chkCorrer);
		ventana.add(chkNadar);
		ventana.add(chkAndar);
		ventana.add(chkLeer);
		ventana.add(chkCine);
		ventana.add(chkBailar);
		ventana.add(chkFutbol);
		ventana.add(chkTenis);
		ventana.add(chkBaloncesto);
		ventana.add(chkDeportesVela);
		ventana.add(btnComprobar);
		
		ventana.add(txaResultado);
	}
	
	public static void main(String[] args)
	{
		new Ejercicio4();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(chkCorrer.getState()== true)
		{
			txaResultado.setText("Correr\n");
		}
		if(chkNadar.getState())
		{
			txaResultado.append("Nadar\n");
		}
		if(chkAndar.getState()== true)
		{
			txaResultado.append("Andar\n");
		}
		if(chkLeer.getState()== true)
		{
			txaResultado.append("Leer\n");
		}
		if(chkCine.getState()== true)
		{
			txaResultado.append("Ir al cine\n");
		}
		if(chkBailar.getState()== true)
		{
			txaResultado.append("Bailar\n");
		}
		if(chkFutbol.getState()== true)
		{
			txaResultado.append("Fútbol\n");
		}
		if(chkTenis.getState())
		{
			txaResultado.append("Tenis\n");
		}
		if(chkBaloncesto.getState())
		{
			txaResultado.append("Baloncesto\n");
		}
		if(chkDeportesVela.getState())
		{
			txaResultado.append("Deportes de Vela\n");
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
