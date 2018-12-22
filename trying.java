public class trying{
    public static int [] makeitbetter(int [] vet){
        int cont = vet.length-1;
        int x = 0;
        for(int i : vet){
            if(i%2==0){
                x++;
            }
        }
        for(int i = 0; i<x; i++){
            int aux;            
            if(vet[i]%2!=0 || vet[i] == 0){
                while(vet[cont]%2 != 0){
                    cont--;
                }
                aux=vet[i];
                vet[i]=vet[cont];
                vet[cont]=aux;
            }
        }
        return vet;
    }
}