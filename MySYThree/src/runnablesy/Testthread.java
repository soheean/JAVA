package runnablesy;

import java.util.Date;

public class Testthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data dt = new Data();
		genericSort GS = new genericSort(dt);
		insertSort IS = new insertSort(dt);
		new Thread(GS).start();
		new Thread(IS).start();
	}
}
class Data{
	private int[] data = new int[1000];
    public Data() {
    	for(int i = 0; i < 1000; i++){
    		data[i] = (int) (Math.random() * 10000);
    	}
    }
	public int[] getData() {
		return data;
	}
}
/**
 * 冒泡排序  
 * 对数组data进行排序
 */
class genericSort implements Runnable{
	private int[] data = new int[1000];
	public genericSort(Data d){
		data = d.getData();
	}
	public void run() {
		System.out.println("冒泡排序：");
		long start = new Date().getTime();
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] > data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
			System.out.print(data[i] + ",");
		}
		long end = new Date().getTime();
		System.out.println();
		System.out.println("冒泡排序用时：" + (end - start));
	}
}
/** 
 * 插入排序
 * 对数组data进行排序
 */
class insertSort implements Runnable{
	private int[] data = new int[1000];
	public insertSort(Data d){
		data = d.getData();
	}
	public void run() {
		System.out.println("插入排序：");
		long start = new Date().getTime();
		for (int i = 1; i < data.length; i++) {
			for (int j = i; j > 0; j--) {
				if (data[j] < data[j - 1]) {
					int temp = data[j];
					data[j] = data[j - 1];
					data[j - 1] = temp;
				} else {
					continue;
				}
			}
		}
		long end = new Date().getTime();

		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + ",");
		}
		System.out.println();
		System.out.println("插入排序用时：" + (end - start));
	}
}
