package TUGAS_ASD_3;
import java.util.ArrayList;

public class QueueString {
	ArrayList<String> kelase = new ArrayList<String>();
	int rifal = -1;

	public void insert(String value) {
		rifal++;
		kelase.add(rifal,value);
	}
	public String get() {
		String value = "KOSONG";
		if(rifal>-1) {
			value = kelase.get(0);
			kelase.remove(0);
			rifal--;
		}
		return value;
		
	}
	public void cetak() {
		System.out.println("ECOR : "+rifal+" > KELAS A: "+kelase.toString());
	}
}
