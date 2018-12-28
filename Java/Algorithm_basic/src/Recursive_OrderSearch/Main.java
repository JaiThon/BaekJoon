package Recursive_OrderSearch;

public class Main {
	public static void main(String args[]) {
		int size = 10;
		int list[] = {1,2,3,4,5,6,7,8,9,10};
		if(search_implicit(list,size,3)<0)
			System.out.println("�����ϴ�.");
		else
			System.out.println("�����մϴ�.");
		System.out.println((search_explicit(list,0,size,3)+1)+"�� °�� �����մϴ�.");
	}
	// �Ͻ��� ���� ��� n
	public static int search_implicit(int data[], int n, int target) {
		for(int i =0; i < n; i++)
			if(data[i] == target)
				return i;
		return -1;
	}
	// ����� ���� ���
	public static int search_explicit(int data[], int begin, int end, int target) {
		if(begin > end)
			return -1;
		else if(target == data[begin])
			return begin;
		else
			return search_explicit(data, begin+1, end, target);
	}
}
