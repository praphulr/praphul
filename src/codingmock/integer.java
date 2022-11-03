package codingmock;

public class integer {

	



		   





        public static void main(String[] args) {
              int a[]= {1,2,3,4,5,-1,-2,-3};
              int b=3;
              for(int i=0;i<a.length;i++)
              {
                  for(int j=i+1;j<a.length;j++)
                  {
                      if(a[i]+a[j]==b)
                          System.out.println(a[i]+"\t"+a[j]);
                  }
              }
        }
}
