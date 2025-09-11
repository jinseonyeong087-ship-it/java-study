public class CompareToExample {
    
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "apple";

        // str1 vs str2
        int result1 = str1.compareTo(str2);
        System.out.println("apple.compareTo(banana) = " + result1);

        // str2 vs str1
        int result2 = str2.compareTo(str1);
        System.out.println("banana.compareTo(apple) = " + result2);

        // str1 vs str3
        int result3 = str1.compareTo(str3);
        System.out.println("apple.compareTo(apple) = " + result3);
    }
}


