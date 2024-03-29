package rest.pomodoro;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends MongoRepository < User, String > {
    public List < User > findByFirstname(@Param("name") String firstname);
    public List < User > findByLastname(@Param("lastname") String lastname);
}