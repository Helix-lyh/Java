package myTools;
import java.util.logging.Logger;
/**
 * Created by Administrator on 2017/3/14.
 */
public class strTools {
    public String reverse(String str){
        String reverStr = "";
        for (int i=str.length();i>0;i--){
            reverStr += str.charAt(i-1);
        }
        return reverStr;
    }

    public boolean isPlalindrome(String str){
        if(str.equals(reverse(str))){
            return true;
        }
        else {
            return false;
        }
    }
}
