/**
 * Created by Administrator on 2017/2/4.
 */
public class Test03 {
    public static void main(String[] args) {
        char today='日';
        switch (today){
            case '一':
            case '三':
            case '五':
                System.out.println("今天吃豆浆");
                break;
            case '二':
            case '四':
            case '六':
                System.out.println("今天吃油条");
                break;
            default:
                System.out.println("今天吃主席套餐");
                break;
        }
    }
}
