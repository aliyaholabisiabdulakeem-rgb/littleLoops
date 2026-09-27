import java.util.Scanner;
public class Numbers1toN{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
System.out.print("Enter N: ");
    int N = input.nextInt();
for(int count = 1; count <= N; count++){
    System.out.println(count);
}
}
}
