package site.yangliang.ccadm.example;

/**
 * 程序 = 数据结构 + 算法
 *
 * 程序设计就是：函数（过程设计）+变量定义（数据表示设计）
 *
 */
public class ComputeWithDataTypes {

    /**
     * int 的加法
     * @param one  一个数
     * @param another 另一个数
     * @return  两个数的和
     */
    static int add(int one,int another){
        return one+another;
    }

    /**
     * 在加法的基础上定义乘法
     * @param one   一个数
     * @param another 另一个数
     * @return    两个数的乘积
     */
    static int mul(int one,int another){
        int result=one;
        for(int i=0;i<another;i++){
            result=add(result,one);
        }
        return result;
    }

    /**
     * 字符串的加法
     * */
    static String add(String one,String another){
        return one+another;
    }

    /**
     * 字符串的加法上定义乘法
     * */
    static String mul(  String one,int times){
        String result=one;
        for(int i=0;i<times;i++){
            result=add(result,one);
        }
        return result;
    }



    public static void main(String[] args){


        System.out.println(add(10,5));
        System.out.println(mul(10,5));

        System.out.println(add("java ","programming"));
        System.out.println(mul("java ",4));
    }
}
