package day41;

public class Q79 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // ABCD

            if (arr[i].equals("D")) {
                System.out.print("Work Done");  // Work Done
                break;
            }
            continue; // skips the remaining code after this point
        }
    }
}
