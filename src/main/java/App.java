import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {


    public static void main(String[] args) {
//        String regex = "(0|\\+84)\\d{2}[\\.\\-\\s]?\\d{3}[\\.\\-\\s]?\\d{4}";
//        String input = "0909789098, +84789067887, 090.890.5678";
//        Pattern p = Pattern.compile(regex);
//        Matcher m = p.matcher(input);
//
//        boolean matchFound = m.find();
//        while (matchFound){
//            String phone = input.substring(m.start(),m.end());
//            System.out.println(phone);
//            matchFound = m.find();
//        }
        checkDateMonth();

    }

    public static void checkDateMonth() {
        String regex = "\\d{1,2}[\\-\\/]\\d{1,2}[\\-\\/]\\d{4}";
        String input = "12/01/1989, 12.12.2021, 09-12-1990";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);

        boolean matchFound = m.find();
        while (matchFound) {
            String phone = input.substring(m.start(), m.end());
            System.out.println(phone);
            matchFound = m.find();


        }
    }
}
