package site.yangliang.ccadm.example;

public  class  DataTypes {
    // ------------------------atom data types--------------------
    //原子元素
    /**boolean类型：1 bit*/
    boolean boolAtom=true;

    /**byte类型：1 byte=8bit  2^8*/
    byte byteAtom=127;
    /**char类型：2 byte  */
    char charAtom='A';
    /**short类型：4 byte */
    short shortAtom;
    /**short类型：8 byte*/
    int  intAtom;
    /**short类型：16 byte*/
    float floatAtom;
    /**double类型：32 byte*/
    double doubleAtom;

    /**long类型：64 byte*/
    long   longAtom;

    String string="xxxsssss";

    // ------------------------complex data types 复合数据类型-------------------
    //  数组
    //  枚举
    //  类

    byte[] byteArray={-128,0,127};
    short[] shorteArray={-300,0,900};
    int[]  intArray;
    float[] floatArray;
    double[] doubleArray;
    long[]   longArray;
    String stringArray;

    enum  Food{
        Apple,


        orange;
    }



    public static void main(String[] args){

    }
}

class AClass{
    int  a;
    long b;
    String text;
    enum  Apple{Big,Small}

   class Inner {
        String something="xyz";
    }
}