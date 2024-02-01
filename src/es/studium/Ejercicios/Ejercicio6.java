package es.studium.Ejercicios;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio6 implements WindowListener, ItemListener
{
	Frame ventana = new Frame("Provincias Españolas");
	Choice choProvincias = new Choice();
	TextArea txaGentilicios = new TextArea(10,50);
	
	String[] provincias = {"Seleccione una provincia","Álava","Albacete","Alicante","Almería","Asturias","Ávila","Badajoz","Barcelona","Burgos","Cáceres",
			"Cádiz","Cantabria","Castellón","Ciudad Real","Córdoba","La Coruña","Cuenca","Gerona","Granada","Guadalajara",
			"Guipúzcoa","Huelva","Huesca","Islas Baleares","Jaén","León","Lérida","Lugo","Madrid","Málaga","Murcia","Navarra",
			"Orense","Palencia","Las Palmas","Pontevedra","La Rioja","Salamanca","Segovia","Sevilla","Soria","Tarragona",
			"Santa Cruz de Tenerife","Teruel","Toledo","Valencia","Valladolid","Vizcaya","Zamora","Zaragoza"};
	
	String[]  gentilicios={"No ha elegido ninguna opción","Alavés/Alavesa o Babazorro/rra", "Albaceteño/ña o Albacetense", "Alicantino/na","Almeriense, Urcitano/na","Asturiano/na, Astur","Abulense, Avilés/esa", "Pacense, Badajocense, Badajoceño/ña", "Barcelonés/esa, Barcinonense", "Burgalés/esa", "Cacereño/ña", "Gaditano/na", "Cántabro/a","Castellonense", "Ciudadrealeño/ña", "Cordobés/esa","Coruñés", "Conquense", "Gerundense, Gironés/esa", "Granadino/na","Guadalajarño/ña, Caracense, Arriacense", "Guipuzcoano/na", "Onubense", "Oscense", "Balear", "Jaenés/esa, Jaenero/ro, Jienense, Giennense","Leonés/esa","Leridano","Lucense", "Madrileño/ña", "Malagueño/ña", "Murciano/na", "Navarro/rra", "Orensano/na", "Palentino/na", "Palmense", "Pontevedrés/esa","Riojano/a", "Salamanquino/na", "Segoviano/na", "Sevillano/na, Hispalense", "Soriano/na","Tarracconense/a","Santacrucero/ra", "Turolense", "Toledano/na", "Valenciano/na","Pucelano/na", "Vizcaíno/na",
			"Zamorano/na", "Zaragozano/na"};
	
	Ejercicio6()
	{
		for(String provincia: provincias)
		{
			choProvincias.add(provincia);
		}
		
		ventana.setSize(500, 300);
		ventana.setLayout(new FlowLayout());
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		
		ventana.addWindowListener(this);
		choProvincias.addItemListener(this);
		
		ventana.add(choProvincias);
		ventana.add(txaGentilicios);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Ejercicio6();
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
	public void itemStateChanged(ItemEvent e)
	{			
		/*int SeleccionadaIndice = choProvincias.getSelectedIndex();
		
		
		if(choProvincias.getSelectedItem().equals(e.getItem()))
		{
			txaGentilicios.setText(gentilicios[SeleccionadaIndice]);
		} MI FORMA*/
		
		/*int posicion = 0;
		for(String provincia: provincias ) {
			if(provincia.equals(e.getItem())){
				txaGentilicios.setText(gentilicios[posicion]);
			}
			else {
				posicion++;
			}
		}FORMA UNO DEL PROFESOR*/
		
		txaGentilicios.setText(gentilicios[choProvincias.getSelectedIndex()]); 
		//FORMA DOS PROFESOR

	}
	
}
