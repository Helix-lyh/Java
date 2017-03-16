package myTools;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/14.
 */
public class Run {
    public static void main(String[] args) {
       strTools r = new strTools();
       System.out.println("请输入字符串");
       Scanner input = new Scanner(System.in);
       String str = input.next();
       System.out.println(r.reverse(str));
       System.out.println(r.isPlalindrome(str));
    }
}
