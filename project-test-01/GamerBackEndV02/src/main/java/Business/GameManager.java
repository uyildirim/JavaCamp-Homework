package Business;

import Business.Abstracts.GamaService;
import DataAccess.Abstracts.GameDaoService;
import Entities.Game;

public class GameManager implements GamaService {
    private GameDaoService gameDaoService;

    public GameManager(GameDaoService gameDaoService) {
        this.gameDaoService = gameDaoService;
    }

    @Override
    public void add(Game game) {
        gameDaoService.add(game);
//        System.out.println("Oyun Eklendi. " + game.getGameName());

    }
}
