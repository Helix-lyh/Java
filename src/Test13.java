/**
 * Created by Administrator on 2017/2/5.
 */
import java.util.Arrays;
public class Test13 {

    //完成 main 方法
    public static void main(String[] args) {
        int[] scores = {89 , -23 , 64 , 91 , 119 , 52 , 73};
        Test13 outPut = new Test13();
        outPut.three(scores);
    }

    //定义方法完成成绩排序并输出前三名的功能
    public void three(int[] scores){
        int[] threeScores = new int [3];
        int count =0;
        Arrays.sort(scores);
        for(int i =scores.length-1;i>=0;i--){
            if (scores[i]<0|scores[i]>100){
                continue;
            }
            else{
                threeScores[count]=scores[i];
                count+= 1;
            }
            if(count>=3){
                break;
            }
        }
        System.out.println(Arrays.toString(threeScores));
    }

}
