public class Java_Sort
{
	public static void main(String[] args)
	{
		int[] array = {1,8,6,3,2,0,4,56,4,6,565,5,655,65,56,56,5,655,65,2,22,2,23,5,4,6,56,8,9,1};

		for(int i = array.length - 1; i > 0; i--)
		{
			for(int j = 0; j < i; j++)
			{
				if(array[j] > array[i])
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
  		}
		System.out.println("\nSorted Array: \n");
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
	}
}
