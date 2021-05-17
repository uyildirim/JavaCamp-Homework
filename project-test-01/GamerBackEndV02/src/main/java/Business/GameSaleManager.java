package Business;

import Business.Abstracts.GameSaleService;
import Entities.Customer;
import Entities.Game;

public class GameSaleManager implements GameSaleService {

    @Override
    public void sale(Game game, Customer customer) {
        System.out.println(customer.getFirstName() + " Müşeterisi " + game.getGameName() + " Oyununu Aldı.");

    }
}
