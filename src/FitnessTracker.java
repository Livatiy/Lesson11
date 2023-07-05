public class FitnessTracker {
    public static void main(String[] args) {
        User user1 = new User("Jay", 5, 5, 1955, "example@example.com", 1423526, "Bill", 80, "120/70", 5000);
        User user2 = new User("Oven", 15, 6, 1975, "example1@example.com", 1477458, "Bill", 80, "120/70", 6000);
        User user3 = new User("Len", 16, 1, 1970, "example2@example.com", 15646365, "Bill", 80, "120/70", 8000);
        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
        user1.setName("Jayson");
        user1.stepsPerDay = 8000;
        user1.printAccountInfo();
        user2.setEmail("e11@example.com");
        user2.weight = 90;
        user2.printAccountInfo();
    }
}
