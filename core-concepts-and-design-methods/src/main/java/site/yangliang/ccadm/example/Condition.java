package site.yangliang.ccadm.example;

/**
 * 理解 条件中的逻辑
 */
public class Condition {

    static boolean and(boolean one,boolean another){
        if(one){
            if(another){
                return  true;
            }else{
                return false;
            }
        }else if(another){
            return false;
        } else {
            return false;
        }
    }

    static boolean shortCircuitAnd(boolean one,boolean another){
         if(one){
             if(another){
                 return  true;
             }else{
                 return false;
             }
         }else{
             return false;
         }
    }

    static  boolean trueCond(){
        System.out.println("run trueCond");
        return true;
    }

    static  boolean falseCond(){
        System.out.println("run falseCond");
        return false;
    }

    public static void main(String[] args){

        System.out.println("---------理解逻辑条件与执行顺序-----------");

        System.out.println("========================A & B======================");
        System.out.println(
               trueCond()&falseCond()
        );
        System.out.println("--------------------");
        System.out.println(
                and(trueCond(),falseCond())
        );

        System.out.println("========================B & A======================");
        System.out.println(
                and(falseCond(),trueCond())
        );
        System.out.println("--------------------");
        System.out.println(
                falseCond()&trueCond()
        );

        System.out.println("========================A && B======================");
        System.out.println(
                shortCircuitAnd(trueCond(),falseCond())
        );
        System.out.println("--------------------");
        System.out.println(
               trueCond() && falseCond()
        );

        System.out.println("========================B&&A======================");
        System.out.println(
                shortCircuitAnd(falseCond(),trueCond())
        );
        System.out.println("--------------------");
        System.out.println(
                falseCond() && trueCond()
        );
    }

}
