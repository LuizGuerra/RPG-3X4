public class game{
    public static void main (String args[]){
        titulo();
        
        System.out.println("Primeiro, vamos criar seu/sua personagem!\n");
        
        createHero nHero = new createHero();
        
        experience kill = new experience();
        
        nHero.sexoDoPersonagem();
        
        nHero.nomeDoPersonagem();
        
        nHero.classeDoPersonagem();
        
        System.out.print("\f");
        ficha(nHero);
        
        firstHistory primeiraH = new firstHistory();
        
        primeiraH.partOne(nHero, kill);
        
        nHero.lvlUp();
        if(nHero.getVida()>0){
            System.out.print("\f");
            ficha(nHero);
        }
    }
    public static void titulo(){
        System.out.println("\f============================================================================\n\n\n");
        System.out.println("\t\tSeja bem vindo para o jogo QUICK RPG!");
        System.out.println("\n\n\n============================================================================\n\n\n");
        System.out.println("O jogo consiste em um mapa 4x3, sinta-se livre para desenhar o mapa enquanto joga.");
        System.out.println("\n\n\n============================================================================\n\n\n");
    }
    public static void ficha(createHero nHero){
        experience batata = new experience();
        System.out.println("============================================================================");
        System.out.println("============================================================================");
        System.out.println("Ficha do jogador:\n");
        System.out.println("Nome d"+nHero.sexo_o()+" "+nHero.sexo_heroi()+": "+nHero.getNome());
        System.out.println("Classe escolhida: "+nHero.getClasse());
        System.out.println("Nível: "+batata.getLvl()+"\n");
        for(int i=0; i<7; i++){
            System.out.println(nHero.getStatus()[i]);
        }
        System.out.println(nHero.vidaDP());
        System.out.println("============================================================================");
        System.out.println("============================================================================");
    }
}