/* 
 * Project 04 ~ Diagonal Sums
 * GROUP MEMBER A:
 * GROUP MEMBER B:
 * GROUP MEMBER C (IF APPLICABLE; OTHERWISE DELETE THIS LINE):
 * Period #:
 */

class DiagonalSums {

  //Part A
  public static Integer sumList(Integer[] inputList) {
    int sum = 0;
    for (int x: inputList) {
      sum+=x;
    }
    return sum;
  }

  
  //Part B
  public static Integer[] sumDimensionTable(int sumDimension, Integer[][] inputTable) {
    Integer[] sumList;
    //by row
    if (sumDimension==0) {
      sumList = new Integer[inputTable.length];
      for (int i=0; i<inputTable.length; i++) {
        sumList[i]=0;
        for (int j=0; j<inputTable[0].length; j++) {
          sumList[i]+=inputTable[i][j];
        } 
      }
    }
    //by col
    else {
      sumList = new Integer[inputTable[0].length];
      for (int x=0; x<sumList.length; x++) sumList[x]=0;
      for (int i=0; i<inputTable.length; i++) {
        for (int j=0; j<inputTable[0].length; j++) {
          sumList[j]+=inputTable[i][j];
        } 
      }
    }
    return sumList;	// Replace this line
  }
  
  
  //Part C
  public static Integer[] sumDiagTable(Integer[][] inputTable) { 
    int numDiags = (inputTable.length+inputTable[0].length)-1;
    Integer[] sumList = new Integer[numDiags];
    System.out.println(sumList[0]);
    for (int i=0; i<inputTable.length; i++) {
      for (int j=0; j<inputTable[0].length; j++) {
        int diag=i+j;
        if (sumList[diag]==null) sumList[diag]=0;
        sumList[diag] += inputTable[i][j];
      } 
    }
    return sumList;	// Replace this line
  }

  //Part D
  public static Integer[] sumDiagWeirdTable(Integer[][] inputTable) {
    return sumDiagTable(inputTable);	// Replace this line
  }

  //Part E
  public static Integer[] sum3DTable(Integer[][][] inputTable) {
    int numDiags = (inputTable.length+inputTable[0].length+inputTable[0][0].length)-2;
    Integer[] sumList = new Integer[numDiags];
    for (int i=0; i<inputTable.length; i++) {
      for (int j=0; j<inputTable[0].length; j++) {
        for (int k=0; k<inputTable[0][0].length; k++) {
          int diag=i+j+k;
          if (sumList[diag]==null) sumList[diag]=0;
          sumList[diag] += inputTable[i][j][k];
        }
      } 
    }
    return sumList;	// Replace this line
  }
  
  
}
