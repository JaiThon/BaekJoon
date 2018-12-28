package Recursive_BinaryOrderSearch;

public class Main {
	public static void main(String args[]) {
		int size = 10;
		int list[] = {1,2,3,4,5,6,7,8,9,10};
		int target = 3;
		System.out.println(search(list, 0, size, target)+1+"에 위치합니다.");
	}
	public static int search(int[] data, int begin, int end, int target ) {
		if(begin > end )
			return -1;
		else {
			int middle = (begin + end)/2;
			if(data[middle] == target)
				return middle;
			int index = search(data, begin, middle-1, target);
			if(index != -1)
				return index;
			else 
				return search(data, middle +1, end, target);
		}
	}
}
