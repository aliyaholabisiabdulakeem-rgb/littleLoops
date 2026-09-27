
public class AsciiAToZ{
    public static void main(String[] args){
        char letter = 'A';
        for(int count = 65; count <= 90; count++){
            System.out.print(letter);
            System.out.print(" = ");
            System.out.println(count);
            letter++;
        }
    }
}
