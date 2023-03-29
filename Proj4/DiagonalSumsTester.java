/* 
 * PROJ 04: DIAGONAL SUMS
 * Do not edit the tester file!
 */

import java.util.*;
import java.util.function.Function;
import java.util.Arrays;
import java.util.function.BiFunction;

class DiagonalSumsTester {
  public static void main(String[] args) {
	int part = 0;
    int test = 0;

    int scores[] = {0,0,0,0,0};
    System.out.println("Part A tests:");
    Integer[] inputList = {7, 12, 15, 2, 8, -1};
    scores[0] += testListFunction(DiagonalSums::sumList, inputList, 43, 0);
    inputList[2] = -100;
    scores[0] += testListFunction(DiagonalSums::sumList, inputList, -72, 1);
	System.out.println("Tests Passed for Part A: "+scores[0]+"/2");
    
    System.out.println("Part B tests:");
    Integer[][] inputTableB1 = {{1,2}, {3,4}, {6,-1}};
    Integer[] outputTableB1 = {3, 7, 5};
    Integer[] outputTableB2 = {10, 5};
    scores[1] += testArrayFunction(DiagonalSums::sumDimensionTable, 0, inputTableB1, outputTableB1, 0);
    scores[1] += testArrayFunction(DiagonalSums::sumDimensionTable, 1, inputTableB1, outputTableB2, 1);
    System.out.println("Tests Passed for Part B: "+scores[1]+"/2");

    System.out.println("Part C tests:");
    Integer[][] inputTableC1 = {{1, 2, 3}, {3, 4, 5}, {6,-1, 7}};
    Integer[] outputTableC1 = {1, 5, 13, 4, 7};
    Integer[][] inputTableC2 = {{1, 2}, {4, 5}};
    Integer[] outputTableC2 = {1, 6, 5};
    scores[2] += testDiagArrayFunction(DiagonalSums::sumDiagTable, inputTableC1, outputTableC1, 0);
    scores[2] += testDiagArrayFunction(DiagonalSums::sumDiagTable, inputTableC2, outputTableC2, 1);
    System.out.println("Tests Passed for Part C: "+scores[2]+"/2");

    System.out.println("Part D tests:");
    Integer[][] inputTableD1 = {{1, 2, 3}, {6,-1, 7}};
    Integer[] outputTableD1 = {1, 8, 2, 7};
    Integer[][] inputTableD2 = {{1, 2, -4, 3, 5, 9, 20, -7}};
    Integer[] outputTableD2 = {1, 2, -4, 3, 5, 9, 20, -7};
    Integer[][] inputTableD3 = {{1, 2, 3}, {6,-1, 7}, {12, -4, 5}, {2, -3, 9}};
    Integer[] outputTableD3 = {1, 8, 14, 5, 2, 9};
    scores[3] += testDiagArrayFunction(DiagonalSums::sumDiagWeirdTable, inputTableD1, outputTableD1, 0);
    scores[3] += testDiagArrayFunction(DiagonalSums::sumDiagWeirdTable, inputTableD2, outputTableD2, 1);
    scores[3] += testDiagArrayFunction(DiagonalSums::sumDiagWeirdTable, inputTableD3, outputTableD3, 2);
    System.out.println("Tests Passed for Part D: "+scores[3]+"/3");

    System.out.println("Part E tests:");
    Integer[][][] inputTableE1 = {{{1, 2, 3}, {6,-1, 7}, {2,3,4}},{{1, 2, 3}, {6,-1, 7}, {2,3,4}},{{1, 2, 3}, {6,-1, 7}, {2,3,4}}};
    Integer[] outputTableE1 = {1, 9, 13, 22, 18, 14, 4};
    Integer[][][] inputTableE2 = {{{1,2},{1,2}},{{3,4},{5,-6}}};
    Integer[] outputTableE2 = {1, 6, 11, -6};
    scores[4] += test3DArrayFunction(DiagonalSums::sum3DTable, inputTableE1, outputTableE1, 0);
    scores[4] += test3DArrayFunction(DiagonalSums::sum3DTable, inputTableE2, outputTableE2, 1);
    System.out.println("Tests Passed for Part E: "+scores[4]+"/2");
    
  }

  public static int testListFunction(Function<Integer[], Integer> m, Integer[] input, int output, int problemNum) {
    try {
      if (m.apply(input) == output){
        System.out.println("Passed problem #"+problemNum);
        return 1;
      } else {
        System.out.println("Failed problem #"+problemNum);
        System.out.println("Output was: "+m.apply(input).toString()+"; Expected: "+output);
        return 0;
      }
    } catch (Exception e) {
      System.out.println("Encountered an error on problem #"+problemNum);
      System.out.println(e.toString());
      return 0;
    }    
  }
  
    public static int testArrayFunction(BiFunction<Integer, Integer[][], Integer[]> m, Integer dim, Integer[][] input, Integer[] output, int problemNum) {
    try {
      Integer[] attempt = m.apply(dim, input); 
      if (Arrays.equals(attempt, output)){
        System.out.println("Passed problem #"+problemNum);
        return 1;
      } else {
        System.out.println("Failed problem #"+problemNum);
        System.out.println("Output was: ");
        System.out.println(Arrays.toString(attempt));
        System.out.println("Expected: ");
        System.out.println(Arrays.toString(output));
        return 0;
      }
    } catch (Exception e) {
      System.out.println("Encountered an error on problem #"+problemNum);
      System.out.println(e.toString());
      return 0;
    }    
  }
  
    public static int testDiagArrayFunction(Function<Integer[][], Integer[]> m, Integer[][] input, Integer[] output, int problemNum) {
    try {
      Integer[] attempt = m.apply(input); 
      if (Arrays.equals(attempt, output)){
        System.out.println("Passed problem #"+problemNum);
        return 1;
      } else {
        System.out.println("Failed problem #"+problemNum);
        System.out.println("Output was: ");
        System.out.println(Arrays.toString(attempt));
        System.out.println("Expected: ");
        System.out.println(Arrays.toString(output));
        return 0;
      }
    } catch (Exception e) {
      System.out.println("Encountered an error on problem #"+problemNum);
      System.out.println(e.toString());
      return 0;
    }    
  }  


    public static int test3DArrayFunction(Function<Integer[][][], Integer[]> m, Integer[][][] input, Integer[] output, int problemNum) {
    try {
      Integer[] attempt = m.apply(input); 
      if (Arrays.equals(attempt, output)){
        System.out.println("Passed problem #"+problemNum);
        return 1;
      } else {
        System.out.println("Failed problem #"+problemNum);
        System.out.println("Output was: ");
        System.out.println(Arrays.toString(attempt));
        System.out.println("Expected: ");
        System.out.println(Arrays.toString(output));
        return 0;
      }
    } catch (Exception e) {
      System.out.println("Encountered an error on problem #"+problemNum);
      System.out.println(e.toString());
      return 0;
    }    
  }  

  

}