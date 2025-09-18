public class ShopService {
    // 1) 클래스 내부에서 미리 하나만 생성 (정적 초기화 방식)
    private static final ShopService instance = new ShopService();

    // 2) 외부에서 new를 못 하도록 생성자 private 처리
    private ShopService() {}

    // 3) 외부에서 사용할 때는 이 메서드로만 접근
    public static ShopService getInstance() {
        return instance;
    }
}
