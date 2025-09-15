public class ArrayRef {
    public static void main(String[] args) {
        String[] strArray = new String[3];
        strArray[0] = "java1";
        strArray[1] = "java1";
        strArray[2] = new String("java1");

        System.out.println( strArray[0].charAt(1));
        System.out.println( strArray[0] == strArray[2]);
        System.out.println( strArray[0].equals(strArray[2]));

        System.out.println();

        int[] oldIntArray = {1, 2, 3 };
        int[] newIntArray = new int[5];
        
      
        for(int i=0; i<oldIntArray. length; i++) {
            newIntArray[i] = oldIntArray[i];
        }

        for(int i=0; i<newIntArray. length; i++) {
            System.out.println(newIntArray[i]+ ",");
        }

        System.out.println();

        String[] oldStrArr = {"java", "html", "react"};
        String[] newStrArr = new String[3];

        System.arraycopy(oldStrArr, 0, newStrArr, 0, 3);

        for (int i = 0; i < newStrArr.length; i++) {
            System.out.println(newStrArr[i] + ", ");
        }

        System.out.println();

        int []scores = {99, 22, 33, 77, 88} ;
        int sum = 0;
        for (int score : scores) {
            sum = sum + score;
        }
        System.out.println("점수 총합= " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("점수 평균 = " + avg);

    }
}
