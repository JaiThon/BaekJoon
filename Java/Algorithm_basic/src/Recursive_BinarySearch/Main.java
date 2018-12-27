package Recursive_BinarySearch;

public class Main {
	public static void main(String args[]) {
		int list[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int size = 9;
		int target = 3;

		System.out.println(binarySearch(list, target, 0, size)+1+"에 존재합니다");
	}
	public static int binarySearch(int[] items, int target, int begin, int end) {
		if(begin > end) {
			return -1;
		}
		else {
			int middle = (begin + end)/2;
			int compResult;
			
			if(items[middle] > target)
				compResult = 1;
			else if (items[middle] < target)
				compResult = -1;
			else
				compResult = 0;
			
			if(compResult == 0)
				return middle;
			else if(compResult < 0)
				return binarySearch(items, target, middle+1, end);
			else 
				return binarySearch(items, target, begin, middle-1);
		}
	}
}
