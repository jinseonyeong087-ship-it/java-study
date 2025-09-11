public class exam01 {

    public static void main(String[] args) {
        
        byte byteValue = 10;  
        // byte 타입(1바이트, -128 ~ 127 범위)의 변수에 값 10 저장

        int intValue = byteValue;  
        // 작은 타입(byte) → 큰 타입(int) 자동 형변환 (묵시적 변환)
        System.out.println("intValue: " + intValue);  
        // 결과: intValue: 10

        char charValue = '가';  
        // char 타입(2바이트, 유니코드 문자 하나 저장)에 '가' 저장

        intValue = charValue;  
        // char → int 자동 형변환 (문자의 유니코드 값이 int에 저장됨)
        System.out.println("가의 유니코드: " + intValue);  
        // '가'의 유니코드 값: 44032 출력

        intValue = 50;  
        // int 변수에 50 저장

        long longValue = intValue;  
        // int(4바이트) → long(8바이트) 자동 형변환
        System.out.println("longValue: " + longValue);  
        // 결과: longValue: 50

        longValue = 100;  
        // long 변수에 100 저장

        float floatValue = longValue;  
        // long(정수) → float(실수) 자동 형변환
        // float는 약 7자리 정밀도까지 표현 가능
        System.out.println("floatValue: " + floatValue);  
        // 결과: floatValue: 100.0

        floatValue = 100.5F;  
        // float 변수에 100.5 저장 (접미사 F 필요)

        double doubleValue = floatValue;  
        // float(4바이트) → double(8바이트) 자동 형변환
        System.out.println("doubleValue: " + doubleValue);  
        // 결과: doubleValue: 100.5
    }
    
}
