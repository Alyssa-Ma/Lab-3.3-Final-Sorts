/**
 * @author Alyssa Ma
 * Period 2
 * 2/15/18
 * Lab 3.3
 */

public class ArrayMethods3 
{
	public static void main(String [] args)
	{
		//Testing arrays
		String [] test1 = {"fishy", "kitty", "daughter", "no", "yes", "foo", "bar", "baz"};
		int [] test3 = {};
		
		//Merge Sort
		long start = System.nanoTime();
		String[] mergeSortResult = mergeSort(test1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Merge sort time: " + time + " nanoseconds.");
		System.out.println(Arrays.toString(mergeSortResult));
		
		//Partition
		start = System.nanoTime();
		int = 
		//Quick Sort
	}
	public static String[] mergeSort(String [] list)
	{
		//use copyOfRange to copy the array
		//split the array and merge sort both sides, when both halves are length 1, merge
		//keep dividing array into half
		int start;
		int end;
		
	}
	public static int partition(int list1, int front, int back)
	{
		//return position of pivot
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
