package ie.tudublin;

import processing.data.TableRow;

public class Resistor
{
    private int value;
    private int ones;
    private int tens;
    private int hundreads;

    public Resistor(int value)
    {
        this.value = value;
        int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
    }

    public String toString()
    {
        return value + "\t" + hundreads + ", " + tens + ", " + ones;
    }

    public Resistor(TableRow tr, int i)
    {
        
        this( tr.getInt(i));
        
        //String meh= tr.getColumnTitle(0);
        //System.out.print(meh);
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the ones
     */
    public int getOnes() {
        return ones;
    }

    /**
     * @param ones the ones to set
     */
    public void setOnes(int ones) {
        this.ones = ones;
    }

    /**
     * @return the tens
     */
    public int getTens() {
        return tens;
    }

    /**
     * @param tens the tens to set
     */
    public void setTens(int tens) {
        this.tens = tens;
    }

    /**
     * @return the hundreads
     */
    public int getHundreads() {
        return hundreads;
    }

    /**
     * @param hundreads the hundreads to set
     */
    public void setHundreads(int hundreads) {
        this.hundreads = hundreads;
    }

    
}

    