public class Example8 {
    public static void main(String[] args) {        //
        // double[] scores = { 83.5, 91.6, 75.7, 98.9 };
        // double sum = 0;
        // for (int i = 0; i < scores.length; i++) {
        //     sum += scores[i];
        // }
        // System.out.println("sum: " + sum);
        // int avg = (((int) sum) / 4);
        // System.out.println("avg: " + avg);

        // String[] names;
        // names = new String[] { "aaa", "bbb", "ccc" };

        // System.out.println(names[0]);
        // System.out.println(names[1]);


         System.out.println("프로그램 시작");

        // 조건에 따라 강제 종료
        if (args.length == 0) {
            System.out.println("아규먼트가 없습니다. 비정상 종료!");
            System.exit(2); // 비정상 종료 코드 echo $LASTEXITCODE
        }

        System.out.println("아규먼트 개수: " + args.length);
        System.out.println("정상 종료합니다.");
        System.exit(0); // 정상 종료
    }
}


    

