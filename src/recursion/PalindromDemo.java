package recursion;
import info1.*;
import java.io.Console;

public class PalindromDemo {

	{
		System.out.print("Geben Sie einen Satz ein, der auf Palindrom gepüft werden soll: ");
		String satz = "rentner";
		if (istPalindrom(satz))
		{
			System.out.println(satz + " ist ein Palindrom!");
		}
		else
		{
			System.out.println(satz + " ist kein Palindrom!");
		}
	}
}
