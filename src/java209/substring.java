package java209;
public class substring {
    public static void main(String[] args) {
       String str = "The Walking Dead!";
       System.out.println("String: "+str);
       String subStr1 = "Dead";
       String subStr2 = "Alive";
       int beginning = 0, index = 0;
       StringBuffer strBuffer = new StringBuffer();
       while ((index = str.indexOf(subStr1, beginning)) >= 0) {
          strBuffer.append(str.substring(beginning, index));
          strBuffer.append(subStr2);
          beginning = index + subStr1.length();
       }
       strBuffer.append(str.substring(beginning));
       System.out.println("String after replacing substring "+subStr1+" with "+ subStr2 +" = "+strBuffer.toString());
    }
 }