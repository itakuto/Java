package test3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExTestException {
	public static void main(String args[]){
		String gs[]={"おはよう","こんにちは"};
		System.out.prientln("今は、午後ですか、午前ですか？");
		System.out.println("0 午前 1午後");
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println(gs[sc.nextInt()]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("例外発生："+e);
		}
		catch(InputMismatchException e){
			System.out.println("例外発生："+e);
		}
		finally{
			System.out.println("処理は終了しました");
		}
		System.out.println("おわり");
	}
}
