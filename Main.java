/**
 * Main
 */
import java.util.Scanner;
public class Main {
    public static int square(int width){
        return width * width;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int width,area;
        System.out.print("enter width: ");
        width = in.nextInt();
        area = square(width);
        System.out.println("Are ( "+width+"x"+width+" ) = "+area);
    }
}