import java.util.Arrays;
import java.util.Scanner;

/**
 * 6
 * 1 65 100
 * 2 70 150
 * 3 56 90
 * 4 75 190
 * 5 60 95
 * 6 68 110
 * <p/>
 * 6
 * 1 65 100
 * 2 75 80
 * 3 80 100
 * 4 60 95
 * 5 82 101
 * 6 81 70
 */
class Person implements Comparable<Person> {
    int id;
    int weight;
    int height;

    public Person(int id, int weight, int height) {
        this.id = id;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public int compareTo(Person o) {
        if (this.height > o.height)
            return 1;
        else if (this.height == o.height) {
            if (this.weight > o.weight)
                return 1;
            else if (this.weight < o.weight)
                return -1;
            else
                return 0;
        } else
            return -1;
    }
}

public class Sohu_B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        Person[] persons = new Person[N];
        for (int i = 0; i < N; i++) {
            persons[i] = new Person(cin.nextInt(), cin.nextInt(), cin.nextInt());
        }

        Arrays.sort(persons);

        System.out.println(foo(persons));
    }

    private static int foo(Person[] persons) {
        int k = 1;
        int[] A = new int[persons.length];
        A[0] = persons[0].weight;
        for (int i = 1; i < persons.length; ++i) {
            if (persons[i].weight >= A[k - 1]) {
                A[k++] = persons[i].weight;
            } else {
                int j;
                for (j = k - 1; j >= 0 && A[j] > persons[i].weight; --j)
                    ;
                A[j + 1] = persons[i].weight;
            }
        }
        return k;
    }
}
