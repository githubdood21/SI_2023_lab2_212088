import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SILab2Test {

    @Test
    void test1() {
        User user = new User("user", "Pass1234", "user@email.com");
        List<User> allUsers = Arrays.asList(
                new User("user1", "Pass5678", "user1@email.com"),
                new User("user2", "Pass9012", "user2@email.com")
        );

        boolean result = SILab2.function(user, allUsers);

        assertEquals(false ,result);
    }

    @Test
    void test2() {
        User user = null;
        List<User> allUsers = Arrays.asList(
                new User("user1", "Pass5678", "user1@email.com"),
                new User("user2", "Pass9012", "user2@email.com")
        );

        RuntimeException exception = assertThrows(RuntimeException.class, () -> SILab2.function(user, allUsers));
        assertEquals("Mandatory information missing!", exception.getMessage());
    }

    @Test
    void test3() {
        User user = new User("user", null, "user@email.com");
        List<User> allUsers = Arrays.asList(
                new User("user1", "Pass5678", "user1@email.com"),
                new User("user2", "Pass9012", "user2@email.com")
        );

        RuntimeException exception = assertThrows(RuntimeException.class, () -> SILab2.function(user, allUsers));
        assertEquals("Mandatory information missing!", exception.getMessage());
    }

    @Test
    void test4() {
        User user = new User("user", "Pass1234", null);
        List<User> allUsers = Arrays.asList(
                new User("user1", "Pass5678", "user1@email.com"),
                new User("user2", "Pass9012", "user2@email.com")
        );

        RuntimeException exception = assertThrows(RuntimeException.class, () -> SILab2.function(user, allUsers));
        assertEquals("Mandatory information missing!", exception.getMessage());
    }

    @Test
    void test5() {
        User user = new User(null, "Pass1234", "user@email.com");
        List<User> allUsers = Arrays.asList(
                new User("user1", "Pass5678", "user1@email.com"),
                new User("user2", "Pass9012", "user2@email.com")
        );

        boolean result = SILab2.function(user, allUsers);

        assertEquals(false,result);
    }

    @Test
    void test6() {
        User user = new User("user", "Pass1234", "user1@email.com");
        List<User> allUsers = Arrays.asList(
                new User("user1", "Pass5678", "user1@email.com"),
                new User("user2", "Pass9012", "user2@email.com")
        );

        boolean result = SILab2.function(user, allUsers);

        assertEquals(false,result);
    }

    @Test
    void test7() {
        User user = new User("user1", "Pass1234", "user@email.com");
        List<User> allUsers = Arrays.asList(
                new User("user1", "Pass5678", "user1@email.com"),
                new User("user2", "Pass9012", "user2@email.com")
        );

        boolean result = SILab2.function(user, allUsers);

        assertEquals(false,result);
    }

    @Test
    void test8() {
        User user = new User("user", "user1234", "user@email.com");
        List<User> allUsers = Arrays.asList(
                new User("user1", "Pass5678", "user1@email.com"),
                new User("user2", "Pass9012", "user2@email.com")
        );

        boolean result = SILab2.function(user, allUsers);

        assertEquals(false,result);
    }

    @Test
    void test9() {
        User user = new User("user", "Pass1", "user@email.com");
        List<User> allUsers = Arrays.asList(
                new User("user1", "Pass5678", "user1@email.com"),
                new User("user2", "Pass9012", "user2@email.com")
        );

        boolean result = SILab2.function(user, allUsers);

        assertEquals(false,result);
    }

    @Test
    void test10() {
        User user = new User("user", "Pass 1234", "user@email.com");
        List<User> allUsers = Arrays.asList(
                new User("user1", "Pass5678", "user1@email.com"),
                new User("user2", "Pass9012", "user2@email.com")
        );

        boolean result = SILab2.function(user, allUsers);

        assertEquals(false,result);
    }

    void test11() {
        User user = new User("user", "Pass1234", "user@email.com");
        List<User> allUsers = new ArrayList<>();

        boolean result = SILab2.function(user, allUsers);

        assertEquals(true,result);
    }

    @Test
    void test12() {
        User user = new User("user", "Pass1234", "user@email.com");
        List<User> allUsers = Arrays.asList(
                new User("user", "Pass5678", "user1@email.com"),
                new User("user2", "Pass9012", "user2@email.com")
        );

        boolean result = SILab2.function(user, allUsers);

        assertEquals(false,result);
    }

    @Test
    void test13() {
        User user = new User("user", "Pass1234", "user@email");
        List<User> allUsers = Arrays.asList(
                new User("user1", "Pass5678", "user1@email.com"),
                new User("user2", "Pass9012", "user2@email.com")
        );

        boolean result = SILab2.function(user, allUsers);

        assertEquals(false,result);
    }

    @Test
    void test14() {
        User user = new User("user", "Pass1234", "user1@email.com");
        List<User> allUsers = Arrays.asList(
                new User("user1", "Pass5678", "user1@email.com"),
                new User("user2", "Pass9012", "user2@email.com")
        );

        boolean result = SILab2.function(user, allUsers);

        assertEquals(false,result);
    }

    @Test
    void test15() {
        User user = new User("user", "Pass1234", "user@email.com");
        List<User> allUsers = Arrays.asList(
                new User("user1", "Pass5678", "user1@email.com"),
                new User("user2", "Pass9012", "user2@email.com")
        );

        boolean result = SILab2.function(user, allUsers);

        assertEquals(false,result);
    }

    @Test
    void test16() {
        User user = new User("user", "user1234!", "user@email.com");
        List<User> allUsers = Arrays.asList(
                new User("user1", "Pass5678", "user1@email.com"),
                new User("user2", "Pass9012", "user2@email.com")
        );

        boolean result = SILab2.function(user, allUsers);

        assertEquals(false,result);
    }

    @Test
    void test17() {
        User user = new User("user", "Pa1!", "user@email.com");
        List<User> allUsers = Arrays.asList(
                new User("user1", "Pass5678", "user1@email.com"),
                new User("user2", "Pass9012", "user2@email.com")
        );

        boolean result = SILab2.function(user, allUsers);

        assertEquals(false,result);
    }
}
