package java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class dateTimeAPI 
{
	void meth1()
	{
		for(String s:ZoneId.getAvailableZoneIds())
			System.out.println();
	}

	public static void main(String[] args) 
	{
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());
		System.out.println(LocalTime.now(ZoneId.of("US/Hawaii")));
		new dateTimeAPI().meth1();

	}

}
