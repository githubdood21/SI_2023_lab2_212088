import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SILab2Test {
    @Test
    public void test1()
    {
        User user = null;
        List<User> allUsers = Arrays.asList(
                new User("user2", "pass123", "user2@example.com"),
                new User("user3", "test123", "user3@example.com")
        );

        boolean result = SILab2.function(user, allUsers);

        assertEquals("Mandatory information missing!", result);
    }
    @Test
    public void test2()
    {
        User user = new User(null, "password123", "user@example.com");
        List<User> allUsers = new ArrayList<>();

        SILab2.function(user, allUsers);

        assertEquals("user@example.com", user.getUsername());
    }
    @Test
    public void test3()
    {
        User user = new User("username1", "password123", "user@example.com");
        List<User> allUsers = Arrays.asList(
                new User("username2", "password456", "user2@example.com"),
                new User("username3", "password789", "user@example.com")
        );

        boolean result = SILab2.function(user, allUsers);

        assertEquals(false, result);
    }
    @Test
    public void test4()
    {
        User user = new User("username1", "password123", "user@example.com");
        List<User> allUsers = Arrays.asList(
                new User("username1", "password123", "user1@example.com"),
                new User("user2", "password123", "user2@example.com")
        );

        boolean result = SILab2.function(user, allUsers);

        assertEquals(false, result);
    }
    @Test
    public void test5()
    {
        User user = new User("username1", "password123", "user@example.com");
        List<User> allUsers = Arrays.asList(
                new User("user1", "password123", "user1@example.com"),
                new User("user2", "password123", "user2@example.com")
        );

        boolean result = SILab2.function(user, allUsers);

        assertEquals(false , result);
    }
    @Test
    public void test6()
    {
        User user = new User("username1", "password123", "user@example.com");
        List<User> allUsers = new ArrayList<>();

        boolean result = SILab2.function(user, allUsers);

        assertEquals(false ,result);
    }
    @Test
    public void test7()
    {
        User user = new User("username1", "pass123", "user@example.com");
        List<User> allUsers = new ArrayList<>();

        boolean result = SILab2.function(user, allUsers);

        assertEquals(false ,result);
    }
    @Test
    public void test8()
    {
        User user = new User("username1", "password 123", "user@example.com");
        List<User> allUsers = new ArrayList<>();

        boolean result = SILab2.function(user, allUsers);

        assertEquals(false ,result);
    }
    @Test
    public void test9()
    {
        User user = new User("username1", "p@ssw0rd123", "user@example.com");
        List<User> allUsers = Arrays.asList(
                new User("user1", "password1", "user1@example.com"),
                new User("user2", "password2", "user2@example.com")
        );

        boolean result = SILab2.function(user, allUsers);

        assertEquals(true ,result);
    }
    @Test
    public void test10()
    {
        User user = new User("username1", "p@ssw0rd123", "user@example.com");
        List<User> allUsers = Arrays.asList(
                new User("user1", "password1", "user1@example.com"),
                new User("user2", "password2", "user@example.com")
        );

        boolean result = SILab2.function(user, allUsers);

        assertEquals(false ,result);
    }
}
