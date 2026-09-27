public class ProductOfIntegers{
public static void main(String[] args){
    int count = 1;
    int product = 1;
while(count <= 10){
    product *= count;
    count++;
}
System.out.println("Product is " + product);
}
}
