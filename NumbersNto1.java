import java.util.Scanner;
public class Numbers1toN{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
System.out.print("Enter N: ");
    int N = input.nextInt();
for(int count = N; count >= 1; count--){
    System.out.println(count);
}
}
}

