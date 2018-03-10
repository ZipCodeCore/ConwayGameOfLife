package com.zipcodeconway;

public class ConwayGameOfLife {

    public ConwayGameOfLife(Integer dimension) {
     }

    public ConwayGameOfLife(Integer dimension, int[][] startmatrix) {
    }

    public static void main(String[] args) {
        ConwayGameOfLife sim = new ConwayGameOfLife(50);
        int[][] endingWorld = sim.simulate(50);
    }

    // Contains the logic for the starting scenario.
    // Which cells are alive or dead in generation 0.
    // allocates and returns the starting matrix of size 'dimension'
    private int[][] createRandomStart(Integer dimension) {
        return new int[1][1];
    }

    public int[][] simulate(Integer maxGenerations) {
        return new int[1][1];
    }

    // copy the values of 'next' matrix to 'current' matrix,
    // and then zero out the contents of 'next' matrix
    public void copyAndZeroOut(int[][] next, int[][] current) {
    }

    // Calculate if an individual cell should be alive in the next generation.
    // Based on the game logic:
	/*
		Any live cell with fewer than two live neighbours dies, as if by needs caused by underpopulation.
		Any live cell with more than three live neighbours dies, as if by overcrowding.
		Any live cell with two or three live neighbours lives, unchanged, to the next generation.
		Any dead cell with exactly three live neighbours cells will come to life.
	*/
    private int isAlive(int row, int col, int[][] world) {
      return getLeft(row, col, world) +
                getRight(row, col, world) +
              getAboveRow(row, col, world) +
              getBelowRow(row, col, world);

    }

    // return 1 if the cell to the left is alive, 0 if not
    private int getLeft(int row, int col, int[][] world) {
        return -1;
    }

    // return 1 if the cell to the right is alive, 0 if not
    private int getRight(int row, int col, int[][] world) {
        return -1;
    }

    private int getTop(int row, int col, int[][] world) {
        return -1;
    }

    private int getBottom(int row, int col, int[][] world) {
        return -1;
    }

    // return the live cells in the row above
    private int getAboveRow(int row, int col, int[][] world) {
        return -1;
    }

    // return the live cells in the row below
    private int getBelowRow(int row, int col, int[][] world) {
        return -1;
    }


}
