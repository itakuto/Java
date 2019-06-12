package test3;
interface ISoudaiStudent{
	void selfIntro();
}
class NameSoudaiStudent implements ISoudaiStudent{
	private String name;
	NameSoudaiStudent(String n){
		name=n;
	}
	void setName(String n){
		name=n;
	}
	String getName(){
		return name;
	}
	public void selfIntro(){
		System.out.println("僕、"+name+"なんです");
	}
}
class SkiSoudaiStudent extends NameSoudaiStudent{
	SkiSoudaiStudent(String n){
		super(n);
	}
	public void selfIntro(){
		System.out.println("僕、スキーができる"+getName()+"なんです");
	}
	void ski(){
		selfIntro();
		System.out.println("スキー中");
	}
}
class RoboSoudaiStudent implements ISoudaiStudent{
	private int num;
	RoboSoudaiStudent(int n){
		num=n;
	}
	void setNum(int n){
		num=n;
	}
	public void selfIntro(){
		System.out.println("僕はロボ"+num+"号");
	}
}
public class PlayWithISoudaiStudent {
	public static void main(String args[]){
		ISoudaiStudent[] ms={new NameSoudaiStudent("太郎"),new SkiSoudaiStudent("次郎"),new RoboSoudaiStudent(1)};
		for(int i=0;i<ms.length;i++){
			ms[i].selfIntro();
		}
	}
}
