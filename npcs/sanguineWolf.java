public class sanguineWolf{
  private int HP = 50;
  private int Lvl = 5;
  private int Dmg = 2 * enrage;
  private int xpvalue = 100;
  private boolean isAlive = true;
  private int enrage = 1;
  public int getEnrage() {
    return enrage;
  }
  public void incEnrage() {
    enrage++;
  }
  public boolean getIsAlive() {
    return isAlive;
  }
  public void setIsAlive(boolean isAlive) {
    this.isAlive = isAlive;
  }
  public int getHP() {
    return HP;
  }
  public void setHP(int HP) {
    this.HP = HP;
  }
  public int getLvl() {
    return Lvl;
  }
  public void setLvl(int Lvl) {
    this.Lvl = Lvl;
  }
  public int getDmg() {
    return Dmg;
  }
  public void setDmg(int Dmg) {
    this.Dmg = Dmg;
  }
  public int getXP() {
    return XP;
  }
  public void setXP(int XP) {
    this.XP = XP;
  }
}
