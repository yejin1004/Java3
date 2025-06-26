package a6_array;

public class String2 {
    public static void main(String[] args) {
        // 1. 문자열 길이 length()
        String str1 = "Hello Java!";
        String str2 = "안녕하세요! 반갑습니다.";
        System.out.println(str1.length()); // 11
        System.out.println(str2.length()); // 13
        System.out.println();

        // 2. 문자열 검색 charAt(), indexOf(), lastIndexOf()
        System.out.println(str1.charAt(1)); // e
        System.out.println(str2.charAt(1)); // 녕
        System.out.println();
        System.out.println(str1.indexOf('a')); // 7
        System.out.println(str1.lastIndexOf('a')); // 9
        System.out.println(str1.indexOf('a', 8)); // 9
        System.out.println(str1.lastIndexOf('a', 8)); // 7
        System.out.println(str1.indexOf("Java")); // 6
        System.out.println(str1.indexOf("java")); // -1 (검색실패,대소문자구별)
        System.out.println();

        // 3. 문자열의 변환 및 연결 valueOf(), concat()
        String str3 = String.valueOf(2.3); // double -> String
        String str4 = String.valueOf(false); // boolean -> String
        System.out.println();
        String str5 = str3.concat(str4);
        System.out.println(str5); //
        String str6 = "안녕" + 3;
        String str7 = "안녕".concat(String.valueOf(3));
        System.out.println(str6); //
        System.out.println(str7); //
    }
}








