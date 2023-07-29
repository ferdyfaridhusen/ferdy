package overloading;

class Player {
    String name;
    static int jumlahPlayer;

    // Overloading constructor
    // opsi 1:
    Player(String name){
        Player.jumlahPlayer++;
        this.name = name;
    }

    // opsi 2:
    Player(){
        Player.jumlahPlayer++;
        this.name = "player" + Player.jumlahPlayer;
    }

    void show(){
        System.out.println("Name : " + this.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("lunox");
        player1.show();

        Player player2 = new Player();
        player2.show();
    }
}


