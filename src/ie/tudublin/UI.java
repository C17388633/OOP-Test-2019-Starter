package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet
{
	ArrayList<Colour> colours = new ArrayList<Colour>();
	ArrayList<Resistor> resistors = new ArrayList<Resistor>();

	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		loadColours();
		loadResistors();
		separate(381);
		separate(1);
		separate(92);
	}

	public void loadColours()
    {
        Table table = loadTable("colours.csv", "header");
        for(TableRow tr:table.rows())
        {
            Colour c = new Colour(tr);
            colours.add(c);
        }        
	}
	
	public void printColours()
	{
		for(int i = 0; i < colours.size(); i++)
		{
			Colour colourPrint = colours.get(i);
			print("colours: " + colourPrint);
		}
	}

	/*public Colour findColour(int value)
	{

	}*/

	public void loadResistors()
	{
		Table table = loadTable("resistors.csv", "header");
        for(TableRow tr:table.rows())
        {
            Resistor r = new Resistor(tr);
            resistors.add(r);
        }     
	}

	public void setup() 
	{
	}
	
	public void draw()
	{			
	}
}
