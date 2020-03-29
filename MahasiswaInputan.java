
import java.util.Scanner; 

public class MahasiswaInputan{
	public static void main(String[] args){
		
		Scanner masukan = new Scanner(System.in);
		/* Program */   
		System.out.print ("Nama	: "); 
		String a = masukan.nextLine();
		System.out.print ("Stambuk	: ");
		String b = masukan.nextLine();
		System.out.print ("Jurusan	: ");
		String c = masukan.nextLine();
		System.out.print ("Fakultas: ");		
		String d = masukan.nextLine();
		
		
		System.out.print("\n");
		/* coba ketik : masukan.nextInt(); ; Apa akibatnya ?*/    
		System.out.println ("----------------------------"); 
		System.out.println ("Nama	: "+a); 
		System.out.println ("Stambuk	: "+b);
		System.out.println ("Jurusan	: "+c);
		System.out.println ("Fakultas: "+d);
	}
}

/*
cat:
Nama    : Jezika Anastazya
Stambuk : 13020180143
Jurusan : teknik informatika
Fakultas: ilmu komputer
