package rest.pomodoro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PomodoroApplication implements CommandLineRunner {

	@Autowired
	private UserRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(PomodoroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();
		User mk = new User();
		mk.setFirstname("Mikaz");
		mk.setLastname("Titarat");
		mk.setScore(0);
		repository.save(mk);
		repository.save(new User("Mikaz","Spare",2000));

		for (User user : repository.findAll()) {
			System.out.println(user);
		}
		System.out.println();

		for (User user : repository.findByFirstname("Mikaz")){
			System.out.println(user);
		}
	}
}
