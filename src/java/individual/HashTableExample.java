import java.util.*;

public class HashTableExample {
    
    public static void main(String[] args) {
        Map<String, String>map = new Hashtable<String, String>();

        map.put("spring1", "aaaa");
        map.put("spring2", "aaaa");
        map.put("spring3", "aaaa");
        map.put("spring4", "aaaa");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("아이디 입력해 주세요.");
            String id = scanner.nextLine();

            System.out.println("비번 입력해 주세요.");
            String pw = scanner.nextLine();

            System.out.println();

            if (map.containsKey(id)) {
                if (map.get(id).equals(pw)) {
                    System.out.println("로그인되었습니다.");
                    break;
                } else {
                    System.out.println("비번이 일치하지 않습니다.");
                } 
            }else {
                    System.out.println("입력하신 아이디가 존재하지 않습니다.");
                }
            }
        }
    }

