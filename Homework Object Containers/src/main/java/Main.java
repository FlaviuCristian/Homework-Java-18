import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Person person1 = new Person("person1", 10);
        final Person person2 = new Person("person2", 20);

        firstSet(person1, person2);

        Map<Person, List<Hobby>> peopleWithHobbies = new HashMap<>();
        List<Hobby> hobbies = Arrays.asList(new Hobby("cycling", 1, new ArrayList<>()));
        peopleWithHobbies.put(person1, hobbies);
        for (Map.Entry<Person, List<Hobby>> entry : peopleWithHobbies.entrySet()) {
            List<Hobby> hobbyList = entry.getValue();
            for (Hobby hobby : hobbyList) {
                System.out.println(hobby);
            }
        }

        Map<Person, List<Country>> hobbyAddresses = new HashMap<>();
        List<Country> addresses = Arrays.asList(new Country("Romania"));
        hobbyAddresses.put(person1, addresses);
        for (Map.Entry<Person, List<Country>> entry : hobbyAddresses.entrySet()) {
            List<Country> addressList = entry.getValue();
            for (Country country : addressList) {
                System.out.println("Country: " + country.getCountryName());
            }
        }
    }

    private static void firstSet(Person person1, Person person2) {
        Set<Person> set1 = new TreeSet<>(new NameComparator());
        set1.add(person2);
        set1.add(person1);
        for (Person p:set1) {
            System.out.println(p);
        }
    }
}