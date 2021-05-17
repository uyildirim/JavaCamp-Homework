import Business.*;
import DataAccess.Concrate.MysqlDatabase.MysqlCampaignDao;
import DataAccess.Concrate.MysqlDatabase.MysqlGameDao;
import DataAccess.Concrate.PostgreCustomerDao.PostgreCustomerDao;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Ugur", "YILDIRIM");
        CustomerManager customerManager = new CustomerManager(new PostgreCustomerDao(), new CustomerMernisValidate());
        customerManager.add(customer);
//      ------------------------------------------------------------
        Game game = new Game(1, "Candy Crush Soda Saga", 15);
        GameManager gameManager = new GameManager(new MysqlGameDao());
        gameManager.add(game);
//      ------------------------------------------------------------
        Campaign campaign = new Campaign("%50 Bedava",50);
        CampaignManager campaignManager = new CampaignManager(new MysqlCampaignDao());
        campaignManager.add(campaign);
//      ------------------------------------------------------------
        GameSaleManager gameSaleManager = new GameSaleManager();
        gameSaleManager.sale(game, customer);

        campaignManager.useCampaign(campaign,game,customer);

    }
}
