package lab9;

import java.util.*;

public class Main {
    public static void main (String [] args){
        // test task 2
        ArrayList<String> arrayListStr = new ArrayList<>();
        arrayListStr.add("one");
        arrayListStr.add("one");
        arrayListStr.add("two");
        arrayListStr.add("three");
        arrayListStr.add("three");
        arrayListStr.add("four");
        System.out.println(arrayListStr);

        HashSet<String> hashSetStr = removeDuplicate(arrayListStr);
        System.out.println(hashSetStr);

        // task 3
       comparePerformList();

        //task 4
        Map<User, Integer> usersPoints = Map.ofEntries(
                Map.entry(new User("Mike"), 12),
                Map.entry(new User("Jon"), 2),
                Map.entry(new User("Kate"), 10),
                Map.entry(new User("Pol"), 6),
                Map.entry(new User("Tim"), 18),
                Map.entry(new User("Sara"), 17),
                Map.entry(new User("Ly"), 1),
                Map.entry(new User("Bob"), 11)
        );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = scanner.next();
        int points = getPoints(usersPoints, name);

        if (points != -1) {
            System.out.printf("%s : %d points \n", name, points);
        } else {
            System.out.print("User not found\n");
        }

    }

    public static <T> HashSet<T> removeDuplicate(Collection<T> collection) {
        return new HashSet<>(collection);
    }

    public static void comparePerformList() {
        ArrayList<Integer> arrayListInteger = new ArrayList<>();
        LinkedList<Integer> linkedListInteger = new LinkedList<>();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000_000; i++) {
            arrayListInteger.add((int) (Math.random() * 1000_000));
        }
        System.out.println("ArrayList time ADD : " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000_000; i++) {
            linkedListInteger.add((int) (Math.random() * 1000_000));
        }
        System.out.println("ArrayList time ADD : " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            arrayListInteger.get((int) (Math.random() * 1000_000));
        }
        System.out.println("ArrayList time GET : " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            linkedListInteger.get((int) (Math.random() * 1000_000));
        }
        System.out.println("LinkedList time GET: " + (System.currentTimeMillis() - startTime));
    }

    public static int getPoints(Map<User, Integer> mapUsersPoints, String name) {
        return mapUsersPoints.getOrDefault(new User(name), -1);
    }




}
