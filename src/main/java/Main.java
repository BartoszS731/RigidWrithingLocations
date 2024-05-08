// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {
        // Tworzenie tablicy liczb całkowitych
        int[] numbers = new int[5];

        // Przypisanie wartości do tablicy
        numbers[0] = 10;
        numbers[1] = 0;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Wyświetlenie zawartości tablicy
        System.out.println("Elementy tablicy:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + i + ": " + numbers[i]);
        }
    }
}
