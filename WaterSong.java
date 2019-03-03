public class WaterSong{
	public static void main(String [] args) {
		int waternum = 9;
		String word = "bottles";
		while (waternum > 0)
		{
			if (waternum == 1)
			{
				word = "bottle";
			}
			System.out.println(waternum + " " + word + "of water on the wall");
			System.out.println(waternum + " " + word + "of water");
			System.out.println("Take one down.");
			System.out.println("pass it around.");
			waternum = waternum - 1;
			if (waternum > 0)
			{
				System.out.println(waternum + " " + word + "of water on the wall");
			}
			else
			{
				System.out.println("no more bottles of water on the wall");
			}


		}
	}
}