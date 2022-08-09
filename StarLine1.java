public class StarLine1 {
    public static void main(String[] args) {
        int input = 10;
        StarLine1.structure(input);
    }

    public static void structure(int input) {
        for (int i = 0; i < input; i++) {
            for (int j =  1; j < i + 1; j++) {
                System.out.print(" ");
            }
            System.out.print("* ");
            System.out.println();
        }
    }
}