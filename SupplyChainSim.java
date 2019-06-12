package test3;
class Market{
	private int intData;
	private boolean blnAvailable=false;
	public synchronized int getData(){
		while (blnAvailable==false){
			try{
				wait();
			}
			catch (InterruptedException e){}
		}
		blnAvailable=false;
		notifyAll();
		return intData;
	}
	public synchronized void putData(int value){
		while(blnAvailable==true){
			try{
				wait();
			}
			catch(InterruptedException e){}
		}
		intData=value;
		blnAvailable=true;
		notifyAll();
	}
}
class Producer extends Thread{
	private Market myMk;
	public Producer(Market mk){
		myMk=mk;
	}
	public void run(){
		for(int i=0;i<10;i++){
			myMk.putData(i);
			System.out.println("生産者が市場に持ってきました.\n納入カウント："+i);
			try{
				sleep((int)(Math.random()*1000));
			}
			catch (InterruptedException e){}
		}
	}
}
class Consumer extends Thread{
	private Market myMk;
	public Consumer(Market mk){
		myMk=mk;
	}
	public void run(){
		int intValue=0;
		for(int i=0;i<10;i++){
			intValue=myMk.getData();
			System.out.println("小売商が市場から農作物を持ち出しました.\n持出カウント："+intValue);
		}
	}
}
public class SupplyChainSim {
	public static void main(String args[]){
		Market mk=new Market();
		Producer p=new Producer(mk);
		Consumer c=new Consumer(mk);
		p.start();
		c.start();
	}
}
