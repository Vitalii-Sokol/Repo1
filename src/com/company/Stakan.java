package com.company;

public class Stakan
{
    public int height;
    public boolean isFull;
    public Stakan(int h)

    {
        height = h;  //set for preconditions: all doors are closed
        isFull = false;
    }

    public static void main(String[] args)
    {
        Stakan a = new Stakan (100);
        Stakan b = new Stakan (70);
        int h = a.height;
        a.isFull = true;   //set k Door is opened

    }

    public void close()
    {
        isFull=true;
        System.out.println("Stakan is full");
    }

}


