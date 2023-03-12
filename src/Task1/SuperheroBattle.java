package Task1;
import java.util.Random;
/*
The project SuperheroBattle is a game that simulates a battle between two random superheroes.
The game is played in rounds, and each round, one of the superheroes attacks the other. The game continues until one
of the superheroes' health points drop to zero or below, and the other superhero is declared the winner.
It was written as a task to train inner classes.
The use of inner classes for weapons and protections encapsulates the properties and behavior of the weapons and protections.


 */


public class SuperheroBattle {
    String name;
    int health;
    Weapon weapon;
    Protection protection;
    WarriorSkin warriorSkin;

    public static void main(String[] args) {
        game();
    }

    public SuperheroBattle(String name, Weapon weapon, Protection protection, WarriorSkin warriorSkin) {
        this.name = name;
        this.health = 100;
        this.weapon = weapon;
        this.protection = protection;
        this.warriorSkin = warriorSkin;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "        ---=== Player " + name + " ===--- \nhealth: " + health + "\nweapon: " + weapon + "\nprotection: " + protection;
    }

    public static SuperheroBattle createRandomSuperhero() {
        Random random = new Random();
        String[] names = {"Mister X", "Iron Table", "Crazy Hunter", "Naked Knight", "Electric Squirrel", "Mystic Cat", "Agent 007", "Agent Shark"};
        return new SuperheroBattle(names[random.nextInt(names.length - 1) + 1], new Weapon(), new Protection(), new WarriorSkin());
    }

    public static void makeDamage(SuperheroBattle player1, SuperheroBattle player2) {
        // player1 attacks, player2 defends
        int damage = 0;
        if (player1.weapon.weaponForce > player2.protection.protectionLevel) {
            damage = player1.weapon.weaponForce - player2.protection.protectionLevel;
            player2.health = player2.health - damage;
        }
        System.out.println(player1.name + " attacks using his " + player1.weapon.weaponName + " and gives " + damage + " points of damage to " + player2.name + "!");
    }


    public static void printInfoAfterRound(int roundNumber, SuperheroBattle player1, SuperheroBattle player2) {
        System.out.println("========================================");
        System.out.println("Round " + roundNumber + " is over:");
        System.out.println(player1.name + " has " + player1.getHealth() + " points of health");
        System.out.println(player2.name + " has " + player2.getHealth() + " points of health");
        System.out.println("========================================");
    }

    public static boolean isDead(SuperheroBattle player1) {
        boolean isDead = false;
        if (player1.health <= 0) {
            isDead = true;
        }
        return isDead;
    }

    //TODO battle method - main
    public static void game() {
        SuperheroBattle hero1 = createRandomSuperhero();
        SuperheroBattle hero2 = createRandomSuperhero();

        System.out.println("========Presenting our warriors !========\n\nIn the left corner:\n");
        System.out.println(hero1.warriorSkin);
        System.out.println(hero1);
        System.out.println();
        System.out.println("In the right corner:");
        System.out.println(hero2.warriorSkin);
        System.out.println(hero2);
        System.out.println();
        System.out.println("                FIGHT !!!");
        System.out.println();
        boolean hero1Turn = true; // флаг определяющий, чей сейчас ход
        int round = 1;
        // игра продолжается пока оба игрока живы
        while (!isDead(hero1) && !isDead(hero2)){
            System.out.println("Round " + round);
            if (hero1Turn) {
                makeDamage(hero1, hero2);
                if (isDead(hero2)){
                    System.out.println("GAME IS OVER: " + hero2.name + " lost.");
                    break;
                }
                hero1Turn = false;
            } else {
                makeDamage(hero2, hero1);
                if (isDead(hero1)){
                    System.out.println("GAME IS OVER: " + hero1.name + " lost.");
                    break;
                }
                hero1Turn = true;
                printInfoAfterRound(round, hero1, hero2);
                round++;
            }
        }
    }


    private static class Weapon {
        String weaponName;
        int weaponForce;

        @Override
        public String toString() {
            return weaponName +
                    ", weapon force: " + weaponForce;
        }

        public Weapon() {
            Random random = new Random();
            String[] weaponName = new String[] {"KNIFE", "AK-47", "CHICKEN EGGS", "SAW", "BANANA", "ANNIHILATOR GUN", "DIRTY SOCKS"};
            this.weaponName = weaponName[random.nextInt((weaponName.length - 1) + 1)];
            this.weaponForce = new Random().nextInt(11) + 50;
        }
    }

    private static class Protection {
        String protectionName;
        int protectionLevel;

        @Override
        public String toString() {
            return protectionName +
                    ", protection level: " + protectionLevel;
        }

        public Protection() {
            Random random = new Random();
            String[] protectionName = new String[] {"SHIELD", "VODKA", "SUPER SPEED", "TOILET PAPER", "HELMET", "SHAMPOO HEAD AND SHOULDERS", "BEAR SKIN"};
            this.protectionName = protectionName[random.nextInt(protectionName.length - 1) + 1];
            this.protectionLevel = new Random().nextInt(21) + 30;
        }
    }

    public static class WarriorSkin {

        String skin;

        public WarriorSkin() {
            String[] warriorSkins = {
                    "/|_/|\n" +
                            " / ^_^ \\\n" +
                            " /   \"   \\\n" +
                            "/_/     \\_\\\n",

                    "/|_/_\n" +
                            "/ o o \\\n" +
                            "/   =   \\\n" +
                            "/_/     \\_\\\n",

                    "/|_/_\n" +
                            "/ o o \\\n" +
                            "/   -   \\\n" +
                            "/_/     \\_\\\n",

                    " /|\\\n" +
                            "/_o_\\\n" +
                            "/ | \\\n" +
                            "/ / \\ \\\n" +
                            "/_/   \\_\\\n",

                    "  /|\\\n" +
                            " /o o\\\n" +
                            " /_`^`_\\\n" +
                            "/_|_|_\\\n",

                    "  /\\_/\n" +
                            " / o  o \\\n" +
                            "(   \"   )\n" +
                            " \\~(*)~/ \n" +
                            "  - ^ - \n",

                    " /\\__/\n" +
                            " /`    '\\\n" +
                            " === 0  0 ===\n" +
                            " \\  --  /\n" +
                            " /        \\\n" +
                            "/          \\\n",

                    " /\\_/\\\n" +
                            "/ o   o \\\n" +
                            "=(   \"   )=\n" +
                            " \\~(*)~/ \n" +
                            "  - ^ - \n",

                    " /\\__/\n" +
                            "/ o  o \\\n" +
                            "(   \"   )\n" +
                            " \\~(*)~/ \n" +
                            "  - ^ - \n",

                    " /\\__/\\\n" +
                            "/`    '\\\n" +
                            "=== 0  0 ===\n" +
                            " \\  --  /\n" +
                            " /      \\\n" +
                            "/        \\\n\n"
            };

            Random random = new Random();
            int index = random.nextInt(warriorSkins.length);
            this.skin = warriorSkins[index];
        }
        @Override
        public String toString() {
            return skin;
        }
    }
}
