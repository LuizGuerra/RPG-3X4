import java.util.Scanner;
import java.util.Random;
public class createHero{
    String sexo, nome, classe;
    int ataque, defesa, velocidade, destreza, vitalidade, sabedoria, carisma, percepcao, vida;
    public void newHero(){
        // setHero hero = new setHero(sexO, nomE, classE);
    }
    public void sexoDoPersonagem(){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Você é um homem ou mulher? [respostas possíveis: homem/mulher ou h/m]: ");
        String sexoDP = in.next();
        sexoDP=sexoDP.toLowerCase();
        while(!"homem".equals(sexoDP) && !"mulher".equals(sexoDP) && !"h".equals(sexoDP) && !"n".equals(sexoDP)){
            System.out.println();
            System.out.println("Desculpa, eu não consegui entender. Pode responder novamente, por favor?");
            System.out.print("[respostas possíveis: homem/mulher]: ");
            sexoDP = in.next(); sexoDP=sexoDP.toLowerCase();
        }
        if(sexoDP.equals("h")){
            sexoDP="homem";
        }
        if(sexoDP.equals("m")){
            sexoDP="mulher";
        }
        this.sexo=sexoDP;
        System.out.println();
    }
    public String sr(){
        if(sexo.equals("homem")){
            return "senhor";
        }
        return "senhora";
    }
    public String sexo_o(){
        if(sexo.equals("homem")){
            return "o";
        }
        return "a";
    }
    public String sexo_heroi(){
        if(sexo.equals("homem")){
            return "herói";
        }
        return "heroína";
    }
    public void nomeDoPersonagem(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Qual o seu nome? Atenção! O nome só pode ser escolhido e mudado aqui.");
        System.out.print("Mais pra frente não será possível! ");
        String nomeDP = in.nextLine();
        String areyousure="nao";
        while (areyousure.equals("nao")||areyousure.equals("n")){
            System.out.print("\nVocê tem certeza que deseja esse nome? [respostas possíveis: sim/nao ou s/n] ");
            areyousure=in.next();
            areyousure=areyousure.toLowerCase();
            if(areyousure.equals("nao")||areyousure.equals("n")){
                System.out.print("Diga o nome do herói: ");
                nomeDP = in.nextLine(); nomeDP = in.nextLine();
            }
            while(!"sim".equals(areyousure) && !"nao".equals(areyousure) && !"s".equals(areyousure) && !"n".equals(areyousure)){
                System.out.print("Desculpa, eu não consegui entender! Responda sim ou nao, por favor! ");
                areyousure=in.next();
                areyousure=areyousure.toLowerCase();
            }
        }
        this.nome=nomeDP;
    }
    public String getNome(){
        return nome;
    }
    public void classeDoPersonagem(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("\nMuito bem! Está na hora de escolher a classe.");
        System.out.println("Classes disponíveis: arqueiro, mago e guerreiro.");
        System.out.print("Escolha uma das classes, por favor: ");
        String classE = in.next();
        classE=classE.toLowerCase();
        while(!classE.equals("arqueiro") && !classE.equals("mago") && !classE.equals("guerreiro")){
            System.out.println("\nDesculpa, não consegui entender. Poderia repetir, por favor?");
            System.out.print("Escolhas possíveis: [arqueiro/mago/guerreiro] ");
            classE = in.next();
            classE=classE.toLowerCase();
        }
        this.classe=classE;
        atributos();
    }
    public String getClasse(){
        return classe;
    }
    private void atributos(){
        Random rand = new Random();
        int ataque, defesa, velocidade, destreza, vitalidade, sabedoria, carisma, percepcao, vida=10;
        if(classe.equals("arqueiro")){
            ataque=rand.nextInt(5);
            if(ataque>3){
                ataque=ataque-1;
            }
            defesa=rand.nextInt(5)+1;
            velocidade=rand.nextInt(5)+1;
            destreza=rand.nextInt(5)+1;
            vitalidade=rand.nextInt(5);
            if(vitalidade>3){
                vitalidade=vitalidade-1;
            }
            sabedoria=rand.nextInt(5)+1;
            carisma=rand.nextInt(5)+1;
            percepcao=rand.nextInt(5)+1;
        }
        else if(classe.equals("mago")){
            ataque=rand.nextInt(5)+1;
            defesa=rand.nextInt(5)+1;
            velocidade=rand.nextInt(5)+1;
            destreza=rand.nextInt(5)+1;
            vitalidade=rand.nextInt(5);
            if(vitalidade>3){
                vitalidade=vitalidade-1;
            }
            sabedoria=rand.nextInt(5)+1;
            carisma=rand.nextInt(5)+1;
            percepcao=rand.nextInt(5)+1;
        }
        else{
            ataque=rand.nextInt(5)+1;
            if(ataque<2){
                ataque=ataque+1;
            }
            defesa=rand.nextInt(5)+1;
            if(defesa<2){
                defesa=defesa+1;
            }
            velocidade=rand.nextInt(5)+1;
            destreza=rand.nextInt(5)+1;
            vitalidade=rand.nextInt(5)+1;
            if(vitalidade<=2){
                vitalidade=vitalidade+1;
            }
            sabedoria=rand.nextInt(5);
            carisma=rand.nextInt(5)+1;
            percepcao=rand.nextInt(5)+1;
        }
        this.ataque=ataque;
        this.defesa=defesa;
        this.velocidade=velocidade;
        this.destreza=destreza;
        this.vitalidade=vitalidade;
        this.sabedoria=sabedoria;
        this.carisma=carisma;
        this.percepcao=percepcao;
        this.vida=vida;
    }
    public String [] getStatus(){
        String [] stats = new String [8];
        for(int i=0; i<8; i++){
            switch(i){
                case 0: stats[i]="Ataque: "+ataque; break;
                case 1: stats[i]="Defesa: "+defesa; break;
                case 2: stats[i]="Velocidade: "+velocidade; break;
                case 3: stats[i]="Destreza: "+destreza; break;
                case 4: stats[i]="Vitalidade: "+vitalidade; break;
                case 5: stats[i]="Sabedoria: "+sabedoria; break;
                case 6: stats[i]="Carisma: "+carisma; break;
                case 7: stats[i]="Percepção: "+percepcao; break;
            }
        }
        return stats;
    }
    public String vidaDP(){
        return "Vida total: "+vida;
    }
    public void lvlUp(){
        Random rand = new Random();
        
        ataque=ataque+rand.nextInt(2)+1;
        if(ataque>30){ataque=30;}
        defesa=defesa+rand.nextInt(2)+1;
        if(defesa>30){defesa=30;}
        velocidade=velocidade+rand.nextInt(2)+1;
        destreza=destreza+rand.nextInt(2)+1;
        if(destreza>30){destreza=30;}
        vitalidade=vitalidade+rand.nextInt(2)+1;
        if(vitalidade>20){vitalidade=20;}
        sabedoria=sabedoria+rand.nextInt(2)+1;
        if(sabedoria>30){sabedoria=30;}
        carisma=carisma+rand.nextInt(2)+1;
        if(carisma>20){carisma=20;}
        percepcao=percepcao+rand.nextInt(2)+1;
        if(percepcao>30){percepcao=30;}
        switch (classe){
            case "guerreiro": vida=vida+rand.nextInt(2)+2;
            case "mago": vida=vida+rand.nextInt(2)+1;
            case "arqueiro": vida=vida+rand.nextInt(2)+1;
        }
    }
}