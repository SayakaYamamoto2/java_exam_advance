package reservation_sayakayamamoto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputController {
	//引数なしvoid、メソッド名inputSeatNum
	public int inputSeatNum() throws IOException{
		//標準入力を利用し、1～30 の範囲でユーザーに数値を入力させる。
		System.out.println("ようこそジャマイカホールへ！");
		System.out.println("何番の座席を予約しますか？(1～30)");
		//入力受付
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String str=reader.readLine();
		
		//numにはint型の数字が入る
		int num=Integer.parseInt(str);
		
		//その後、入力値から１を引き、0～29 の範囲に補正した後、呼び出し元に補正後の数値を返す。
		num=num-1;
		return num;
		
	}
	
	

}
