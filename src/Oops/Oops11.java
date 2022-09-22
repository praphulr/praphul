package Oops;
class print
{
    int i;
    public void printNum()
    {
        System.out.println(i);
    }
}
class Print2 extends print
{
    int j;
    public void printNum()
    {
        System.out.println(j);
    }
}
public class Oops11 {



   public static void main(String[] args) {
        
Print2 p=new Print2();
p.i=3;
p.j=1;
p.printNum();
    }



}