import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class odev
{

	public static void main(String args[]) throws Exception

	{
		File notlar = new File(
				"C:/Users/ibrahim/workspace/Dosyaislemleri/notlar.txt");
		File sonuclar = new File(
				"C:/Users/ibrahim/workspace/Dosyaislemleri/sonuçlar.txt");
		File kalanlar = new File(
				"C:/Users/ibrahim/workspace/Dosyaislemleri/kalanlar.txt");
		File gecenler = new File(
				"C:/Users/ibrahim/workspace/Dosyaislemleri/geçenler.txt");

		PrintStream pr = new PrintStream(sonuclar);
		PrintStream kl = new PrintStream(kalanlar);
		PrintStream gc = new PrintStream(gecenler);
		Scanner input = new Scanner(notlar);

		ArrayList<ogrenci> ogrenciler = new ArrayList();

		float vize1, final1;
		float hesaplanmisvize, hesaplanmisfinall, totalpuan;
		String ad, soyad;

		while (input.hasNextLine())
		{
			ad = input.next();
			soyad = input.next();
			vize1 = input.nextFloat();
			final1 = input.nextFloat();

			ogrenci ogrenci1 = new ogrenci(ad, soyad, vize1, final1);
			ogrenciler.add(ogrenci1);

			if (ogrenci1.basarilimi() == true)
			{
				gc.println(ogrenci1.Adi + " " + ogrenci1.Soyadi + " "
						+ ogrenci1.ortalamaHesapla());

			}

			else
			{
				kl.println(ogrenci1.Adi + " " + ogrenci1.Soyadi + " "
						+ ogrenci1.ortalamaHesapla());

			}

		}

		for (int i = 0; i < ogrenciler.size(); i++)

		{
			for (int j = 0; j < i; j++)
			{
				ogrenciler.get(i).ortalamaHesapla();

				if (ogrenciler.get(i).ortalamaHesapla() < ogrenciler.get(j)
						.ortalamaHesapla())
				{
					ogrenci tmp = ogrenciler.get(i);
					ogrenciler.get(i).Adi = ogrenciler.get(j).Adi;
					ogrenciler.get(i).Soyadi = ogrenciler.get(j).Soyadi;
					ogrenciler.get(i).Vize = ogrenciler.get(j).Vize;
					ogrenciler.get(i).Final = ogrenciler.get(j).Final;

					ogrenciler.get(j).Adi = tmp.Adi;
					ogrenciler.get(j).Soyadi = tmp.Soyadi;
					ogrenciler.get(j).Vize = ogrenciler.get(j).Vize;
					ogrenciler.get(j).Final = ogrenciler.get(j).Final;

				}
			}
		}

		for (int i = 0; i < ogrenciler.size(); i++)
		{
			pr.println(ogrenciler.get(i).Adi + " " + ogrenciler.get(i).Soyadi
					+ " " + ogrenciler.get(i).ortalamaHesapla());
		}
	}
}// Class

