import java.util.Random;
public class asdas{
    public static void main(String args[]){
        Random ran = new Random();
        System.out.print("\f");
        int [] vet = new int [10];
        for(int i = 0; i<10; i++){
            vet[i]=ran.nextInt(100);
        }
        for(int item : vet){
            System.out.println(item);
        }
    }
}