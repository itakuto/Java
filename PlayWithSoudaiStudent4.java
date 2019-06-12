package test3;
class NameSodaiStudent4{
	private String name;
	void setName(String n){
		name=n;
	}
	String getName(){
		return name;
	}
	void selfIntro(){
		System.out.println("わたしは"+name+"です");
	}
}
class SkiSodaiStudent4 extends NameSodaiStudent4{
	void selfIntro(){
		System.out.println("わたしはスキーができる"+getName()+"です");
	}
	void ski(){
		System.out.println("スキー中!");
	}
}
public class PlayWithSoudaiStudent4 {
	public static void main(String[] args){
		NameSodaiStudent4[] ns={new NameSodaiStudent4(),new NameSodaiStudent4(),new SkiSodaiStudent4()};
		ns[0].setName("一郎");
		ns[1].setName("次郎");
		ns[2].setName("三郎");
		for(int i=0;i<ns.length;i++){
			ns[i].selfIntro();
		}
	}
}
