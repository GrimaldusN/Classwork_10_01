import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Lana", "Tom", "Artur", "Linda", "Sara");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Character> characters = Arrays.asList('A', 'B', 'D', 'C');
        System.out.println(filterByLength(strings, 5));
        System.out.println(findFirstStartingWith(strings, 'L'));
        System.out.println(countContainingChar(strings, 'a'));
        System.out.println(String);
        System.out.println(sumOfList(numbers));
        System.out.println(areAllUpperCase(characters));
        System.out.println(reverseList(characters));
    }
    public static List<String> filterByLength(List<String> input, int length){
        return input.stream()
                .filter(el -> el.length() == length)
                .toList();
    }

    public static List<String> toUpperCase(List<String> input){
        return input.stream()
                .map(java.lang.String::toUpperCase)
                .toList();
    }

    public static Optional<String> findFirstStartingWith(List<String> input, char letter){
        return input.stream()
                .map(el -> el.startsWith(java.lang.String.valueOf(letter)))
                .findFirst()
                .toString().describeConstable();

    }

    public static long String; java.lang.String joinByComma(List<String> input){
        return java.lang.String.join(",", input);
    }

    public static long countContainingChar(List<String> input, char ch){
        return input.stream()
                .filter(el -> el.contains(java.lang.String.valueOf(ch)))
                .count();


    }

    public static int sumOfList(List<Integer> input){
        return input.stream()
                .reduce(Integer::sum)
                .get();
    }

    //    7. Задача: Получить список квадратов чисел.
//Сигнатура: List<Integer> getSquares(List<Integer> input);
    public static List<Integer> getSquares(List<Integer> input){
        return input.stream()
                .map(el -> el * el)
                .toList();
    }

    //    Задача: Фильтрация чисел, больших заданного значения.
//Сигнатура: List<Integer> filterGreaterThan(List<Integer> input, int minValue);
    public static List<Integer> filterGreaterThan(List<Integer> input, int minValue){
        return input.stream()
                .filter(el -> el > minValue)
                .toList();
    }

    //    9. Задача: Проверка, содержит ли список заданное число.
//Сигнатура: boolean containsNumber(List<Integer> input, int number);
    public static boolean containsNumber(List<Integer> input, int number){
        return input.contains(number);
    }

    public static Optional<Integer> findMax(List<Integer> input){
        return  input.stream()
                .max(Integer::compareTo);
    }

    public static List<String> convertToStringList(List<Character> input){
        return input.stream()
                .map(java.lang.String::valueOf)
                .toList();
    }

    public static List<Character> filterByAsciiValue(List<Character> input, int ascii){
        return input.stream()
                .filter(el -> el == ascii)
                .toList();
    }

    public static boolean areAllUpperCase(List<Character> input){
        return input.stream()
                .allMatch(el -> Character.isUpperCase(el));

    }

    public static Optional<Character> findFirstDuplicate(List<Character> input){
        Set<Character> characters = new HashSet<>();
        return input.stream()
                .filter(el-> !characters.add(el))
                .findFirst();


    }

    public static List<Character> reverseList(List<Character> input){
        return input.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(), result -> {
                    Collections.reverse(result);
                    return result;
                }));
    }

    public static List<Float> filterLessThan(List<Float> input, float value){
        return input.stream()
                .filter(el -> el > value)
                .toList();
    }

    public static boolean containsNegative(List<Float> input){
        return input.stream()
                .allMatch(el -> el < 0);
    }

    public static List<Integer> roundNumbers(List<Float> input){
        return input.stream()
                .mapToInt(Float::intValue)
                .boxed().toList();
    }

    
}