package com.gmail.shudss00;

public class EquationsSystem {
    private final Matrix a;
    private final Matrix b = new Matrix(new int[][]{{1}, {2}, {3}, {4}, {5}});

    private EquationsSystem(double k, double m) {
        a = new Matrix(new double[][] {
                {12 + k, 2,       m / 4.0, 1,        2},
                {4,      113 + k, 1,       m / 10.0, m - 4},
                {1,      2,       -24 - k, 3,        4},
                {1,      2 / m,   4,       33 + k,   4},
                {-1,     2,       -3,      3 + m,    -44 - k}
        });
        System.out.println(a.toString());
    }

    public static EquationsSystem of(int k, int m) {
        return new EquationsSystem(k, m);
    }

//    public Matrix solveEquationsSystemByTheSquareRootMethod() {
//
//    }
}
