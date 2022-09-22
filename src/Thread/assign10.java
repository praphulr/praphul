package Thread;
interface Showable2{
      void show();
      interface Message{
       void msg();
      }
    }
    class TestNestedInterface1 implements Showable2.Message{
     public void msg()
     {
         System.out.println("Hello nested interface");
     }
     
     public static void main(String args[]){
      Showable2.Message message=new TestNestedInterface1();
      message.msg();
     }
    }
 