package com.company;

    public class Door
    {
        //set all parameters to Door class
        public int height;
        public boolean isOpened;
        public Door(int h)
        {
           this.height = h;
            isOpened = false;   //set for preconditions: all doors are closed
        }

        public static void main(String[] args)
        {
            Door k = new Door (100);
            Door l = new Door (190);
            int d = k.height;
            k.isOpened = true;   //set k Door is opened

        }

        public void close()
        {
            isOpened=false;
            System.out.println("Closing door");
        }


    /*String s = "Door";
    int i = s. length();
    */
}
