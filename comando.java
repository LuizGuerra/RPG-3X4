import java.util.Scanner;
import java.util.Random;
public class comando{
    int mundo[][] = new int [3][4];
    String comando;
    public comando(createHero nHeroi){}
    public void novoComando(){
        Scanner in = new Scanner(System.in);
        System.out.println("Você deseja ir para onde agora?");
        System.out.print("Norte = n\nSul = s\nLeste = l\nOeste = o");
        System.out.print("[Comandos possíveis: n/s/l/o]" );
        comando=in.next();
        comando=comando.toLowerCase();
        while(!comando.equals("n") && !comando.equals("s") && !comando.equals("l") && !comando.equals("o")){
            System.out.println("Desculpa, não consegui entender o comando. Poderia repetir por favor?");
            System.out.print("[Comandos possíveis: n/s/l/o]" );
            comando=in.next();
            comando=comando.toLowerCase();
        }
    }
    public void movement(String comando){
        if(comando.equals("n")){
            
        }
        else if(comando.equals("s")){
            
        }
        else if(comando.equals("l")){
            
        }
        else if(comando.equals("o")){
            
        }
    }
    public int rolld20(){
        Random rand = new Random();
        return (rand.nextInt(20)+1);
    }
    // ataque, defesa, velocidade, destreza, vitalidade, sabedoria, carisma, percepcao, vida
    public int ataque(createHero nHero){
        Random rand = new Random();
        return (rand.nextInt(nHero.getIntStatus()[0])+1);
    }
    public int defesa(createHero nHero){
        Random rand = new Random();
        return (rand.nextInt(nHero.getIntStatus()[1])+1);
    }
    public int destreza(createHero nHero){
        Random rand = new Random();
        return (rand.nextInt(nHero.getIntStatus()[2])+1);
    }
    public int vitalidade(createHero nHero){
        Random rand = new Random();
        return (rand.nextInt(nHero.getIntStatus()[3])+1);
    }
    public int sabedoria(createHero nHero){
        Random rand = new Random();
        return (rand.nextInt(nHero.getIntStatus()[4])+1);
    }
    public int carisma(createHero nHero){
        Random rand = new Random();
        return (rand.nextInt(nHero.getIntStatus()[5])+1);
    }
    public int percepcao(createHero nHero){
        Random rand = new Random();
        return (rand.nextInt(nHero.getIntStatus()[6])+1);
    }
}