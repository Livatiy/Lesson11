public class User {
    private String name;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String email;
    private long phone;
    String surname;
    int weight;
    String pressure;
    int stepsPerDay;
    private int age;

    public User(String name, int dayOfBirth, int monthOfBirth, int yearOfBirth, String email, long phone, String surname, int weight, String pressure, int stepsPerDay) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsPerDay = stepsPerDay;
        age = 2020 - yearOfBirth;
    }

    public int getAge() {
        return age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    void setEmail(String email) {
        this.email = email;
    }

    void setPhone(long phone) {
        this.phone = phone;
    }

    void printAccountInfo() {
        System.out.println("Ім'я: " + name + ", Дата народження: " + dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth + ", Вік: " + age + ", E-mail: " + email + ", Телефон: " + phone + ", Прізвище: " + surname + ", Вага: " + weight + ", Тиск: " + pressure + ", Шаги за день: " + stepsPerDay);
    }

}
