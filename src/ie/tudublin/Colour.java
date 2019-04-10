package ie.tudublin;

import processing.data.TableRow;

public class Colour
{
    private String colour;
    private int r;
    private int g;
    private int b;
    private int value;

    public Colour(String colour, int r, int g, int b, int value)
    {
        this.colour = colour;
        this.r = r;
        this.g = g;
        this.b = b;
        this.value = value;
    }

    public String toString()
    {
        return colour + "\t" + r + ", " + g + ", " + b + "\t" + value;
    }

    public Colour(TableRow tr)
    {
        this(tr.getString("colour"), tr.getInt("r"), tr.getInt("g"), tr.getInt("b"), tr.getInt("value"));
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * @return the r
     */
    public int getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(int r) {
        this.r = r;
    }

    /**
     * @return the g
     */
    public int getG() {
        return g;
    }

    /**
     * @param g the g to set
     */
    public void setG(int g) {
        this.g = g;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
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
}