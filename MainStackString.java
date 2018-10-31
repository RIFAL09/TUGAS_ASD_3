package TUGAS_ASD_3;

public class MainStackString {
public static void main(String[] args) {
		classstackstring st= new classstackstring();
		
		st.push("rifal");
    st.push("ifal");
		st.push("mail");
		st.push("cail");
		
		String d0=st.pop();
		System.out.println(d0);
		st.cetak();
	}
}
