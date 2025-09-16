import java.util.Scanner;

public class ex050206 {

    public static void main(String[] args) {
        boolean run = true; // while 반복을 계속 돌릴지 결정하는 플래그
        int studentNum = 0; // 학생 수 저장
        int[] scores = null; // 점수를 저장할 배열 (처음에는 비어있음)
        Scanner sc = new Scanner(System.in); // 콘솔 입력용

        while (run) {
            System.out.println("---------------------------------------------------------");
            System.out.println("1.학생수 | 2. 점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("---------------------------------------------------------");
            System.out.print("선택> ");

            int selectNo = Integer.parseInt(sc.nextLine());

            if (selectNo == 1) {
                System.out.print("학생수> ");
                studentNum = Integer.parseInt(sc.nextLine()); // 학생 수 저장
                scores = new int[studentNum];  // 입력한 학생 수만큼 배열 생성
            } else if (selectNo == 2) {
                for (int i = 0; i < scores.length; i++) {
                    System.out.print("scores[" + i + "]> ");    //입력한 값은 scores[i]에 저장
                    scores[i] = Integer.parseInt(sc.nextLine());
                }
            } else if (selectNo == 3) {
                for (int i = 0; i < scores.length; i++) {
                    System.out.println("scores[" + i + "] = " + scores[i]);  //저장된 배열 값을 순서대로 출력
                }
            } else if (selectNo == 4) {
                int sum = 0;
                int max = Integer.MIN_VALUE;   // 가장 작은 값으로 시작
                for (int s : scores) {         // 향상된 for문으로 점수 하나씩 확인
                    if (s > max)               // 최고점 갱신
                        max = s;               
                    sum += s;                  // 총합 계산
                }                              // 최대값 찾기 + 합계 계산 동시 수행
                double avg = (double) sum / scores.length;
                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + avg);
            } else if (selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
        sc.close();
    }
}
