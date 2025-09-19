import java.io.*;  
// java.io 패키지의 모든 클래스(FileInputStream, InputStreamReader, BufferedReader 등)를 가져옴

public class FileReadUTF8 {
    public static void main(String[] args) {
        // 읽을 파일 경로 (현재 프로젝트 폴더 기준)
        String filePath = "./test.txt";

        try (
            // 1️⃣ FileInputStream: 파일에서 바이트(byte) 단위로 데이터 읽기
            FileInputStream fis = new FileInputStream(filePath);

            // 2️⃣ InputStreamReader: 바이트 → 문자로 변환 (여기서 UTF-8 인코딩 지정)
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");

            // 3️⃣ BufferedReader: 문자를 라인 단위로 읽을 수 있게 버퍼링
            BufferedReader reader = new BufferedReader(isr)
        ) {
            String line;  // 한 줄씩 읽은 문자열을 저장할 변수

            // 4️⃣ 한 줄씩 읽기 (readLine은 더 이상 읽을 줄이 없으면 null 반환)
            while ((line = reader.readLine()) != null) {
                // 5️⃣ 읽은 줄 콘솔 출력
                System.out.println(line);
            }
        } catch (IOException e) {
            // 파일이 없거나 읽기 중 에러 발생 시 처리
            System.out.println("파일 읽기 중 오류 발생: " + e.getMessage());
        }
    }
}
