# KotlinAlgorithms
Basic search and sort algorithms in Kotlin language + fibonacci + reverse string solutions

# The Algorithms - Kotlin

### All algorithms implemented in Kotlin (for education)

## I. Sort Algorithms

<img src="images/sort/speed_all_sorting_algorithms.gif" width="540" height="272"/>

### 1.1 Insertion Sort
<img src="images/sort/insertion.gif" width="270" height="162"/>

From [Wikipedia](https://en.wikipedia.org/wiki/Insertion_sort): Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort

__Properties__
* Worst case performance O(n^2)
* Best case performance O(n)
* Average case performance O(n^2)


### 1.2 Selection Sort
<img src="images/sort/selection.gif" width="420" height="85.5"/>

From [Wikipedia](https://en.wikipedia.org/wiki/Insertion_sort): Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort

__Properties__
* Worst case performance O(n^2)
* Best case performance O(n)
* Average case performance O(n^2)


### 1.3 Bubble Sort
<img src="images/sort/bubble.gif" width="280" height="168"/>

From [Wikipedia](https://en.wikipedia.org/wiki/Bubble_sort): Bubble sort, sometimes referred to as sinking sort, is a simple sorting algorithm that repeatedly steps through the list to be sorted, compares each pair of adjacent items and swaps them if they are in the wrong order. The pass through the list is repeated until no swaps are needed, which indicates that the list is sorted.

__Properties__
* Worst case performance O(n^2)
* Best case performance O(n)
* Average case performance O(n^2)


### 1.5 Merge Sort
<img src="images/sort/merge.gif" width="350" height="210"/>

From [Wikipedia](https://en.wikipedia.org/wiki/Merge_sort): merge sort is a divide and conquer algorithm that was invented by John von Neumann in 1945.

__Properties__
* The performance of this algorithm is O(n log n)


### 1.6 Quick Sort
<img src="images/sort/quick.gif" width="320" height="245"/>

From [Wikipedia](https://en.wikipedia.org/wiki/Quicksort): Quicksort is a divide and conquer algorithm. Quicksort first divides a large array into two smaller sub-arrays: the low elements and the high elements. Quicksort can then recursively sort the sub-arrays.

__Properties__
* Worst case performance O(n^2)
* Best case performance O(n log n) or O(n) with three-way partition
* Average case performance O(n^2)


### 1.7 Heap Sort
<img src="images/sort/heap.gif" width="350" height="280"/>

From [Wikipedia](https://en.wikipedia.org/wiki/Heapsort): the heapsort algorithm involves preparing the list by first turning it into a max heap. The algorithm then repeatedly swaps the first value of the list with the last value, decreasing the range of values considered in the heap operation by one, and sifting the new first value into its position in the heap. This repeats until the range of considered values is one value in length.

__Properties__
* The performance buildMaxHeap() operation is run once, and is O(n)
* The performance siftDown() function is O(log n), and is called n times
* Therefore performance of this algorithm is O(n + n log n) = O(n log n).


## II. Search Algorithms

### 2.1 Linear Search.
<img src="images/search/linear.gif" width="400" height="164.4"/>

From [Wikipedia](https://en.wikipedia.org/wiki/Linear_search): linear search or sequential search is a method for finding a target value within a list. It sequentially checks each element of the list for the target value until a match is found or until all the elements have been searched

__Properties__
* Worst-case performance O(n)
* Best-case performance O(1)
* Average performance O(n)


### 2.2 Binary Search.
<img src="images/search/binary.gif" width="342.7" height="180"/>

From [Wikipedia](https://en.wikipedia.org/wiki/Binary_search_algorithm): Binary search, also known as half-interval search or logarithmic search, is a search algorithm that finds the position of a target value within a sorted array. It compares the target value to the middle element of the array; if they are unequal, the half in which the target cannot lie is eliminated and the search continues on the remaining half until it is successful.

__Properties__
* Worst case performance O(log n)
* Best case performance O(1)
* Average case performance O(log n)

