import java.util.Scanner;
public class hadiahganjil {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("No.1 Konversi Suhu");
	double fahrenheit, celcius;
	
	System.out.print("Masukkan nilai Celcius = ");
	celcius=input.nextDouble();
	
	fahrenheit = (celcius*9)/5 + 32;
	System.out.print("Fahrenheit = " +"("+celcius+" *9)/5+32"+"\n");
	System.out.println("Nilai konversinya adalah = " +fahrenheit+ " derajat");
	System.out.print("\n");
	
	System.out.print("No.2 Hitung luas lingkaran"+"\n");
	double l, r;
	double pi = 3.14;
	
	System.out.print("Masukkan nilai jari-jari = ");
	r=input.nextDouble();
	
	l = (pi*r*r);
	System.out.println("Luas lingkaran = " +pi+" x " +r+"^2.0");
	System.out.print("Hasilnya adalah = " +l+ "\n");
}
}