package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    @Test
    void checkAdmin(){

        UserRepository userRepository = new UserRepository();
        User firstUser = new User("Ivan","12345",false);
        userRepository.logOut();
        assertThat(firstUser.login).isEqualTo(false);
    }

}