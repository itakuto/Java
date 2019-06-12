package test2no2;
import java.util.Scanner;
public class test2no2 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int d;
		System.out.println("第1問　世界一暮らしやすい国ランキングの第1位はどこでしょう？\n1 コスタリカ　2 バーレーン　3メキシコ\n整数入力＞");
		d=sc.nextInt();
		if(d==2){
			System.out.println("大正解！");
		}
		else{
			System.out.println("残念！不正解！コスタリカは2位、メキシコは3位です");
		}
		System.out.println("第2問　FIFA世界(男子)ランキングの第1位はどこでしょう？\n1 ブラジル　2 ポルトガル　3ドイツ\n整数入力＞");
		d=sc.nextInt();
		if(d==3){
			System.out.println("大正解！");
		}
		else{
			System.out.println("残念！不正解！ブラジルは2位、ドイツは3位です");
		}
	}
}
