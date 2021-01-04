package recursion;

import java.util.HashMap;
import java.util.Map;

public class ClimbTheStairs {
    /**
     * 假如这里有 n 个台阶，每次你可以跨 1 个台阶或者 2 个台阶，请问走这 n 个台阶有多少种走法？
     * 设 n>1
     * 递归/非递归/存储中间量
     */

    public int recursion(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        return recursion(n - 1) + recursion(n - 2);
    }

    public int no_recursion(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int pro1 = 1;
        int pro2 = 2;
        int res = 0;
        for (int i = 3; i <= n; i++) {
            res = pro1 + pro2;
            pro1 = pro2;
            pro2 = res;
        }
        return res;
    }

    Map<Integer, Integer> map = new HashMap<>();

    public int map_climb_the_stairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int res = map_climb_the_stairs(n - 1) + map_climb_the_stairs(n - 2);
        map.put(n, res);
        return res;
    }

    public static void main(String[] args) {
        ClimbTheStairs climbTheStairs = new ClimbTheStairs();
        System.out.println(climbTheStairs.recursion(10));
        System.out.println(climbTheStairs.no_recursion(10));
        System.out.println(climbTheStairs.map_climb_the_stairs(10));
    }
}
