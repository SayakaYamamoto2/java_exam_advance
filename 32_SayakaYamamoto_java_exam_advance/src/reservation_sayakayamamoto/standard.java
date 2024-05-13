package reservation_sayakayamamoto;
import java.io.IOException;
public class standard {
	public static void main(String[] args)throws IOException{
		//1.シ ス テ ム を 開 始 し た 後 、 InputController クラスのinputSeatNum メソッドを呼び出して座席番号を取得
		//メソッドを呼び出したい
		InputController inputController=new InputController();
		//座席番号を取得はできてる？？
		int num=inputController.inputSeatNum();
		
		//その座席番号が予約可能であるかを SeatsManager クラスのcheckVacantSeat メソッドを呼び出して調べる
		SeatsManager seatsManager=new SeatsManager();
		
		//予約可能であった場合はさらにSeatsManagerクラスのreserveSeat メソッドを呼び出して
		//座席を予約済みに変えた後、システム終了させる。
		if(seatsManager.checkVacantSeat(num)) {
			seatsManager.reserveSeat(num);
			System.out.println("座席の予約が完了しました。");
			
		}else {
			System.out.println("※予約済みの座席です。他の席を選択してください。");
		}
		
		//予約不可であった場合はその旨のメッセージを表示してシステムを終了させる。
		
		
	}	

}
