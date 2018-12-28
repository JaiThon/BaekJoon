package BJ_1004;

import java.util.Scanner;

class Other {

    // Calculate Euclidian Distance
    static double euclidianDistance(int centerX, int centerY, int x, int y){
        return Math.sqrt(Math.pow(centerX - x, 2) + Math.pow(centerY - y, 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // # of test cases

        // test loop start
        for(int i = 0; i < T; i++){

            //start & end coordinates
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int count = 0;
            int n = sc.nextInt(); // # of planetary systems

            for(int psIdx = 0; psIdx < n; psIdx++) {
                // center coordinate of the circle
                int cx = sc.nextInt();
                int cy = sc.nextInt();
                int r = sc.nextInt();

                double disStart = euclidianDistance(cx, cy, x1, y1);
                double disEnd = euclidianDistance(cx, cy, x2, y2);

                if(disStart < r && disEnd > r){
                    count++;
                } else if(disStart > r && disEnd < r) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
