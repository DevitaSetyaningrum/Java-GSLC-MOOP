import java.util.Scanner;

public class Main {
	
	Chef chef;
	Driver driver;
	Worker iworker;
	Artis artis;
	Pelukis pelukis;
	Polisi polisi;
	
	Scanner scan = new Scanner (System.in);
	
	public void Character () {
		chef = new Chef ("Chef", "Seseorang yang handal memasak.");
		driver = new Driver ("Driver", "Seseorang yang jago mengeudi");
		iworker = new Worker ("Worker", "Seseorang yang bisa bekerja");
		artis = new Artis ("Artis", "Seseorang yang memiliki jiwa seni");
		pelukis = new Pelukis ("Pelukis", "Seseorang yang ahli melukis");
		polisi = new Polisi ("Polisi", "Seseorang yang menjaga keamanan");
		
	}
	

	public Main() {
		// TODO Auto-generated constructor stub
		Character();
		
		String input;
		String tmp [];
		String tmp2[];
		
		
		System.out.println("Simulasi kelompok kemampuan");
		System.out.println("0:Chef");
		System.out.println("1:Driver");
		System.out.println("2:Worker");
		System.out.println("3:Artis");
		System.out.println("4:Pelukis");
		System.out.println("5:Polisi");
		System.out.println("Input  : ");
		
		input = scan.nextLine();
		tmp = input.split("");
		tmp2 = tmp[1].split(",");
		
		if(tmp[0].equals("info")) {
			for (int i=0; i<tmp2.length;i++) {
				if(tmp[i].equals("0")) {
					chef.getInfo();
				} else if(tmp[i].equals("1")) {
					driver.getInfo();
				} else if (tmp[i].equals("2")) {
					iworker.getInfo();
				} else if(tmp[i].equals("3")) {
					artis.getInfo();
				} else if(tmp[i].equals("4")) {
					pelukis.getInfo();
				} else if (tmp[i].equals("5")) {
					polisi.getInfo();
				}
			}
		} else if (tmp[0].equals("Cook")) {
			for (int i=0; i<tmp2.length; i++) {
				if(tmp[i].equals("0")) {
					chef.Cook();
				} else if(tmp2[i].equals("1")) {
					System.out.println("Karakter tidak dapat melakukan aktifitas");
				} else if (tmp2[i].equals("2")) {
					iworker.Cook();
				} else if (tmp2[i].equals("3")) {
					System.out.println("Karakter tidak dapat melakukan aktifitas");
				} else if (tmp2[i].equals("4")) {
					System.out.println("Karakter tidak dapat melakukan aktifitas");
				} else if (tmp2[i].equals("5")) {
					System.out.println("Karakter tidak dapat melakukan aktifitas");
				} 
			}
		}
		
		else if(tmp[0].equals("Drive")){
			for(int i=0;i<tmp2.length;i++) {
				if(tmp2[i].equals("0"))
					System.out.println("Karakter tidak dapat melakukan aksi");
				else if(tmp2[i].equals("1"))
					driver.Drive();
				else if(tmp2[i].equals("2"))
					iworker.Drive();
				else if(tmp2[i].equals("3"))
					System.out.println("Karakter tidak dapat melakukan aksi");
				else if(tmp2[i].equals("4"))
					System.out.println("Karakter tidak dapat melakukan aksi");
				else if(tmp2[i].equals("5"))
					System.out.println("Karakter tidak dapat melakukan aksi");
			}
		}
		
		else if(tmp[0].equals("Work")){
			for(int i=0;i<tmp2.length;i++) {
				if(tmp2[i].equals("0"))
					System.out.println("Karakter tidak dapat melakukan aksi");
				else if(tmp2[i].equals("1"))
					System.out.println("Karakter tidak dapat melakukan aksi");
				else if(tmp2[i].equals("2"))
					iworker.Work();
				else if(tmp2[i].equals("3"))
					System.out.println("Karakter tidak dapat melakukan aksi");
				else if(tmp2[i].equals("4"))
					System.out.println("Karakter tidak dapat melakukan aksi");
				else if(tmp2[i].equals("5"))
					System.out.println("Karakter tidak dapat melakukan aksi");
			}
		}
		
		else if(tmp[0].equals("Paint")){
			for(int i=0;i<tmp2.length;i++) {
				if(tmp2[i].equals("0"))
					System.out.println("Karakter tidak dapat melakukan aksi");
				else if(tmp2[i].equals("1"))
					System.out.println("Karakter tidak dapat melakukan aksi");
				else if(tmp2[i].equals("2"))
					iworker.Paint();
				else if(tmp2[i].equals("3"))
					artis.Paint();
				else if(tmp2[i].equals("4"))
					pelukis.Paint();
				else if(tmp2[i].equals("5"))
					System.out.println("Karakter tidak dapat melakukan aksi");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Main();

	}

}
