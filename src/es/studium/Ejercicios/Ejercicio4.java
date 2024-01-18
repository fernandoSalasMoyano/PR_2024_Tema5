package es.studium.Ejercicios;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Ejercicio4
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

	
	public Ejercicio4()
	{
		ventana.setVisible(true);
		ventana.setSize(400, 125);
		ventana.setLayout(new FlowLayout());
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
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
	}
	
	public static void main(String[] args)
	{
		new Ejercicio4();
	}
}
