public class ogrenci
{

	String Adi, Soyadi;
	float Vize, Final;

	public float ortalamaHesapla()
	{
		return (Vize * 0.4F + Final * 0.6F);
	}

	public boolean basarilimi()
	{
		return (ortalamaHesapla() >= 50);
	}

	public ogrenci(String adi, String soyadi, float vizeNotu, float finalNotu)
	{
		Adi = adi;
		Soyadi = soyadi;
		Vize = vizeNotu;
		Final = finalNotu;
	}

}