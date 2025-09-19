import java.io.*;
import java.nio.charset.StandardCharsets;

public class SimpleFileRead {
    public static void main(String[] args) {
        // 읽을 파일 경로 지정
        String filePath = "C:\\jsy.java\\java-study\\src\\resorce\\test.txt";

        // try-with-resources로 자동 close
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath),
                                      StandardCharsets.UTF_8))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.println("파일 읽기 오류: " + e.getMessage());
        }
    }
}
