package rest.pomodoro;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    public User findById(long id);
    public List<User> findByFirstname(String firstname);
    
}