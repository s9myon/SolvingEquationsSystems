package com.gmail.shudss00;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Matrix m1 = new Matrix(new int[][]{{1, 4}, {2, 5}, {3, 6}});
        Matrix m2 = new Matrix(new int[][]{{1, 2, 3}, {4, 5, 6}});
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m1.multiplyByMatrix(m2));
        EquationsSystem.of(20, 5);
    }
}
