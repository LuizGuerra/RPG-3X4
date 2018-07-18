import java.util.Scanner;
public class firstHistory{
    Scanner in = new Scanner(System.in);
    int soma, contCA=0, vidaGA=10;
    boolean goblinEsq=true, goblinGor=true, goblinAtl=true;
    int turno=0;
    boolean alive=true, persu=false;
    public void partOne(createHero nHero, experience kill){
        System.out.println("\n\n[Você chega em uma vila, esperando prosperidade, um lugar feliz e colorido]");
        System.out.println("[Fora chamado para realizar um trabalho. Ha! Nada que eu, "+nHero.getNome()+", não consiga resolver!]");
        System.out.println("[Seus primeiros passos dentro da cidade são... desesperadores.]\n");
        System.out.println("*um cidadão lhe enxerga e já começa a falar*\n");
        System.out.println("Cidadão:AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHHHHHHHHHHHHHHHHHH");
        //System.out.println(); Eftychía
        System.out.println("\tPor favor! Nos ajude! Precisamos de sua ajuda, " + nHero.getNome()+"!");
        System.out.println("\n[De repente, surgem 3 goblins da floresta ao lado]\n");
        System.out.println("Goblin gordo: AAAH OURO ESSE HUMANO TEM OURO, EU CONSIGO FAREJAR! ME DÊ ESSE OURO, SEU LIXO HUMANO!");
        System.out.println("Cidadão: Não! Por favor herói! Nos ajude!!");        
        System.out.print("\n||| Você escolhe ajudar [digite \"s\"]/ Você escolhe não ajudar [digite \"n\"]|||");
        String escolha = in.next(); 
        System.out.println("\n============================================================================\n");
        while (!escolha.equals("n") && !escolha.equals("s")){            
            System.out.print("{Comando invalido. Por favor, digite [s] ou [n]:} ");
            escolha = in.next();
        }
        if(escolha.equals("n")){
            System.out.println("[Ouch... Tu não pode fazer isso. (Não ainda). Que feio em? Abandonando alguém em necessidade...]");
            System.out.println("[Mudei sua resposta para sim. Mas vai ser só dessa vez, tá? Afinal, essa é a introdução! :D]");
        }
        System.out.println("\n[Existem 3 goblins na sua frente. O Gobling Gordo, o Gobling Esquelético e o Goblin Atleta]");
        System.out.println("Você escolhe: [1][2][3][4][5]");
        System.out.println("[1] - Atacar um goblin.");
        System.out.println("[2] - Defender o primeiro ataque dos goblins.");
        System.out.println("[3] - Se preparar para realizar um contra-ataque.");
        System.out.println("[4] - Tenta convencer os goblins a não fazerem nada.");
        System.out.println("[5] - Fazer um teste de percepção.\n");
        String resposta = in.next();
        System.out.println("\n============================================================================\n");
        while(
        !resposta.equals("1") && !resposta.equals("2") && !resposta.equals("3") &&
        !resposta.equals("4") && !resposta.equals("5")){
            System.out.println("\n{Escolha inválida. Por favor, tente novamente!} ");
            resposta = in.next();
        }
        if(resposta.equals("1")){
            escolha1(nHero, kill);
        }
        else if(resposta.equals("2")){
            escolha3(nHero);
        }
        else if(resposta.equals("3")){
            escolha3(nHero);
        }
        else if(resposta.equals("4")){
            escolha4(nHero, kill);
        }
        else if(resposta.equals("5")){
            escolha5(nHero);
        }
        if(persu==false){
            while(goblinEsq==true || goblinGor==true || goblinAtl==true){
                if(persu==false){
                    goblinsAtacam(nHero, kill);
                    if(nHero.getVida()<=0){
                        System.out.println("[===VOCÊ MORREU===]");
                        alive = false;
                        break;
                    }
                    System.out.println("\n============================================================================\n");
                    jogador(nHero, kill);
                }
            }
        }
        if(alive==true){
            System.out.println("\n============================================================================\n");
            System.out.println("[Parabéns! Você subiu de nível! Digite qualquer coisa para receber seus novos status!]");
            String qualquercoisa = in.next();
        }
    }
    public void jogador(createHero nHero, experience kill){
        System.out.println("\nVocê escolhe: [1][2][3][4][5]");
        System.out.println("[1] - Atacar um goblin.");
        System.out.println("[2] - Defender o primeiro ataque dos goblins.");
        System.out.println("[3] - Se preparar para realizar um contra-ataque.");
        System.out.println("[4] - Tenta convencer os goblins a não fazerem nada.");
        System.out.println("[5] - Fazer um teste de percepção.\n");
        String resposta = in.next();
        while(
        !resposta.equals("1") && !resposta.equals("2") && !resposta.equals("3") &&
        !resposta.equals("4") && !resposta.equals("5")){
            System.out.println("\n{Escolha inválida. Por favor, tente novamente!} ");
            resposta = in.next();
        }
        if(resposta.equals("1")){
            escolha1(nHero, kill);
        }
        else if(resposta.equals("2")){
            escolha3(nHero);
        }
        else if(resposta.equals("3")){
            escolha3(nHero);
        }
        else if(resposta.equals("4")){
            escolha4(nHero, kill);
        }
        else if(resposta.equals("5")){
            escolha5(nHero);
        }
    }
    public void goblinsAtacam(createHero nHero, experience kill){
        comando batata = new comando(nHero);
        if(goblinEsq==true){
            System.out.println("\n[Goblin Esquelético vai atacar!]");
            int x= batata.rolld20()+1;
            if(x<10){
                System.out.println("[Goblin Esquelético tropeça, e cai de cabeça no chão. Você percebe que ele já estava bem machucado]");
                System.out.println("[Goblin Esquelético não levanta mais. Ele morreu. Lol.]");
                goblinEsq=false;
                kill.killMonster(nHero);
            }
            else if(x<15){
                System.out.println("[Goblin Esquelético tenta dar seu melhor, mas ele está muito mal e só consegue dar 1 de dano.]");
                if(contCA==1){
                    System.out.println("[Contudo, você mitiga o dano.]");
                    contCA=0;               
                }
                else if(contCA==2){
                    System.out.println("[Contudo, você devolve o dano.]");
                    kill.killMonster(nHero);
                    goblinEsq=false;
                    contCA=0;
                }
                else{
                    nHero.addVida(-1);
                }
                System.out.println("[Você tem "+nHero.getVida()+" pontos de vida.]");
            }
            else{
                System.out.println("[Goblin Esquelético tenta dar seu melhor, mesmo estando mal, consegue dar 2 de dano.]");
                if(contCA==1){
                    System.out.println("[Contudo, você mitiga o dano.]"); 
                    contCA=0;
                }
                else if(contCA==2){
                    System.out.println("[Contudo, você devolve o dano.]");
                    kill.killMonster(nHero);
                    goblinEsq=false;
                    contCA=0;
                }
                else{
                    nHero.addVida(-2);
                }
                System.out.println("[Você tem "+nHero.getVida()+" pontos de vida.]");
            }
        }
        if(goblinGor==true){
            System.out.println("\n[Goblin Gordo vai atacar!]");
            int x= batata.rolld20()+1;
            if(x==1){
                System.out.println("[Goblin Gordo tropeça, e cai de cabeça no chão. Você percebe que ele já estava bem machucado]");
                System.out.println("[Goblin Gordo não levanta mais. Ele morreu. Lol.]");
                goblinEsq=false;
                kill.killMonster(nHero);
            }
            else if(x<10){
                System.out.println("[Goblin Gordo tenta dar seu melhor, mas ele mal consegue se mover e só consegue dar 1 de dano.]");
                if(contCA==1){
                    System.out.println("[Contudo, você mitiga o dano.]");
                    contCA=0;
                }
                else if(contCA==2){
                    System.out.println("[Contudo, você devolve o dano.]");
                    kill.killMonster(nHero);
                    goblinGor=false;
                    contCA=0;
                }
                else{
                    nHero.addVida(-1);
                }
                System.out.println("[Você tem "+nHero.getVida()+" pontos de vida.]");
            }
            else{
                System.out.println("[Goblin Gordo tenta dar seu melhor, mas ele mal consgue se mover e só consegue dar 2 de dano.]");
                if(contCA==1){
                    System.out.println("[Contudo, você mitiga o dano.]");        
                    contCA=0;
                }
                else if(contCA==2){
                    System.out.println("[Contudo, você devolve o dano.]");
                    kill.killMonster(nHero);
                    goblinGor=false;
                    contCA=0;
                }
                else{
                    nHero.addVida(-2);
                }
                System.out.println("[Você tem agora "+nHero.getVida()+" pontos de vida.]");
            }
        }
        if(goblinAtl==true){
            System.out.println("\n[Goblin Atlético vai atacar!]");
            int x = batata.rolld20()+1;
            if(x==1){
                System.out.println("[Goblin Atlético tropeça, e cai de cabeça no chão. Você percebe que ele já estava bem machucado]");
                System.out.println("[Goblin Atlético não levanta mais. Ele morreu. Lol.]");
                goblinEsq=false;
                kill.killMonster(nHero);
            }
            else if(x<13){
                System.out.println("[Goblin Atlético tenta dar seu melhor, mas ele está mal e só consegue dar 1 de dano.]");
                if(contCA==1){
                    System.out.println("[Contudo, você mitiga o dano.]");                
                }
                else if(contCA==2){
                    System.out.println("[Contudo, você devolve o dano.]");
                    kill.killMonster(nHero);
                    goblinAtl=false;
                }
                else{
                    nHero.addVida(-1);
                }
                System.out.println("[Você tem "+nHero.getVida()+" pontos de vida.]");
            }
            else{
                System.out.println("[Goblin Atlético dá seu melhor e consegue dar 3 de dano.]");
                if(contCA==1){
                    System.out.println("[Contudo, você mitiga o dano.]");                
                }
                else if(contCA==2){
                    System.out.println("[Contudo, você devolve o dano.]");
                    kill.killMonster(nHero);
                    goblinAtl=false;
                }
                else{
                    nHero.addVida(-3);
                }
                System.out.println("[Você tem "+nHero.getVida()+" pontos de vida.]");
            }
        }
    }
    public void escolha1(createHero nHero, experience kill){
        comando batata = new comando(nHero);
        System.out.println("[A batalha é de você contra 3. Cada um terá um turno. O primeiro turno será seu, já que você teve a iniciativa]");
        System.out.println("\n[Você escolhe atacar um goblin. Qual goblin deseja atacar?]");
        if(goblinEsq==true){
            System.out.println("[ [1] Goblin Esquelético]");
        }
        if(goblinGor==true){
            System.out.println("[ [2] Goblin Gordo]");
        }
        if(goblinAtl==true){
            System.out.println("[ [3] Goblin Atleta]");
        }
        String escolha = in.next();
        while(!escolha.equals("1") && !escolha.equals("2") && !escolha.equals("3")){
            System.out.println("[Comando não entendido. Por favor, tente novamente.] ");
        }
        if(escolha.equals("1")){
            esc1X1(nHero, batata, kill);
        }
        else if(escolha.equals("2")){
            esc1X2(nHero, batata, kill);
        }
        else if(escolha.equals("3")){
            esc1X3(nHero, batata, kill);
        }
    }
    private void turnos(){
        turno++;
        if(turno==5){turno=0;}
    }
    public void esc1X1(createHero nHero, comando batata, experience kill){
        System.out.println("\n[Você escolheu atacar o Goblin Esquelético.]");
        int x=batata.rolld20();
        System.out.println("[d20 rodado: você tirou "+x+"/7]");
        if(x==1){
            System.out.println("\n[Você errou. Feio. Quando fora atacar, você tropeçou e se atacou, levando 1 de dano]");
            nHero.addVida(-1);
            System.out.println("[Vida atual: "+nHero.getVida()+"]\n");
        }
        else if(x<5){
            System.out.println("[Você errou o ataque.]");
        }
        else if(x<19){
            System.out.println("[Você acertou o ataque, e infligiu "+(x+nHero.getIntStatus()[0])+" de dano.]");
            System.out.println("[Você matou o Goblin Esquelético.]");
            goblinEsq=false;
            kill.killMonster(nHero);
        }
        else{
            System.out.println("[Você acertou o ataque, explodindo a cabeça do goblin, infligindo"+(x+nHero.getIntStatus()[0])+" de dano]");
            System.out.println("[Você matou o Goblin Esquelético.]");
            goblinEsq=false;
            kill.killMonster(nHero);
        }
        turnos();
    }
    public void esc1X2(createHero nHero, comando batata, experience kill){
        System.out.println("\n[Você escolheu atacar o Goblin Gordo.");
        int x=batata.rolld20();
        System.out.println("[d20 rodado: você tirou "+x+"/5]");
        if(x==1){
            System.out.println("\n[Você errou. Feio. Quando fora atacar, você tropeçou e se atacou, levando 1 de dano.]");
            nHero.addVida(-1);
            System.out.println("[Vida atual: "+nHero.getVida()+"]\n");
        }
        else if(x<5){
            System.out.println("[Você errou o ataque.]");
        }
        else if(x<19){
            System.out.println("[Você acertou o ataque, e infligiu "+(x+nHero.getIntStatus()[0])+" de dano]");
            System.out.println("[Você matou o Goblin Gordo.]");
            goblinGor=false;
            kill.killMonster(nHero);
        }
        else{
            System.out.println("[Você acertou o ataque, explodindo a cabeça do goblin, infligindo"+(x+nHero.getIntStatus()[0])+" de dano.]");
            System.out.println("[Você matou o Goblin Gordo.]");
            goblinGor=false;
            kill.killMonster(nHero);
        }
        turnos();
    }
    public void esc1X3(createHero nHero, comando batata, experience kill){
        System.out.println("\n[Você escolheu atacar o Goblin Atleta.");
        int x=batata.rolld20();
        System.out.println("[d20 rodado: você tirou "+x+"/5]");
        if(x==1){
            System.out.println("\n[Você errou. Feio. Quando fora atacar, você tropeçou e se atacou, levando 1 de dano.]");
            nHero.addVida(-1);
            System.out.println("[Vida atual: "+nHero.getVida()+"]\n");
        }
        else if(x<5){
            System.out.println("[Você errou o ataque.]");
        }
        else if(x<19){
            System.out.println("[Você acertou o ataque, e infligiu "+(x+nHero.getIntStatus()[0])+" de dano]");
            vidaGA=vidaGA-x-nHero.getIntStatus()[0];
            if(vidaGA<=0){
                System.out.println("[Você matou o Goblin Atleta.]");
                goblinAtl=false;
                kill.killMonster(nHero);
            }
            else{
                System.out.println("[O goblin parece muito machucado pelo seu ataque. Mais um e ele irá para Valhala.]");
            }
        }
        else{
            System.out.println("[Você acertou o ataque, explodindo a cabeça do goblin, infligindo"+(x+nHero.getIntStatus()[0])+" de dano.]");
            System.out.println("[Você matou o Goblin Atleta.]");
            goblinAtl=false;
            kill.killMonster(nHero);
        }
        turnos();
    }
    public void escolha3(createHero nHero){
        comando batata = new comando(nHero);
        
        int h = destE3(nHero);
        soma = h + nHero.getIntStatus()[2];
        
        System.out.println("[Você escolhe o contra ataque!]");
        System.out.println("d20 rolado! Resultado: "+h+" + bonus de destreza ("+nHero.getIntStatus()[2]+")");
        System.out.println("Resultado: "+soma+"/10\n");
        
        if(soma<5){
            System.out.println("[Você... falhou. Você tenta se preparar para receber o ataque, mas fixa a perna errado e se ajoelha.");
        }
        else if(soma<19){
            contCA=1;
            if(nHero.getClasse().equals("guerreiro")){
                System.out.println("\n[Você ajeita sua espada de uma forma que bloquará todos os ataques.]\n");
            }
            if(nHero.getClasse().equals("arqueiro")){
                System.out.println("\n[Você fica pronto, para quando te atacarem, você pular para atirar uma flecha certeira.]\n");
            }
            if(nHero.getClasse().equals("mago")){
                System.out.println("\n[Você cria um escudo mágico ao seu redor; Qualquer ataque fará que o goblin fique atordoado.]");
            }
        }
        else{
            contCA=2;
            if(nHero.getClasse().equals("guerreiro")){
                System.out.println("\n[Você ajeita sua espada de uma forma que qualquer ataque contra você, fará o atacante levar dano.]\n");
            }
            if(nHero.getClasse().equals("arqueiro")){
                System.out.println("\n[Você fica pronto, para quando te atacarem, você pular para atirar uma flecha certeira.]\n");
            }
            if(nHero.getClasse().equals("mago")){
                System.out.println("\n[Você cria um escudo mágico por um turno ao seu redor; Qualquer ataque fará o dano voltar dobrado.]");
            }
        }
        turnos();
    }
    private int destE3(createHero nHero){
        comando batata = new comando(nHero);
        return (batata.rolld20()+1);
    }    
    public void escolha4(createHero nHero, experience kill){
        comando batata = new comando(nHero);
        
        soma=batata.rolld20()+nHero.getIntStatus()[5];
        System.out.println("\n[Você escolhe a persuasão!]");
        System.out.println("d20 rolado! Resultado: "+batata.rolld20()+" + bonus de carisma ("+nHero.getIntStatus()[5]+")");
        System.out.println("Resultado: "+soma+"/10\n");
        if(soma<10){
            System.out.println("[Você falha o teste. Você tenta falar com os goblins.]");
            System.out.println("\nVocê: Ô SEUS PORCOS MALDITOS, TÃO FAZENDO O QUE AQUI?");
            System.out.println("\n[Você claramente falhou... Vish...]");
            System.out.println("[Por ter tentado e aprendido que não se fala assim, você ganha permanentemente +1 em carisma.]");
            nHero.addCarisma(1);            
            System.out.println("[Agora se prepare, um ataque deles está a caminho!]\n");
        }
        else if(soma<20){
            System.out.println("[Você passou no teste. Você tenta falar com os goblins.]\n");
            System.out.println("Você: Atenção! Dou 5 moedas de ouro, tudo que possuo, por informação!");
            System.out.println("\tPor qual razão procuram encrenca?");
            System.out.println("Goblin Atleta: Primeiro o ouro, depois a informação.");
            System.out.print("\n[Entregar o ouro? [s/n] ] ");
            String escolha = in.next();
            while(!escolha.equals("s") && !escolha.equals("n")){
                System.out.println("[Não entendi, pode repetir, por favor?] ");
                escolha = in.next();
            }
            if(escolha.equals("s")){
                escolhaSim();
            }
            if(escolha.equals("n")){
                escolhaNao();
            }
        }
        else{
            System.out.println("\n[Você tenta convencer os Goblins a não atacar o cidadão.]");
            System.out.println("[Os goblins passam a confiar em você, e vão embora sem pestanejar.]");
            kill.killMonster(nHero);kill.killMonster(nHero);kill.killMonster(nHero);
            persu=true;
        }
        turnos();
    }
    public void escolhaSim(){
        System.out.println("\n============================================================================\n");
        System.out.println("Goblin Gordo: Muito bem, escória humana. Fomos contratados pelo Demônio Proorismo");
        System.out.println("Goblin Atleta: Podíamos ter todo ouro que encontrássemos, mas ele queria todos vivos para o evento final");
        System.out.println("\tMas as vilas eram escarças, e pouco ouro tinham, se tinham.");
        System.out.println("\tNos rebelamos, e agora toda ajuda que encontramos aceitamos. Matamos tudo e todos, para que a balança nunca se iguale");
        System.out.println("\n[Os goblins entram em posição de ataque, menos o Goblin Atleta, por alguma razão]\n");
    }
    public void escolhaNao(){
        System.out.println("\n============================================================================\n");
        System.out.println("Você: Não, informação primeiro, e depois ouro. Não confio em quem ataca pessoas inocentes.");
        System.out.println("Goblin Esquelético: MMMMUUUITOO BEMMM, PRREPARE-SE PARRRA UMMMA MORRTEE DOLLORRRROOSSAA");
        System.out.println("\n[Os goblins entram em posição de ataque. Menos o Goblin Atleta, por alguma razão.]\n");
    }
    public void escolha5(createHero nHero){
        comando batata = new comando(nHero);
        
        int soma=batata.rolld20()+nHero.getIntStatus()[6];
        System.out.println("\n[Você escolhe fazer um teste de perceção!]");
        System.out.println("d20 rolado! Resultado: "+batata.rolld20()+" + bonus de percepção ("+nHero.getIntStatus()[6]+")");
        System.out.println("Resultado: "+soma+"/10\n");
        if(soma<10){
            System.out.println("[Você não conseguiu repararar nada de especial nos goblins.]");
            System.out.println("[Agora se prepare, um ataque deles está a caminho!]\n");
        }
        else if(soma <=15){
            System.out.println("[Você olha um pouco e percebe que o Goblin Esquelético parece muito machucado]");
            System.out.println("[O Goblin Gordo parece estar sem fôlego, provavelmente seu próximo ataque será muito fraco]");
            System.out.println("[E o Goblin Atleta está olhando ao redor, sem prestar atenção em você. Certamente é o mais forte de todos.]");
            System.out.println("[Agora se prepare, um ataque deles está a caminho!]\n");
        }
        else if(soma<20){
            System.out.println("[Você olha um pouco e percebe que o Goblin Esquelético parece muito machucado]");
            System.out.println("[O Goblin Gordo parece estar sem fôlego, provavelmente seu próximo ataque será muito fraco]");
            System.out.println("[E o Goblin Atleta está olhando ao redor, sem prestar atenção em você. Certamente é o mais forte de todos.]");
            System.out.println("[Você também percebe, com o canto do olho, que o Golbin Atleta está machucado no lado esquerdo.]");
            System.out.println("[Agora você sabe que se o atacar do lado esquerdo, será um dano crítico, sem sombra de dúvidas!]");
            System.out.println("[Agora se prepare, um ataque deles está a caminho!]\n");
        }
        else{
            System.out.println("[Você olha um pouco e percebe que o Goblin Esquelético parece muito machucado]");
            System.out.println("[O Goblin Gordo parece estar sem fôlego, certamente seu próximo ataque será muito fraco]");
            System.out.println("[E o Goblin Atleta está olhando ao redor, sem prestar atenção em você. Certamente é o mais forte de todos.]");
            System.out.println("[Você também percebe, com o canto do olho, que o Golbin Atleta está machucado no lado esquerdo.]");
            System.out.println("[Agora você sabe que se o atacar do lado esquerdo, será um dano crítico, sem sombra de dúvidas!]");
            System.out.println("[Além disso, você descobre que ele é cego do olho direito, então o matar será fácil!]");
            System.out.println("[Agora se prepare, um ataque deles está a caminho!]\n");
        }
        turnos();
    }
    //firstHistory
}