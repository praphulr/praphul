package Thread;

 

interface FuncInterface
{ void abstractFun(int x);}  
class Test
{ public static void main(String args[]){ FuncInterface fobj = (int x)->System.out.println(2*x);fobj.abstractFun(5);}}
