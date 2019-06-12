package test3;
class SodaiStudent{
	private int calorie;
	void setCalorie(int c){
		calorie=c;
	}
	int getCalorie(){
		return calorie;
	}
	void study(){
		System.out.println("カリカリ...");
		calorie--;
	}
}
public class StudyWithSodaiStudent {
	public static void main(String[] args){
		SodaiStudent ss=new SodaiStudent();
		ss.setCalorie(10);
		System.out.println("カロリー:"+ss.getCalorie());
		ss.study();
		System.out.println("カロリー:"+ss.getCalorie());
		ss.study();
		System.out.println("カロリー:"+ss.getCalorie());
		ss.study();
	}
}
