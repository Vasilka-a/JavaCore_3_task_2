import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        GameProgress gameProgress1 = new GameProgress(50, 5, 7, 250);
        GameProgress gameProgress2 = new GameProgress(30, 6, 6, 200);
        GameProgress gameProgress3 = new GameProgress(75, 3, 5, 150);

        gameProgress1.saveGame(gameProgress1, "D://Games/savegames/save1.dat");
        gameProgress2.saveGame(gameProgress2, "D://Games/savegames/save2.dat");
        gameProgress3.saveGame(gameProgress3, "D://Games/savegames/save3.dat");

        List<String> filesToZip = new ArrayList<>();
        filesToZip.add("D://Games/savegames/save1.dat");
        filesToZip.add("D://Games/savegames/save2.dat");
        filesToZip.add("D://Games/savegames/save3.dat");

        GameProgress.zipFiles("D://Games/savegames/saveGames.zip", filesToZip);

    }
}
