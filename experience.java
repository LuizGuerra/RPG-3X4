public class experience{
    int lvl=0, exp=0;
    public void killMonster(createHero nHero){
        exp++;
        if(lvl<6){
            if(exp==3){
                lvl++;
                exp=0;
                nHero.lvlUp();
                //return true;
            }
        }
        else{
            if(exp==6){
                lvl++;
                exp=0;
                nHero.lvlUp();
                //return true;
            }
        }
        //return false;
    }
    public int getLvl(){
        return lvl;
    }
    public int getExp(){
        return exp;
    }
}