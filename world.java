import java.util.Scanner;
public class world{
    int mundo[][] = new int [3][4];
    String comando;
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
}