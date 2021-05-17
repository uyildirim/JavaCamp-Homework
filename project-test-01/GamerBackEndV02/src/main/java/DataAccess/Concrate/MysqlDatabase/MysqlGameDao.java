package DataAccess.Concrate.MysqlDatabase;

import DataAccess.Abstracts.GameDaoService;
import Entities.Game;

public class MysqlGameDao implements GameDaoService {
    @Override
    public void add(Game game) {
        System.out.println("Mysql ile Oyun eklendi.. " + game.getGameName());
    }
}
