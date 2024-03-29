package rest.pomodoro;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PomodoroApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(PomodoroApplication.class, args);
	}

	@Override
	public void run(String...args) throws Exception {}
}