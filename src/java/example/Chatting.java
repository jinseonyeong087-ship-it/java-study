public class Chatting {

    void startChat(String chatId) {
        // ✅ 바깥 메소드의 지역변수를 로컬 클래스에서 쓰려면 final 또는 effectively final이어야 함
        //    (한 번만 대입되어 이후 값이 바뀌지 않는 상태)
        //    ❌ String nickName = null; nickName = chatId;  → 두 번 대입이라서 컴파일 에러
        //    ⭕ 아래처럼 한 번만 대입하면 effectively final 충족
        final String nickName = chatId; // final로 못박아도 좋고, final 빼고 한 번만 대입해도 OK

        class Chat {
            public void start() {
                // ⚠️ 데모용 무한루프 — 실제에선 종료 조건이나 sleep을 두세요
                while (true) {
                    String inputData = "안녕하세요";
                    String message = "[" + nickName + "] " + inputData; // ⭕ 로컬 클래스에서 안전하게 참조
                    sendMessage(message);

                    // 데모용: 무한루프 방지
                    break;
                }
            }

            void sendMessage(String message) {
                // 실제 전송 로직이 없어서 콘솔 출력으로 대체
                System.out.println(message);
            }
        }

        Chat chat = new Chat();
        chat.start(); // ✅ 공백 있어도 컴파일은 되지만, 관례상 붙여 쓰는 게 좋습니다.
    }
}
