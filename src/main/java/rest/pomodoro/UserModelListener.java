package rest.pomodoro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

@Component
public class UserModelListener extends AbstractMongoEventListener<User> {
    private UserSeqGenerator userSeqGenerator;

    @Autowired
    public UserModelListener(UserSeqGenerator userSeqGenerator) {
        this.userSeqGenerator = userSeqGenerator;
    }

    @Override
    public void onBeforeConvert(BeforeConvertEvent<User> event){
        if (event.getSource().getId() < 1) {
            event.getSource().setId(userSeqGenerator.generatedSequence(User.SEQ_NAME));
        }
    }
}