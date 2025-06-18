package sfddzf;

import java.time.*;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;;

public class DateTimeAPIDemo 
{
	public static void main(String[] args)
	{
		LocalDate l=LocalDate.of(2025, 06, 10);
		System.out.println(l);
		LocalTime l1=LocalTime.now();
		System.out.println(l1);
		LocalTime l2=LocalTime.now();
		System.out.println(l2);
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.MIN);
		LocalDateTime l3=LocalDateTime.now();
		System.out.println(l3);
		DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-mm-yyyy ");
		System.out.println(f);
		ZonedDateTime c=ZonedDateTime.now();
		System.out.println(c);
		System.out.println(c.getHour());
		System.out.println(c.getMinute());
		System.out.println(c.getSecond());
		System.out.println(c.getYear());
		System.out.println(c.getDayOfMonth());
		}
}
