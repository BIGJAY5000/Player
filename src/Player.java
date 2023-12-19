public class Player {

    //attributes
    private int numPlayers;
    private int x;
    private int y;
    private int z;
    private int direction;
    private int hp;
    private String name;

    //constructors
    public Player(){
        x = 0;
        y = 0;
        z = 0;
        hp = 20;
        direction = 1;
        name = "P";
        numPlayers++;
    }
    public Player(String name, int x, int y, int z){
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        hp = 20;
        direction = 1;
        numPlayers++;
    }
    public Player(String name, int x, int y, int z, int hp, int direction){
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        if (direction == 1||direction == 2||direction == 3||direction == 4||direction == 5||direction == 6) {
            this.direction = direction;
        }
        else{
            this.direction = 1;
        }
        if (hp >= 0) {
            this.hp = hp;
        }
        else {
            this.hp = 1;
        }
        numPlayers++;
    }

        //accessors
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getZ(){
        return z;
    }
    public int getHP(){
        return hp;
    }
    public int getDirection(){
        return direction;
    }
    public int getNumPlayers(){
        return numPlayers;
    }
    public String getName(){
        return name;
    }

    public String toString(){
        String info = String.format("%-5s%10s\n%-5s%10d\n%-13s%-5s%3d%5s%3d%5s%3d\n%-10s%10d", "Name: ", name, "Health: ", hp, "Coordinates: ", "X", x, "Y", y, "Z", z, "Directions: ", direction);
        return info;
    }

    //mutators
    public void setHP(int hp){
        if (hp > 0 && hp <= 100) {
            this.hp = hp;
        }
        else {
            System.out.println("You have entered an invalid input");
        }
    }

    public void setDirection(int direction){
        if (direction == 1 || direction == 2 || direction == 3 || direction == 4 || direction == 5 || direction == 6) {
            this.direction = direction;
        } else {
            System.out.println("You have entered an invalid input (only 1-6)");
        }
    }
    public void move(int direction, int units){
        if (direction == 1) {
            this.x += units;
        }
        else if (direction == 2) {
            this.x -= units;
        }
        else if (direction == 3) {
            this.y += units;
        }
        else if (direction == 4) {
            this.y -= units;
        }
        else if (direction == 5) {
            this.z += units;
        }
        else if (direction == 6) {
            this.z -= units;
        }
    }
    public void teleport(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void teleport(Player player){
        this.x = player.getX();
        this.y = player.getY();
        this.z = player.getZ();
    }
    public void attack(Player player, int damage){
        this.hp += damage;
        player.setHP(player.getHP() - (damage));
    }

    public double getDistance(int x, int y, int z){
        double distanceX = x - getX();
        double distanceY = y - getY();
        double distanceZ = z - getZ();
        double distance = Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2) + Math.pow(distanceZ, 2));
        return distance;
    }
    public double getDistancePlayers(Player player){
        double distanceX = player.getX()- getX();
        double distanceY = player.getY() - getY();
        double distanceZ = player.getZ() - getZ();
        double distance = Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2) + Math.pow(distanceZ, 2));
        return distance;
    }














































}
