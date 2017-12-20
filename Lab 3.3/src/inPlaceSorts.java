// created by Ivy Guan on November 27, 2017

public class inPlaceSorts {

	public static void main(String[] args)
	{
		//insertionSort
		/* int[] testList = {4, 5, 2, 6, -5};
		insertionSort(testList);
		for(int i = 0; i < testList.length; i++)
		{
			System.out.println(testList[i]);
		}*/
		
		//selectionSort
		/* double[] testList2 = {4, 5, 2, 7, 1, -6};
		selectionSort(testList2);
		for(int i = 0; i < testList2.length; i++)
		{
			System.out.println(testList2[i]);
		}*/
		
		//bubbleSort
		/* String[] testList3 = {"best", "apple", "ever", "eaten", "achoo", "sick"};
		bubbleSort(testList3);
		for(int i = 0; i < testList3.length; i++)
		{
			System.out.println(testList3[i]);
		}*/
		
	}
	
	/*
	 * Description: Takes each element from an array and adds it to the front of the array in the correct order
	 * Parameters: An unsorted array
	 * Return: A sorted array 
	 */
	public static void insertionSort(int[] list1)
	{
		for(int i = 0; i < list1.length-1; i++)
		{
			int value;
			if(list1[i] > list1[i+1]) //takes index i and compares it with with the index after i
			{
				//if index i is greater then it will swap with index i+1
				value = list1[i];
				list1[i] = list1[i+1];
				list1[i+1] = value;
				for(int j = i; j > 0; j--) //checks the value in the sub-sorted array(elements before i)
				{
					int value2;
					if(list1[j-1] > list1[j])
					{
						value2 = list1[j-1];
						list1[j-1] = list1[j];
						list1[j] = value2;
					}
				} 
			}
		}
	}
	
	/*
	 * Description: Finds the lowest element and moves it to the front of the array
	 * Parameters: An unsorted array
	 * Return: A sorted array 
	 */
	public static void selectionSort(double[] list1)
	{
		int value = 0;
		while(value != list1.length)
		{
			for(int i = 0; i < list1.length; i++)
			{
				double swap;
				double min = list1[i];
				int minPos = i;
				for(int j = i; j < list1.length; j++) //finds the minimum value in an array
				{
					if(min > list1[j])
					{
						min = list1[j];
						minPos = j;
					}
				}
				if(list1[value] > min) 
				{
					swap = list1[value];
					list1[value] = min;
					list1[minPos] = swap;
					value++;
				}
				else 
				{
					value++;
				}
			}
		}
	}
	
	/*
	 * Description: Swaps any out of order elements
	 * Parameters: An unsorted array
	 * Return: A sorted array 
	 */
	public static void bubbleSort(String[] list1)
	{
		boolean swap = false;
		while(!swap)
		{
			int numSwaps = 0;
			for(int i = 0; i < list1.length-1; i++)
			{
				String value;
				if(list1[i].compareTo(list1[i+1]) > 0)
				{
					value = list1[i+1];
					list1[i+1] = list1[i];
					list1[i] = value;
					numSwaps++;
				}		
			}
			if(numSwaps == 0) //the elements stops iterating when the number of swap is 0
			{
				swap = true;
			}
			
		}
	}

}
