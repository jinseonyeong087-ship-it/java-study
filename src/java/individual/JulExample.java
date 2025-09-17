import java.util.logging.Level;
import java.util.logging.Logger;

public class JulExample {

    // Logger 생성 (클래스 이름을 기준으로 생성)
    private static final Logger logger = Logger.getLogger(JulExample.class.getName());

    public static void main(String[] args) {
        logger.info("애플리케이션 시작");

        String user = "admin";
        logger.log(Level.INFO, "사용자 로그인: {0}", user);

        try {
            int result = 10 / 0;
        } catch (Exception e) {
            logger.log(Level.SEVERE, "에러 발생!", e);
        }

        logger.warning("경고 메시지 출력");
        logger.fine("이 메시지는 기본 레벨에서 보이지 않을 수 있음");
    }
}
