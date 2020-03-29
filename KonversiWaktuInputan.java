import java.util.Scanner;

public class KonversiWaktuInputan{
	
	public static void main(String[] args){
		
		int totalDetik, detikSekarang, totalMenit, menitSekarang, totalJam, jamSekarang;
		
		Scanner detik = new Scanner(System.in);
		
		System.out.println("Masukan detik : ");
		totalDetik = detik.nextInt();
		
		detikSekarang=totalDetik%60;
		totalMenit=totalDetik/60;
		menitSekarang=totalMenit %60;
		totalJam=totalMenit/60;
		jamSekarang=totalJam%24;
		System.out.println(+jamSekarang +" Jam " +menitSekarang +" menit " +detikSekarang +" detik.");
		
	}
	
}