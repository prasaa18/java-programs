package com.assignments;

class Overload
{
    public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
}
class Overloading
{
   public static void main(String args[])
   {
       Overload obj = new Overload();
       obj.disp('a');
       obj.disp('a',10);
   }
}