public class SquareNum {
    public static int getSquare(int num) {
        return num*2;
    }

    public static void main(String[] args) {
        System.out.println(getSquare(Integer.parseInt(args[0])));
    }
}
