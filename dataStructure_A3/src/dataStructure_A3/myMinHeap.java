/******************************************************************************************* 
Purpose/Description: the created method is going to replace the first occurrence of oldKey with
the newKey, and restore Min-Heap (Heap) property after the change. If the oldKey does not exist,
program will printout statement without changing the heap. 

Author’s Panther ID: 6194506

Certification:
I hereby certify that this work is my own and none of it is the work of any other person.
*******************************************************************************************/



package dataStructure_A3;

import java.util.Vector;

class myMinHeap {
	
	// The vector that is going to hold the elements with that constructor
	private Vector <Integer> Heap;
	  
	public myMinHeap() {
		
		Heap = new Vector <Integer>();
		
	  }
	
	public myMinHeap(int maxCapacity) {
		
		Heap = new Vector <Integer>(maxCapacity);
	}
	
	// returning the parent node within the index
	private int parentElement(int z) {
		if (z == 0)
			return 0;
		
		return (z - 1) / 2;
	}
	
	// Swapping the elements at two indexes
	void swap(int x, int y) {
		
		Integer temp = Heap.get(x);
		Heap.setElementAt(Heap.get(y), x);
		Heap.setElementAt(temp, y);
	}
	
	// Recursive percolateUp procedure and swapping or looping 
	private void percolateUp(int z) {
		
		if (z > 0 && Heap.get(parentElement(z)) > Heap.get(z)) {
			
			swap(z, parentElement(z));
			
			percolateUp(parentElement(z));
		}
	}
	
	// Returning the heap size in the index
	public int size() {
		return Heap.size();
	}
	
	// Boolean check (empty & not)
	public Boolean isEmpty() {
		return Heap.isEmpty();
	}
	
	// Inserting the given element in heap
	public void add(Integer key) {
		
		// Adding to the end of the vector and getting element index to call procedure
		Heap.addElement(key);
		int index = size() - 1;
		percolateUp(index);
	}
	
	public void replaceKey(Integer oldKey, Integer newKey) {
		boolean found = false;
		
		for(int z = 0; z < size(); z++) {
			System.out.println(Heap.get(z));
			
			// Creating the loop to check if the statement index is true
			if(Heap.get(z) == oldKey) {
				System.out.println("\nFound a match");
				Heap.setElementAt(newKey, z);
				percolateUp(z);
				found = true;
				break;
			}
		}
		
		// When the boolean is false, system will print out message
		if(!found) {
			System.out.println("The key " + oldKey + " does not exist within the heap" + "\n");
		}
	}
	
	// Displaying the array that is contained within the queue
	public Integer[] convertVectorToArray() {
		return Heap.toArray(new Integer[size()]);
	}
}

