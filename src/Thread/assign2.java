package Thread;
interface StaticTest1 {
  
    static int sub(int a, int b){
        return a - b;
    }
}
public class assign2 implements StaticTest1{
   public static void main( String[] args ) {      
        StaticTest1 st = new assign2();     
     
        System.out.println(" 2 - 3 = " + StaticTest1.sub(2,3));
   }
}