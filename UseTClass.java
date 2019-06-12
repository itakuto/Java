package test3;
class TClass{
	private int data;
	void setData(int data){
		this.data=data;
	}
	int getData(){
		return data;
	}
	void sIntro(){
		System.out.println("数字は"+data+"です");
	}
}
public class UseTClass {
	public static void main(String[] args){
		TClass tc=new TClass();
		tc.setData(123);
		tc.sIntro();
	}
}
