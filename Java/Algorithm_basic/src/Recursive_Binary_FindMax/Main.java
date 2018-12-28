package Recursive_Binary_FindMax;

public class Main {
	public static void main(String args[]) {
		int size = 9;
		int list[] = {1,2,3,4,5,6,7,8,9,10};
		int target = 3;
		System.out.println("리스트에 존재하는 최대 수 : "+findMax(list,0,size));
}
	public static int findMax(int[] data, int begin, int end) {
		if(begin == end)
			return data[begin];
		else {
			int middle = (begin + end) / 2;
			int max1 = findMax(data, begin, middle);
			int max2 = findMax(data, middle+1, end);
			return Math.max(max1, max2);
		}
	}
}
