package sortandsearch;


public class SortAndSearch {
	public static void main(String[] args) {
		        // Initialize the array with given values
		        int[] array = {23, 43, 35, 38, 7, 12, 76, 10, 34, 8};

		        //  Find the smallest number in the array
		        int smallest = findSmallest(array);
		        System.out.println("The smallest number is: " + smallest);

		        // Sort the array in descending order
		        sortDescending(array);

		        //Display the sorted array
		        System.out.print("Sorted array in descending order: ");
		        for (int num : array) {
		            System.out.print(num + " ");
		        }
		    }

		    // Method to find the smallest number in the array
		    public static int findSmallest(int[] array) {
		        int min = array[0];
		        for (int i = 1; i < array.length; i++) {
		            if (array[i] < min) {
		                min = array[i];
		            }
		        }
		        return min;
		    }

		    // Method to sort the array in descending order
		    public static void sortDescending(int[] array) {
		        for (int i = 0; i < array.length - 1; i++) {
		            for (int j = i + 1; j < array.length; j++) {
		                if (array[i] < array[j]) {
		                    // Swap elements
		                    int temp = array[i];
		                    array[i] = array[j];
		                    array[j] = temp;
		                }
		            }
		        }
		    }
		}
