public class Array02 {
  public static void main(String[] args) {
    double[] gradeArr = {90, 70.5, 80, 79, 82.5, 50, 70, 90.2, 89.5, 89.7};
    double sum = 0.0;
    double avg = 0.0;
    double Round_avg = 0.0;
    for (int i=0; i< gradeArr.length ; i++){
      System.out.print(gradeArr[i]+ " ");
      sum = sum + gradeArr[i];
      avg = sum / (double)gradeArr.length;
      Round_avg = Math.round(avg*100)/100.0;
    }
    System.out.println();
    System.out.println("합계"+sum);
    System.out.println("평균"+Round_avg);
  }
}
