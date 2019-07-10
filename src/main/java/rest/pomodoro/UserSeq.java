package rest.pomodoro;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = UserSeq.USER_SEQUENCES)
public class UserSeq {
    static final String USER_SEQUENCES = "User_sequences";
    
    @Id
    private String id;
    private long seq;

    public UserSeq() {
    }

    public UserSeq(String id, long seq) {
        this.id = id;
        this.seq = seq;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getSeq() {
        return this.seq;
    }

    public void setSeq(long seq) {
        this.seq = seq;
    }

}