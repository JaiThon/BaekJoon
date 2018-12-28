package BJ_1004;

import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in);
	public static void main(String args[]) {
		int test_case = in.nextInt();

		for(int i = 0; i < test_case; i++) {
			int x_start = in.nextInt();
			int y_start = in.nextInt();

			int x_dest = in.nextInt();
			int y_dest = in.nextInt();
			int plant_number = in.nextInt();
			System.out.println(plant_position(x_start,  y_start,  x_dest,  y_dest,  plant_number));
		}
	}
	public static int plant_position(int x_start, int y_start, int x_dest, int y_dest, int plant_number) {

		int[] x_position = new int[plant_number];
		int[] y_position = new int[plant_number];
		int[] diameter = new int[plant_number];

		for(int i = 0 ; i < plant_number; i++) {
			x_position[i] = in.nextInt();
			y_position[i] = in.nextInt();
			diameter[i] = in.nextInt();
		}
		return distance(x_start, y_start, x_dest, y_dest, x_position, y_position, diameter);
	}

	public static int distance(int x_start, int y_start, int x_dest, int y_dest,
			int[] x_position, int[] y_position, int[] diameter) {
		int count = 0;
		for(int i =0 ; i < x_position.length; i++) {
			int d1 = (int) (Math.pow(x_start - x_position[i], 2)+ Math.pow(y_start - y_position[i], 2));
			int d2 = (int) (Math.pow(x_dest - x_position[i], 2)+ Math.pow(y_dest - y_position[i], 2));
			int r  = (int) (Math.pow(diameter[i], 2));

			if((d1 > r && d2 < r) || (d1 < r && d2 > r))
				count++;
		}
		return count;
	}
}
