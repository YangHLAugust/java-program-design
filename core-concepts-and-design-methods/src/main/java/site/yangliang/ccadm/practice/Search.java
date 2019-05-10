package site.yangliang.ccadm.practice;

import java.util.Arrays;
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
		System.out.println("no this key "+key+" found");
	}







	/**
	 * 二分查找
	 * @param numbers 有序数组
	 * @param key    要查找的元素
	 * @return 查找的元素在数组中的位置
	 */
	public static int binarySearch(int[] numbers, int key) throws MyException{
	    int min=0,
            max=numbers.length,
            mid;
        Arrays.sort(numbers);
        while (min<=max) {
			mid = (min + max) / 2;
			if (key < numbers[mid]) {
				max=mid;
			} else if (key > numbers[mid]) {

				min = mid;
			} else {
			System.out.println("key has been found is "+numbers[mid]);break;
			}
		}
        throw new MyException(key);
	}


		public static void main(String[] args) {

			try {
				//Search.search(new int[]{1,2},3);
				binarySearch(new int[]{5,8,13,2,4,89,65,44},44);
			}catch (MyException e){
				e.printStackTrace();
			}

		}
}
