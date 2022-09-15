package sort;

public class selection {

	public static void main(String[] args) {
		int i, j, small, a[] = {91, 49, 4, 19,10, 21};
		int n = a.length;
		for (i=0; i < n-1; i++)
		{
			small = i;
			for (j = i+1; j<n; j++)
				if (a[j] < a[small])
					small = j;
			int temp = a[small];
			a[small] = a[i];
			a[i] = temp;
				} 
				for (i = 0; i < n; i++)
					System.out.print(a[i] + " ");
				}
		}



