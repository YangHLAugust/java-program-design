package site.yangliang.ccadm.practice;

public class Search  {


    public static int search(int[] numbers, int key) throws myexception {
		for(int i=0;i<numbers.length;i++) {
			if (numbers[i] == key) {
				return i;
			}
		}
    try {
        throw new myexception(key);
    }catch (myexception e){
        throw e;
    }
	}

}
class myexception extends Exception{
    myexception(int key){
        System.out.println("no this key"+key+"found");
    }
}

