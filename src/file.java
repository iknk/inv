import java.io.File;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class file

{

	public static void main(String[] args) throws Exception
	{
		Random r = new Random();

		String sayilar = "ibrahimkonuk.txt";
		String tek = "TekSay�.txt";
		String cift = "�iftSay�.txt";

		File f = new File(sayilar);

		if (!f.exists())
		{
			f.createNewFile();
		}

		File t = new File(tek);

		if (!t.exists()) // DOSYALARIN OLU�TURULDU�U KISIM
		{
			t.createNewFile();
		}

		File c = new File(cift);

		if (!c.exists())
		{
			c.createNewFile();
		}

		PrintStream ct = new PrintStream(cift);
		PrintStream tk = new PrintStream(tek); // �NPUT NESNE OLU�TURMA KISMI
		PrintStream pr = new PrintStream(sayilar);

		for (int i = 0; i < 10; i++)
		{
			int a = r.nextInt(1000);
			pr.println(a); // RASTGELE SAYI YAZDIRMA KISMI
		}

		Scanner input = new Scanner(f);

		while (input.hasNext())
		{
			int sayi = input.nextInt();
			if (sayi % 2 == 0) // SAYILARIN TEKL�K / ��FTL�K KONTROL�N�N
								// YAPILDI�I KISIM
			{
				ct.println(sayi);
			}

			else
			{
				tk.println(sayi);
			}

		}

	}

}
