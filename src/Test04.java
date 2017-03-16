/**
 * Created by Administrator on 2017/2/4.
 */
public class Test04 {
    public static void main(String[] args) {
                int num = 9;
                int count = 0;
                while(num/10>1){
                    num = num/10;
                    count += 1;
                }
                System.out.printf("它是个%d位的数！",count+1);
            }
        }
