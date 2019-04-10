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

		printColours();
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
			print("\n colour: " + colourPrint.getColour());
			print(", R: " + colourPrint.getR());
			print(", G: " + colourPrint.getG());
			print(", B: " + colourPrint.getB());
			print(", Value: " + colourPrint.getValue() + "\n");
		}
	}

	public Colour findColour(int value)
	{
		Colour find = colours.get(value);

		return find;
	}

	public void loadResistors()
	{
		Table table = loadTable("resistors.csv", "header");
		int i = 0;
        for(TableRow tr:table.rows())
        {
            Resistor r = new Resistor(tr, i);
			resistors.add(r);
        }     
	}

	public void setup() 
	{
	}
	
	public void draw()
	{			
		for(int i = 0; i < resistors.size(); i++)
		{
			noFill();
			float threeQuaters = (width/4) * 3 ;
			float space = 30;
			float y = map(i, 0, resistors.size(), 0, height);
			line(width/4, y + space, width/4 + 50, y + space);
			rect(width/4 + 50, (y - space), 120, 120);
			line(width/4 + 120 + 50, y + space, (width/4) + 120 + 100, y + space);
			textAlign(CENTER, CENTER);
			fill(0);
			//String res = resistors.getInt(i);
			text("res", threeQuaters ,y);
		}
	}
}
