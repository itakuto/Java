package test3;
class NameSodaiStudent{
	private int number;
	void setName(int n){
		number=n;
	}
	void selfIntro(){
		System.out.println("記述したメソッドが実行されました");
		System.out.println("numberには"+number+"という番号が保存されています");
	}
}
public class playwithnamesodaistudent {
	public static void main(String[] args){
		NameSodaiStudent ns=new NameSodaiStudent();
		ns.setName(100);
		ns.selfIntro();
	}
}
