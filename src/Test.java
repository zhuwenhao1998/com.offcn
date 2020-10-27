/**
 * Author:  create by zwh
 * Time:2020/10/27 10:04
 * 斐波那契数列
 */
public class Test {
    public static void main(String[] args) {
        for(int i = 1; i < 15;i++ ){

            System.out.println(fun(i)+" ");
        }
    }
    public static  int  fun(int i){
//
//
        if(i == 1 || i ==2){
            return 1;
        }else{
           return fun(i-1)+fun(i-2);
        }
    }
}
