package com.algorithm.a1010;

/**
 * 香槟塔
 *
 * @author xf.chen
 * @date 2021/10/10 18:17
 * @since 1.0.0
 */
public class ChampagneTower {

    public static double champagneTower(int poured, int row, int glass) {
        double[][] ca = new double[100][100];
        ca[0][0] = poured;
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= glass; j++) {

                final double d = (ca[i][j] - 1) / 2.0;
                if (d > 0) {
                    ca[i + 1][j] += d;
                    ca[i + 1][j + 1] += d;
                }

            }
        }
        return Math.min(1, ca[row][glass]);
    }
}
