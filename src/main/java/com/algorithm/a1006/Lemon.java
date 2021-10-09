package com.algorithm.a1006;

/**
 * 柠檬水找零
 * 由一批人排队购买柠檬水，这些人有面值为5，10，20的钞票
 * 你如果能正常找零，返回true，否则返回false
 * 注意：一开始你手里没有零钱
 *
 * @author xf.chen
 * @date 2021/10/6 21:35
 * @since 1.0.0
 */
public class Lemon {

    /**
     * 分析：仅仅5块和10块可以用于找零，20无法找零
     */
    public static boolean lemon(int[] arr) {

        int five = 0, ten = 0;
        for (int m : arr) {
            if (m == 5) {
                // 给5块则无需找零
                five++;
            } else if (m == 10 && five > 0) {
                five--;
                ten++;
            } else {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
