import java.io.StringWriter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {

            List<Car> carList = new ArrayList<>();
            carList.add(new Car("Dacia", "red"));
            carList.add(new Car("Mazda", "black"));
            carList.add(new Car("Tesla", "white"));
            carList.add(new Car("Mitsubishi", "green"));
            carList.add(new Car("Maserati", "grey"));

            System.out.println("All car brand are: ");

            carList.forEach(System.out :: println);


            System.out.println("Brand list containing the letter \"a\" and start with \"M\" is: ");
            carList.stream()
                    .filter(car -> car.getBrand().startsWith("M"))
                    .filter(car -> car.getBrand().contains("a"))
                    .forEach(System.out :: println);

    findTheMin();
    randomNumber();
    mapOfElement();
    OptionalExample();
    fastestWay();

    }


    private static void findTheMin() {

        Optional<Integer> min = Stream.of(1, 2, 3, 4, 5, 6)
                .min(Comparator.comparing(Integer :: valueOf));

        System.out.println("The min. number from the stream is: " + min.get());
    }

    private static void randomNumber() {

        IntStream range = IntStream.rangeClosed(1,10);
        ArrayList<Integer> randomNumbers =  new ArrayList<>();

        range.forEach(i -> randomNumbers.add(new Integer(i)) );

        Collections.shuffle(randomNumbers);
        System.out.println("The random numbers are: " + randomNumbers);
        long count = randomNumbers.stream()
                .count();

        System.out.println("The total number of the elements are: " + count);

    }

    private static void mapOfElement() {


        Map<String,Integer> elements = new HashMap<>();

            elements.put("elemnet 1 ", 21);
            elements.put("elemnet 2 ", 5);
            elements.put("element 3 ", 9);
            elements.put("elemnet 4 ", 12);
            elements.put("elemnet 5 ", 15);
            elements.put("elemnet 6 ", 20);

            List ListOfValue = new ArrayList<>(elements.values())
                    .stream()
                    .filter(i -> i > 10)
                    .collect(Collectors.toList());

        System.out.println("The value over 10 of Map are: " + ListOfValue);


        Collections.sort(ListOfValue, Collections.reverseOrder());
        Set<String> reversOrder = new LinkedHashSet<>(ListOfValue);

        System.out.println("Revers order: " + reversOrder);




        reversOrder.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println("Sort natural order: " + reversOrder);

    }

    private static void OptionalExample() {

        //Creating Optional object
        Optional<String> movie = Optional.of("Action");
        String answer1 = "YES";
        String answer2 = null;

        System.out.println("Non empty Optional: " + movie);


        if (movie.isPresent()) {
            System.out.println("Watching movie 1: " + movie.get());
        } else {
            System.out.println("No movie");
        }

        movie.ifPresent(value -> System.out.println("Watching movie 2: " + movie.get()));
    }

    private static void fastestWay() {


    }
}
