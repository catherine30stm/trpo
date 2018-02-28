package lab1;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {

        //Регулярное выражение для email
        String mail = "([a-zA-Z]{1,20})@([a-zA-Z]{1,20}).(com|ru)";

        //Регулярное выражение для даты
        String data = "(0[1-9]|1[0-9]|2[0-9]|3[01])-(0[1-9]|1[0-2])-(19|20|21)[0-9][0-9]";

        //Регулярное выражение для даты и времени
        String time = "(0[1-9]|1[0-9]|2[0-9]|3[01])-(0[1-9]|1[0-2])-(19|20|21)[0-9]{2}T(0[0-9]|1[0-9]|2[0-4])(:([0-5][0-9]))(:([0-5][0-9]))";



        //Регулярные выражения для проверки
        String s1 = "netjiol@mail.com";
        String s2 = "12-04-2015T17:52:30";
        String s3 =  "12-04-2015n";

        RegularExpression(mail, s1);
        RegularExpression(time, s2);
        RegularExpression(data, s3);
    }

    public static void RegularExpression(String rex, String str) {
        Pattern p = Pattern.compile(rex);
        Matcher m = p.matcher(str);
        if (m.matches()) {
            System.out.println("Regular expression");
        }
        else {
            System.out.println("Non regular expression");
        }
    }
}
