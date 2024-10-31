package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    @Test
    void checkAdmin(){
        User firstAdmin = new User("Ivan","12345",true);
        firstAdmin.getAdmin();
        assertThat(firstAdmin.admin).isEqualTo(true);
    }

}