package a6_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class String3 {
    public static void main(String[] args) {
        // 5. 문자열 수정
        // 대소문자 변경
        String str1 = "Java Study";
        System.out.println(str1.toLowerCase()); // java study
        System.out.println(str1.toUpperCase()); // JAVA STUDY
        // 문자열 교체 replace
        System.out.println(str1.replace("Study", "공부")); // Java 공부
        // substring 중요!
        System.out.println(str1.substring(0,5)); // Java
        String text = "2024-10-28";
        String year = text.substring(0,4);
        String month = text.substring(5,7);
        String day = text.substring(8); // 두번째매개변수 없으면 끝까지
        System.out.println(year); // 2024
        System.out.println(month); // 10
        System.out.println(day); // 28
        String filename = "document.pdf";
        String extention = filename.substring(filename.indexOf('.')+1);
        System.out.println(extention); // pdf
        // split
        // 예제설명: sample안의 /- 을 기준으로 나눠서 배열에 담는 방법
        // [abc, def, ghi, jkl]
        String sample = "abc/def-ghi jkl";
        String[] strArray = sample.split(" |-|/");
        System.out.println(Arrays.toString(strArray)); //[abc, def, ghi, jkl]

    }
}
