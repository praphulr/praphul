package sort;

public class bubble {

	public static void main(String[] args) {
		int a[] = {35, 10, 31, 11, 26};
		int n = a.length;
		int i, j, temp;
		for (i=0; i<n; i++)
		{ 
			for (j = i+1; j<n; j++)
			{
		
				if (a[j] < a[i])
				{ 
					temp = a[i];
					temp = a[j];
					temp = temp;
				}
			}
		}
		for (i =0; i<n; i++)
		{
			System.out.print(a[i]+ " ");
		}

	

}
	}
