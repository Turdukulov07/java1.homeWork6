public class Main {

    public static void main(String[] args){
        Boss b = new Boss(1000, 70);

        Weapon weapon = new Weapon("Combat", "Scar");
        b.setWeapon(weapon);

        System.out.println("Boss info" + " " + b.getHealth() + " " + b.getDomage()+ " "
                +" Boss wepon" + " " + b.getWeapon().getName() + " " + "Boss weapon type" + b.getWeapon().getType());

    }
}
