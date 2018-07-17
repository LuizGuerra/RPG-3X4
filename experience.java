public class experience{
    int lvl=0, exp=0;
    public boolean killMonster(){
        exp++;
        if(lvl<6){
            if(exp==10){
                lvl++;
                exp=0;
                return true;
            }
        }
        else{
            if(exp==20){
                lvl++;
                exp=0;
                return true;
            }
        }
        return false;
    }
    public int getLvl(){
        return lvl;
    }
    public int getExp(){
        return exp;
    }
}