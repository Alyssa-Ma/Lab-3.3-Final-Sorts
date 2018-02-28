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
		int [] test2 = {4, 8, 6, 5, 1, 3, 7, 9, 2, 0};
		
		long start = System.nanoTime();
		String[] mergeSortResult = mergeSort(test1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Merge sort time: " + time + " nanoseconds.");
		System.out.println(Arrays.toString(mergeSortResult));
		
		start = System.nanoTime();
		end = System.nanoTime();
		time = end - start;
		quickSort(test2, 0, test2.length-1);
		System.out.println("Quick sort time: " + time + " nanoseconds.");
		System.out.println(Arrays.toString(test2));
		
	}
	public static String[] mergeSort(String [] list)
	{
		//use copyOfRange to copy the array
		//split the array and merge sort both sides, when both halves are length 1, merge
		//keep dividing array into half
		
		if(list.length == 1)
		{
			return list;
		}
		
		
		
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
			int piv = partition(list1, front, back);
			
			//left side
			quickSort(list1, front, piv-1);
			
			//right side
			quickSort(list1, piv+1, back);
			
			
		}
		
	}
	
	public static int partition(int [] list1, int front, int back)
	{
		int piv = list1[front];
		
		while(front < back)
		{
			while(list1[front] < piv)
			{
				front++;
			}
			while(list1[back] > piv)
			{
				back--;
			}
			if(front <= back)
			{
				swap(list1, front, back);
			}
		}
	}
	
	//helper method to swap items
		public static void swap(int[] list, int in, int in2)
		{
			int n = list[in];
			list[in] = list[in2];
			list[in2] = n;
		}
}
