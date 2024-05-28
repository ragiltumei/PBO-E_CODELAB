import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        while (true) {
            System.out.print("Masukan nama ke " + (i + 1) + ": ");

            try {
                String input = scanner.nextLine().trim();

                if (input.equalsIgnoreCase("selesai")) {
                    break;
                } else if (input.isEmpty()) {
                    throw new IllegalArgumentException("Nama tidak boleh kosong.");
                } else {
                    studentNames.add(input);
                    i++; // Increment only if input is not empty
                }
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
                scanner.nextLine();

            }
        }

        System.out.println("\nDaftar nama mahasiswa:");
        for (String name : studentNames) {
            System.out.println(name);
        }
    }
}