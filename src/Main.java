import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    Player p1 = new Player();
    Player p2 = new Player(InputHelper.getNonZeroLenString(scan, "Please enter the name of your second player"), InputHelper.getInt(scan, "Please enter your x coordinate"),InputHelper.getInt(scan, "Please enter your y coordinate"),InputHelper.getInt(scan, "Please enter your z coordinate"));
    Player p3 = new Player(InputHelper.getNonZeroLenString(scan, "Please enter the name of your third player"), InputHelper.getInt(scan, "Please enter your x coordinate"), InputHelper.getInt(scan, "Please enter your y coordinate"),InputHelper.getInt(scan, "Please enter your z coordinate"), InputHelper.getInt(scan, "Please enter your HP"), InputHelper.getInt(scan, "Please enter your direction"));


        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        p2.move(2, 5);
        System.out.println(p2.getName() + " moved 5 units in direction 2");
        System.out.println(p2.toString());
        p1.attack(p3, 10);
        System.out.println(p1.getName() + " attacked " + p3.getName() + " for 10 damage");
        System.out.println(p3.toString());
        p3.teleport(p2);
        System.out.println(p3.getName() + " teleported to " + p2.getName());
        System.out.println(p3.toString());
        double distance = p3.getDistance(10,12,45) ;
        System.out.println(p3.getName() + " is " + distance + " units away from the given point");
    }
}