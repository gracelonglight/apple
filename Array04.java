public class Array04 {
  public static void main(String[] args) {
    int rows = 2, columns = 3;
    int[][] firstMatrix = {{2,3,4},{3,2,1}};
    int[][] secondMatrix = {{1,2,3},{-4,-2,1}};
    int i, j;
    int sum[][] = { };

    for(i = 0; i < 2; i++)
    {
      for (j = 0; j < 3; j++)
      {
        sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
        System.out.printf("%4d", sum[i][j]);
      }
      System.out.printf("\n");
    }

    System.out.printf("\n\n");
  }
}
