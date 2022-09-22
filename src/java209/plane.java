package java209;






public class plane {

 

    public static void main(String[] args) {
         String string = "bob has a radar plane";    
            String word = "";   
            String[] words = new String[100];    
            int index = 0,p=0;    
            int []t= new int[20];
                
              
            string = string + " ";  
            int c=0;
             
            for(int i = 0; i < string.length(); i++)
            {    
                 
                if(string.charAt(i) != ' ')
                {    
                    word = word + string.charAt(i);  
                    c=c+1;
                    
                }    
                else
                { 
                    
                    t[p]=c;
                    c=0;
                    p++;
                    words[index] = word;                       
                    index++;                          
                    word = "";    
                }                   
            } 
           
           
            int j=0,q=p;
            p=0;
            char ch;String rev="";
            for(int i=0;i<=index-1;i++)
            {    
                rev="";
                int r=t[p];
                for (j=r-1;j>=0;j--)
               {
                ch=words[i].charAt(j);
                rev=rev+ch;        
               }
            if(words[i].equals(rev))
              {
                for(int y=0;y<words[i].length();y++) 
                {
                    System.out.print("*");
                }
                System.out.print(" ");
            
              } 
            else
            {
                System.out.print(words[i]);
            }
            System.out.print(" ");
            while(p>q)
            {
                break;
            }    
            p++;
           }  
    }
}