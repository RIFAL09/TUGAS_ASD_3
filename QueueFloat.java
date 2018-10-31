package TUGAS_ASD_3;

import java.util.ArrayList;

public class QueueFloat {
	ArrayList<Float> kelase = new ArrayList<Float>();
	int rifal = -1;

	public void insert(Float value) {
		rifal;
		kelase.add(rifal,value);
	}
	public Float get() {
		Float value = 0.1f;
		if(rifal>-1) {
			value = kelase.get(0);
			kelase.remove(0);
			rifal--;
		}
		return value;
		
	}
	public void cetak() {
		System.out.println("ECOR : "+rifal+" > VARIABLE: "+kelase.toString());
	}
}
