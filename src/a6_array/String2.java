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
        System.out.println(str1.indexOf('a')); //
        System.out.println(str1.lastIndexOf('a')); //
        System.out.println(str1.indexOf('a', 8)); //
        System.out.println(str1.lastIndexOf('a', 8)); //
        System.out.println(str1.indexOf("Java")); //
        System.out.println(str1.indexOf("java")); //
        System.out.println();
    }
}








