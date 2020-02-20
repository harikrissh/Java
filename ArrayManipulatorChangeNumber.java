import java.util.Scanner;
class ArrayManipulatorChangeNumber
{
    public static int[] changeNumber(int []elements) {
        for (int i=0;i<elements.length;++i) {
            if (elements[i] % 2 == 0) {
                --elements[i];
            }
            else {
                ++elements[i];
            }
        }
        return elements;
    }
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n=s.nextInt();
        System.out.println("Enter " +n+ " elements");
        int[] array=new int[n];
        for (int i=0;i<n; ++i) {
            array[i] = s.nextInt();
        }
        System.out.println("\nAfter changing odd to even and even to odd..\n");
        int[] changedArr=changeNumber(array);
        for (int i: changedArr) {
            System.out.print(i+" ");
        }
    }
}