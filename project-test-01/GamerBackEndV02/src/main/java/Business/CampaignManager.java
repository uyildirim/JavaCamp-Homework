package Business;

import Business.Abstracts.CampaignManagerService;
import DataAccess.Abstracts.CampaignDaoService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class CampaignManager implements CampaignManagerService {
    private CampaignDaoService campaignDaoService;

    public CampaignManager(CampaignDaoService campaignDaoService) {
        this.campaignDaoService = campaignDaoService;
    }

    @Override
    public void add(Campaign campaign) {
        campaignDaoService.add(campaign);
    }

    @Override
    public void update(Campaign campaign) {

    }

    @Override
    public void delete(Campaign campaign) {

    }

    public void useCampaign(Campaign campaign, Game game, Customer customer){
        System.out.println(campaign.getCampaignName()+" Kampanyası "+game.getGameName()+" oyunu için ugulanıyor.");
        System.out.println(game.getGameName() +" : " + game.getGamePrice() + " TL indirimli fiyatı. " + hesapla(campaign, game)+" TL");
    }

    private double hesapla(Campaign campaign,Game game){
        return (game.getGamePrice() * campaign.getCampaignRate()) / 100 ;
    }
}
