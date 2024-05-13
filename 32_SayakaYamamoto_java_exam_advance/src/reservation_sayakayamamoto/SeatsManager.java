package reservation_sayakayamamoto;

public class SeatsManager {
	//座席の予約情報。要素数 30 の boolean 型の配列。
	//static変数seatArray
	public static final boolean[] seatArray=new boolean[30];
	//trueの場合はその座席は予約済み、false の場合は空席とする。
	
	//メソッド１
	public boolean checkVacantSeat(int seatNum) {
		//座席番号 15 番と 21 番を予約済み(値を true)にする。
		seatArray[14]=true;
		seatArray[20]=true;
		//引数として受け取った番号の座席が空席であった場合は、true を返す。
		if (seatArray[seatNum]) {
			return false;
		}else{
		//予約済みであった場合は false を返す。
			return true;
		}		

	}
	
	//メソッド２
	public void reserveSeat(int seatNum) {
		//引数として受け取った番号の座席を予約済み(true)に変える。
		seatArray[seatNum]=true;
	}

}
