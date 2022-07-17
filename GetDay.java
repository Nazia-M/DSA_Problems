//Get the day if date is given
Java 8
mport java.time.LocalDate;
LocalDate dt = LocalDate.of(year, month, day);
String str = String.valueOf(dt.getDayOfWeek());  // WEDNESDAY
