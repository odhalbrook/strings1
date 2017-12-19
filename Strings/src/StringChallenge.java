import java.util.Scanner;

public class StringChallenge
	{

		public static void main(String[] args)
			{
				//showChallenge1();
				//showChallenge2();
				showChallenge3();
			}

		private static void showChallenge1()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Tell me something");
				String shout = userInput.nextLine();
				
				shout = shout.toLowerCase();
				System.out.println(shout.substring(0,1).toUpperCase() + shout.substring(1));
				
			}

		private static void showChallenge2()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Tell me something and I will print it up to down");
				String line = userInput.nextLine();
				
				int number = 0;
				number = line.length();
				
				for(int i = 0; i < number; i++)
					{
						System.out.println(line.substring(i, i + 1));
					}
				
			}

		private static void showChallenge3()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Tell me something and I will count the vowels in the phrase");
				String phrase = userInput.nextLine();
				
				int number = 0;
				number = phrase.length();
				
				int counter = 0;
				int counter2 = 0;
				
				for(int i = 0; i < number; i++)
					{
						phrase = phrase.toLowerCase();
						if(phrase.substring(i, i + 1).equals("a") || phrase.substring(i, i + 1).equals("e") || phrase.substring(i, i + 1).equals("i") || phrase.substring(i, i + 1).equals("o") || phrase.substring(i, i + 1).equals("u"))
							{
								counter++;
								
							}
							else
								{
									counter2++;
								}
					}
				
				if(counter > 1)
					{
						System.out.println("There are " + counter + " vowels in that phrase.");
					}
				else
					{
						System.out.println("There is " + counter + " vowel in this phrase.");
					}
			}

	}
