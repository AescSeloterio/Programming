//—Favorite Games—

import java.util.ArrayList;

public class ArrayListInJava {

    public static void main(String[] args) {

        ArrayList<String> games = new ArrayList<>();

        games.add("Minecraft");
        games.add("Dota 2");
        games.add("Valorant");
        games.add("Roblox");

        System.out.println("Favorite Games:");

        for (String game : games) {

            System.out.println(game);

        }
    }
}