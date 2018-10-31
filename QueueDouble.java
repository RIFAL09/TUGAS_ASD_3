package TUGAS_ASD_3;

import java.util.ArrayList;

public class QueueDouble {
	ArrayList<Double> kelase = new ArrayList<Double>();
	int rifal = -1;

	public void insert(Double value) {
		rifal++;
		kelase.add(rifal,value);
	}
	public Double get() {
		Double value = 0.1;
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
