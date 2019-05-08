package site.yangliang.ccadm.practice;


public class Search {

	/**
	 * 查找
	 * @param numbers 数组
	 * @param key    要查找的元素
	 * @return  查找的元素在数组中的位置*/
	public static int search(int[] numbers, int key) throws MyException {
		for(int i=0;i<numbers.length;i++) {
			if (numbers[i] == key) {
			return i;
			}
		}
		throw new MyException(key);
	}

	}
	class MyException extends Exception{
		MyException(int key){
		System.out.println("no this key"+key+"found");
	}







	/**
	 * 二分查找
	 * @param numbers 有序数组
	 * @param key    要查找的元素
	 * @return 查找的元素在数组中的位置
	 */
	public static int binarySearch(int[] numbers, int key){

		return 0;
	}


		public static void main(String[] args) {

			try {
				Search.search(new int[]{1,2},3);
			}catch (MyException e){
				e.printStackTrace();
			}

		}
}
