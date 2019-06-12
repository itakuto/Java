package test3;
class MyThread extends Thread{
	private String str;
	MyThread(String s){
		str=s;
	}
	public void run(){
		for(int i=0;i<6;i++){
			System.out.println("loop"+i+str);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){}
		}
	}
}
public class RunThreads {
	public static void main(String[] args){
		MyThread mt1=new MyThread(":トヨタのプリウスに給油しました");
		MyThread mt2=new MyThread(":ニッサンのフェアレディZに給油しました");
		MyThread mt3=new MyThread(":ホンダのヴェゼルに給油しました");
		mt1.start();
		mt2.start();
		mt3.start();
	}
}
