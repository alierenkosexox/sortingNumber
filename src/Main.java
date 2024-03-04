
// Ali Eren KÖSE


// gerekli olan utilleri çağır
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Verileri tanımla
        Scanner input = new Scanner(System.in);
        int n, elements;

        // Verilerin karşılığı için dizi uzunuluğu ve elemanları sor
        System.out.print("Please enter array's length: ");
        n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter array's elements: ");

        // Dizi uzunluğı kadar eleman sorusu tekrar et ve diziye kaydet
        for (int index = 1; index <= n; index++){
            System.out.print(index + ". Element : ");
            elements = input.nextInt();
            arr[index-1] = elements;
        }

        // sayıları sırala ve sonucu yazdır
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}