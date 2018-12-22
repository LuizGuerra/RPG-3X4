import java.util.Random;
public class aham{
    public static void main(String args[]){
        Random ran = new Random();
        System.out.print("\f");
        int [] vet = new int [10];
        
        for(int i = 0; i<vet.length; i++){
            vet[i]=ran.nextInt(10);
        }
        for(int i = 0; i<vet.length; i++){
            if(i==0){
                System.out.print(vet[i]);
            } else {
                System.out.print(", " + vet[i]);
            }            
        }
        System.out.println("\n\n// // // // // // // // //\n\n");
        vet = trying.makeitbetter(vet);
        for(int i = 0; i<vet.length; i++){
            if(i==0){
                System.out.print(vet[i]);
            } else {
                System.out.print(", " + vet[i]);
            }            
        }
    }
}