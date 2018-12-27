package BJ_1002;

import java.util.Scanner;

/**
 * @author lee
 * @desc
 *  1. �� ���� �ʹ� �� �� -  r > r1 + r2
 *  2. �� ���� �������� ����. (����) - r = r1 + r2
 *  3. �� ���� - ������ ����
 *  4. �� ���� �������� ����. (����) - r = |r1-r2|
 *  5. �ϳ��� ���� �ٸ� �ϳ��� �� �ȿ� �ְ� ������ ������ �ο��� ������ ���� �� - x1 = x2 & y1 = y2 & r1 != r2 
 *  6. �� ���� ��ġ ( x1 = x2 & y1 = y2 & r1 = r2 )
 *  7. �ϳ��� ���� �ٸ� �ϳ��� �� �ȿ� �ְ� ������ �ٸ��� ������ ���� �� - r < |r2-r1|   
 */
public class Main
{
    public static void main(String [] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int res[] = new int[T];
        for (int i = 0 ; i < T ; i++)
        {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();

            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();
            res[i] = solve(x1, y1, r1, x2, y2, r2);
        }
        for (int i = 0 ; i < T ; i++)
            System.out.println(res[i]);

        sc.close();
    }

    public static int solve(int x1, int y1, int r1, int x2, int y2, int r2)
    {
        double r = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

        // 6��
        if (x1 == x2 && y1 == y2 && r1 == r2)
            return -1;
        // 1�� 5�� 7��
        else if (r > r1 + r2 || x1 == x2 && y1 == y2 && r1 != r2 ||  r < Math.abs(r1-r2))
            return 0;
        // 2�� 4��
        else if (r == r1 + r2 || Math.abs(r1-r2) == r)
            return 1;
        // 3��
        return 2;
    }
}