import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of("We", "don`t", "need", "no", "education", "We", "don`t", "need", "no", "thought", "control"));
    private static final List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
    public static void main(String[] args) {
        task1();
        task2();
       // task3();
       // task4();
    }
        public static void task1() {
            System.out.println("Задание 1");
            for (Integer integer : nums) {
                if (integer % 2 != 0) {
                    System.out.println(integer);
                }
            }
            System.out.println();
        }
    public static void task2() {
        System.out.println("Задание 2");
        Set<Integer> numSet = new TreeSet<>();
        for (Integer integer : nums) {
            if (integer % 2 == 0) {
                numSet.add(integer);
            }
        }
        for (Integer numsSet : numSet) {
            System.out.println(numsSet);
        }
        System.out.println();
    }


    }

