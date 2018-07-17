import java.util.Scanner;
public class firstHistory{
    public void partOne(createHero nHero){
        Scanner in = new Scanner(System.in);
        
        System.out.println("\n\n[Você chega em uma vila, esperando prosperidade, um lugar feliz e colorido]");
        System.out.println("[Fora chamado para realizar um trabalho. Ha! Nada que eu, "+nHero.getNome()+", não consiga resolver!]");
        System.out.println("[Seus primeiros passos dentro da cidade são... desesperadores.]\n\n");
        System.out.println("*um cidadão lhe enxerga e já começa a falar*\n");
        System.out.println("Cidadão:AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHHHHHHHHHHHHHHHHHH");
        //System.out.println(); Eftychía
        System.out.println("\tPor favor! Nos ajude! Precisamos de sua ajuda " + nHero.getNome());
        System.out.println("\n\n[De repente, surgem 3 goblins da floresta ao lado]\n\n");
        System.out.println("Goblin gordo: AAAH OURO ESSE HUMANO TEM OURO, EU CONSIGO FAREJAR! ME DÊ ESSE OURO, SEU LIXO HUMANO!");
        System.out.println("Cidadão: Não! Por favor herói! Nos ajude!!");        
        System.out.print("\n||| Você escolhe ajudar [digite \"s\"]/ Você escolhe não ajudar [digite \"n\"]|||");
        String escolha = in.next();
        while (!escolha.equals("n") && !escolha.equals("s")){
            System.out.print("Comando invalido. Por favor, digite [s] ou [n]: ");
            escolha = in.next();
        }
        if(escolha.equals("n")){
            System.out.println("\n\n[Ouch... Tu não pode fazer isso. (Não ainda). Que feio em? Abandonando alguém em necessidade...]");
            System.out.println("[Mudei sua resposta para sim. Mas vai ser só dessa vez, tá? Afinal, essa é a introdução! :D]\n\n");
        }
        System.out.println("[Existem 3 goblins na sua frente. O Gobling Gordo, o Gobling Esquelético e o Goblin Atleta]");
        System.out.println("Você escolhe: [1][2][3][4][5][6]");
        System.out.println("[1] - Atacar um goblin.");
        System.out.println("[2] - Defender o primeiro ataque dos goblins.");
        System.out.println("[3] - Correr ao redor deles.");
        System.out.println("[4] - Se preparar para realizar um contra-ataque.");
        System.out.println("[5] - Tenta convencer os goblins a não fazerem nada.");
        System.out.println("[6] - Fazer um teste de percepção.");
        System.out.println("\n\nTu n pode escolher nada ainda... desculpa quem tá jogando a versão incompleta do jogo.\nÉ aqui onde parei! xD");
    }
    //firstHistory
}