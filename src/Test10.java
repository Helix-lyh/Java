/**
 * Created by Administrator on 2017/2/5.
 */
public class Test10 {
    public static void main(String[] args) {
        Test10 avgScore = new Test10();
        System.out.printf("平均分：%f",avgScore.getAvg(94, 81));
    }

    public double getAvg(double a,double b) {
        return (a+b)/2;
    }
}
