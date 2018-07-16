public class game{
    public static void main (String args[]){
        titulo();
        
        System.out.println("Primeiro, vamos criar seu personagem!\n");
        
        createHero nHero = new createHero();
        
        nHero.sexoDoPersonagem();
        
        nHero.nomeDoPersonagem();
        
        nHero.classeDoPersonagem();
        
        System.out.println("\nOs status do "+nHero.getNome()+" são:\n");
        for(int i=0; i<8; i++){
            System.out.println(nHero.getStatus()[i]);
        }
    }
    public static void titulo(){
        System.out.println("\f============================================================================\n\n\n");
        System.out.println("\t\tSeja bem vindo para o jogo QUICK RPG!");
        System.out.println("\n\n\n============================================================================\n\n\n");
        System.out.println("O jogo consiste em um mapa 4x3, sinta-se livre para desenhar o mapa enquanto joga.");
        System.out.println("\n\n\n============================================================================\n\n\n");
    }
}