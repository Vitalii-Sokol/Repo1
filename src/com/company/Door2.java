package com.company;

public class Door2
{
    //set all parameters to Door class
    public int height;
    public boolean isOpened;
    public Door2(int h)
    {
        this.height = h;
        isOpened = false;   //set for preconditions: all doors are closed
    }

    public static void main(String[] args)
    {
        Door2 k = new Door2 (100);
        Door2 l = new Door2 (190);
        int d = k.height;
        k.isOpened = true;   //set k Door is opened

    }

    public void close()
    {
        isOpened=false;
        System.out.println("Closing door");
    }


    /*String s = "Door2";
    int i = s. length();
    */
}
