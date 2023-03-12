import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("mm:ss");
		
		LocalDateTime time1 = LocalDateTime.now();
		LocalDateTime time2 = time1.plusMinutes(10);
		System.out.println(time1);
		System.out.println(time2);
		
		System.out.println(time1.format(fmt1));
		
		Duration duration = Duration.between(time1, time2);
		
		String returnDuration = (duration.toHours() + "H"
								+ duration.toMinutes() + "m" 
								+ duration.toSeconds() +"s");
		System.out.println(returnDuration);
	}
}
