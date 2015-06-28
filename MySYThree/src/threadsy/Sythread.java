package threadsy;

import java.util.Date;

public class Sythread extends Thread{
	private genericSort gs;
	private insertSort is;
	public Sythread(genericSort gs){
		this.gs = gs;
	}
	public Sythread(insertSort is){
		this.is = is;
	}
	public void run()                                      //�߳��壬����Thread��run()
    {
		
		if (is == null){
			System.out.println("ð���߳̿�ʼ");
			gs.Sort();
			System.out.println("ð���߳̽���");
			
		}
		if (gs == null){
			System.out.println("�����߳̿�ʼ");
			is.Sort();
			System.out.println("�����߳̽���");
			
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data dt = new Data();
		genericSort GS = new genericSort(dt);
		insertSort IS = new insertSort(dt);
		(new Sythread(GS)).start();
		(new Sythread(IS)).start();
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
 * ð������  
 * ������data��������
 */
class genericSort{
	private int[] data = new int[1000];
    
	public genericSort(Data d){
		data = d.getData();
	}
	public void Sort() {
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
		System.out.println("ð��������ʱ��" + (end - start));
	}
}
/** 
 * ��������
 * ������data��������
 */
class insertSort{
	private int[] data = new int[1000];
 
	public insertSort(Data d){
		data = d.getData();
	}
	public void Sort() {
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
		System.out.println("����������ʱ��" + (end - start));
	}
}

