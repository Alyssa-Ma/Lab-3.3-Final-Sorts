
public class ArrayMethods3 
{
	public static void main(String [] args)
	{
		
	}
	public static String[] mergeSort(String [] list)
	{
		//use copyOfRange to copy the array
		
	}
	public static int partition(int list1, int front, int back)
	{
		
	}
	public static void quickSort(int [] list1, int front, int back)
	{
		//base case front >= back
		
		if(back > front)
		{
			/**
			 * old partition method, needs to be updated
			 * {
		int x = 0;
		int y = list.length - 1;
		int z = 0;
		int aa = 0;
		
		while(x != y)
		{
			//two sides of array
			if(list[x] > list[y] && (x < y))
			{
				swap(list, x, y);
				
				z = x;
				x = y;
				y = z + 1;
			}
			else if((list[x] < list[y]) && (x > y))
			{
				swap(list, x, y);
				
				z = x;
				x = y;
				y = z - 1;
			}
			else if(x > y)
			{
				y++;
			}
			else if(x < y)
			{
				y--;
			}
		}
		return x;
	}
	
	//helper method to swap items
	public static void swap(int[] list, int in, int in2)
	{
		int n = list[in];
		list[in] = list[in2];
		list[in2] = n;
	}
			 */
			int piv = partition(list1, front, back);
			
			//left side
			quickSort(list1, front, piv-1);
			
			//right side
			quickSort(list1, piv+1, back);
		}
	}
	
	
	
	
	
}
