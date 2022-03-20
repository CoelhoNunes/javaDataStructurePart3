/****************************************************************************************** 
Purpose/Description: the created method is going to replace the first occurrence of oldKey with
the newKey, and restore Min-Heap (Heap) property after the change. If the oldKey does not exist,
program will printout statement without changing the heap. 

Author’s Panther ID: 6194506

Certification:
I hereby certify that this work is my own and none of it is the work of any other person.
*******************************************************************************************/


package dataStructure_A3;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		
		// Creating Priority Queue
		myMinHeap priorityQ = new myMinHeap(10);
				
		// Placing the values
		priorityQ.add(4);
		priorityQ.add(6);
		priorityQ.add(7);
		priorityQ.add(32);
		priorityQ.add(19);
		priorityQ.add(64);
		priorityQ.add(26);
		priorityQ.add(99);
		priorityQ.add(42);
		priorityQ.add(54);
		priorityQ.add(28);
				
		// System printout of size of queue
		System.out.println("Priority Queue size is " + priorityQ.size() + "\n");
				
		// Array that will contain all the elements
		Integer[] X = priorityQ.convertVectorToArray();
		System.out.println("Printing array: " + Arrays.toString(X) + "\n");
		priorityQ.replaceKey(54, 2);
		priorityQ.convertVectorToArray();
		System.out.println("\nPrinting array after replace key: " + Arrays.toString(priorityQ.convertVectorToArray()));
	}

}

/******************************** Program output ********************************
 * ------------------------------------------------------------------------------
	Priority Queue size is 11
	
	Printing array: [4, 6, 7, 32, 19, 64, 26, 99, 42, 54, 28]
	
	4
	6
	7
	32
	19
	64
	26
	99
	42
	54
	
	Found a match
	
	Printing array after replace key: [2, 4, 7, 32, 6, 64, 26, 99, 42, 19, 28]
 * ------------------------------------------------------------------------------
*/