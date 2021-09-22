package com.gmail.shudss00;

public class Matrix {

    private final double[][] matrix;
    private final int rows;
    private final int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new double[cols][rows];
    }

    public Matrix(int[][] matrix) {
        cols = matrix.length;
        rows = matrix[0].length;
        this.matrix = new double[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                this.matrix[i][j] = matrix[i][j];
            }
        }
    }

    public Matrix(double[][] matrix) {
        cols = matrix.length;
        rows = matrix[0].length;
        this.matrix = new double[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                this.matrix[i][j] = matrix[i][j];
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public double getElement(int i, int j) {
        return matrix[i][j];
    }

    @Override
    public String toString() {
        final StringBuilder str = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                str.append(" ").append(matrix[i][j]);
            }
            str.append("\n");
        }
        str.append("\n");
        return str.toString();
    }

    private Matrix transpose() {
        double[][] transposedMatrix = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return new Matrix(transposedMatrix);
    }

    /**
     * Matrix multiplication method.
     * @param matrixMultiplier Multiplier
     * @return Product
     */
    public Matrix multiplyByMatrix(Matrix matrixMultiplier) {
        if(rows != matrixMultiplier.getCols()) return null;
        double[][] resultMatrix = new double[cols][matrixMultiplier.getRows()];
        for(int i = 0; i < cols; i++) {
            for(int j = 0; j < matrixMultiplier.getRows(); j++) {
                for(int k = 0; k < rows; k++) {
                    resultMatrix[i][j] += matrix[i][k] * matrixMultiplier.getElement(k, j);
                }
            }
        }
        return new Matrix(resultMatrix);
    }
}
