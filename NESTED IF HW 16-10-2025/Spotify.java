import java.util.Scanner;

class Spotify
{
	public static void main(String[] args)
	{
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("WELCOME TO SPOTIFY");
		System.out.println("SELECT YOUR OPTION, THE OPTIONS ARE");
		
		System.out.println("1. A.R.RAHUMAN");
		System.out.println("2. ANIRUDH");
		System.out.println("3. HARISH JEYARAJ");
		System.out.println("4. ILLAYARAJA");
		System.out.println("5. U1");
		
		int Spot = Scan.nextInt();
		
		if (Spot==1)
		{
			System.out.println("A.R.RAHUMAN");
			System.out.println("Select Your Mood, The Option Are");
			
			System.out.println("1.Melody");
			System.out.println("2.Kuthu");
			System.out.println("3.Motivational Song");
			System.out.println("4.Sad");
			
			int Menu = Scan.nextInt();
			
			if (Menu==1)
			{
				System.out.println("Melody Song");
				
				System.out.println("Netru Illadha Matram");
				System.out.println("Enna Solla Pogirai");
				System.out.println("Ennavale Adi Ennavale");
				System.out.println("Malargale Malargale");
				
			}
			else if (Menu==2)
			{
				System.out.println("Thaiya Thaiya");
				System.out.println("Mukkala Mukkabala");
				System.out.println("Urvashi Urvashi");
				System.out.println("Aathichudi");
			}

			else if (Menu==3)
			{
				System.out.println("Vande Mataram");
				System.out.println("Oruvan Oruvan Mudhalali");
				System.out.println("Shakthi kodu");
				System.out.println("Kappal Yeari Poyachu");
			}

			else if (Menu==4)
			{
				System.out.println("Poongatrile");
				System.out.println("Marudhani");
				System.out.println("Rasathi");
				System.out.println("Oru Poiyava Sol");
			}
			
			else 
			{
				System.out.println("Invalid Songs");
			}
		}
		
		else if(Spot==2)
		{
			System.out.println("ANIRUTH");
			
			
			System.out.println("1.Melody Songs");
			System.out.println("2.Kuthu Songs");
			System.out.println("3.Motivational Songs");
			System.out.println("4.Sad Songs");
			
			System.out.println("Choose your Opinion");
			int Menu= Scan.nextInt();
			
			if(Menu==1)
			{
				System.out.println("Neeyum Nanum Anbe");
				System.out.println("Velicha Poove");
				System.out.println("Po Indru Neeyaga");
				System.out.println("Nee Partha Vizhigal");
			}
			else if(Menu==2)
			{
				System.out.println("Vathi Raid");
				System.out.println("Naa Ready");
				System.out.println("Badass");
				System.out.println("Vantha Edam");
			}
			else if(Menu==3)
			{
				System.out.println("Velai Illa Pattadhari");
				System.out.println("Boomi Enna Suthudhe");
				System.out.println("Ethir Neechal");
				System.out.println("Surviva");
			}
			else if(Menu==4)
			{
				System.out.println("Porkanda Singam");
				System.out.println("Kanave kanave");
				System.out.println("Kannana Kanne");
				System.out.println("Jodi Nilave");
			}
			else 
			{
				System.out.println("Invaild Songs");
			}
		}
		
		
		else if(Spot==3)
		{
			System.out.println("HARISH JEYARAJ");
			
			
			System.out.println("1.Melody Songs");
			System.out.println("2.Kuthu Songs");
			System.out.println("3.Sad Songs");
			
			System.out.println("Choose your Opinion");
			int Menu = Scan.nextInt();
			
			if(Menu==1)
			{
				System.out.println("Unnale");
				System.out.println("Annul Mele");
				System.out.println("yedho Ondru");
				System.out.println("Vaseegara");
			}
			else if(Menu==2)
			{
				System.out.println("Thirunalveli Halwa da");
				System.out.println("Aradi Katre");
				System.out.println("Soda Battle");
				System.out.println("Aruva Meesai");
			}
			else if(Menu==3)
			{
				System.out.println("Venmadhiye");
				System.out.println("Oh Maname");
				System.out.println("Yemma yemma");
				System.out.println("Othayile");
			}
			else 
			{
				System.out.println("Invaild Songs");
			}
		}
		
		
		else if(Spot==4)
		{
			System.out.println("ILLAIYARAJA");
			
			
			System.out.println("1.Melody Songs");
			System.out.println("2.Kuthu Songs");
			System.out.println("3.Sad Songs");
			
			System.out.println("Choose your Opinion");
			int Menu = Scan.nextInt();

			if(Menu==1)
			{
				System.out.println("Oru Kili Uruguthu");
				System.out.println("Kuzhaloondhum kannanukku");
				System.out.println("Ennai Thottu");
				System.out.println("Raja Raja cholan");
			}
			else if(Menu==2)
			{
				System.out.println("Ooravittu Ooruvandhu");
				System.out.println("Nooru Varushm");
				System.out.println("Aasai Nooruvagai");
				System.out.println("Aasai Athigam Vachi");
			}
			else if(Menu==3)
			{
				System.out.println("Kanne Kalaimane");
				System.out.println("Thene Thenpandi Neeye");
				System.out.println("Paadi Partha kili");
				System.out.println("Nilave Vaa");
			}
			else 
			{
				System.out.println("Invaild Songs");
			}
		}
		
		
		else if(Spot==5)
		{
			System.out.println("U1");
			
			
			System.out.println("1.Melody Songs");
			System.out.println("2.Kuthu Songs");
			System.out.println("3.Motivational Songs");
			System.out.println("4.Sad Songs");
			
			System.out.println("Choose your Opinion");
			int Menu = Scan.nextInt();

			if(Menu==1)
			{
				System.out.println("Aathadi Manusuthan");
				System.out.println("Chinna Sirisu");
				System.out.println("Venmegam ");
				System.out.println("Layyayyo");
			}
			else if(Menu==2)
			{
				System.out.println("Machi Open The Battle");
				System.out.println("Sarja Saman Nikalo");
				System.out.println("No Money No Honey");
				System.out.println("Villaiyadu Mangatha");
			}
			else if(Menu==3)
			{
				System.out.println("Ethirthu Nill");
				System.out.println("Oru Nalil");
				System.out.println("Nimirndhu Nil");
				System.out.println("Ungakulle Mirugam");
			}
			else if(Menu==4)
			{
				System.out.println("Kathal Valarthan");
				System.out.println("Yedho Ondru Ennai");
				System.out.println("Pogathe");
				System.out.println("Ninaithu Nianaithu");
			}
			else 
			{
				System.out.println("Invaild Songs");
			}
		}
		 else 
		 {
			 System.out.println("Songs Is Invaild");
		 }
		

	}
}