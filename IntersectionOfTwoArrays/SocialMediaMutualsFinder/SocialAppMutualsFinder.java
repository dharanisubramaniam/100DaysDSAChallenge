import java.util.*;

class User {
    int id;
    String name;

    User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // CRITICAL: HashSet uses these to find duplicates!
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id; // Users are "same" if their IDs match
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return name + " (ID: " + id + ")";
    }
}

public class SocialMediaApp {

    public static Set<User> findMutualFriends(List<User> userAFriends, List<User> userBFriends) {
        // Step 1: Put User A's friends into a Set for O(1) lookup
        HashSet<User> friendSetA = new HashSet<>(userAFriends);
        
        // Step 2: Use another Set to store the intersection
        Set<User> mutuals = new HashSet<>();

        for (User friend : userBFriends) {
            if (friendSetA.contains(friend)) {
                mutuals.add(friend); // Found a common friend!
            }
        }
        return mutuals;
    }

    public static void main(String[] args) {
        // Setup mock data
        User u1 = new User(101, "Alice");
        User u2 = new User(102, "Bob");
        User u3 = new User(103, "Charlie");
        User u4 = new User(104, "David");

        List<User> myFriends = Arrays.asList(u1, u2, u3);
        List<User> yourFriends = Arrays.asList(u2, u3, u4);

        Set<User> common = findMutualFriends(myFriends, yourFriends);

        System.out.println(" Mutual Friends Found: " + common);
    }
}