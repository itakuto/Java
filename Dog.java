package test3;
class Dog1{
	private String name;
	void setName(String n){
		name=n;
	}
	String getName(){
		return name;
	}
	void selfIntro(){
		System.out.println("わたしは、犬の"+name+"です");
	}
}
class DogSpeak extends Dog1{
		void selfIntro(){
		System.out.println("わたしはしゃべる犬の"+getName()+"です");
	}
}
class DogSit extends Dog1{
	void selfIntro(){
		System.out.println("わたしはお座りができる犬の"+getName()+"です");
	}
}
public class Dog {
	public static void main(String[] args){
		Dog1[] ns={new Dog1(),new DogSpeak(),new DogSit()};
		ns[0].setName("ポチ");
		ns[1].setName("タロー");
		ns[2].setName("ハッピー");
		for(int i=0;i<ns.length;i++){
			ns[i].selfIntro();
		}
	}
}
