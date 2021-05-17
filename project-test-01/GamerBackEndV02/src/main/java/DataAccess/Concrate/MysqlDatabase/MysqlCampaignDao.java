package DataAccess.Concrate.MysqlDatabase;

import DataAccess.Abstracts.CampaignDaoService;
import Entities.Campaign;

public class MysqlCampaignDao implements CampaignDaoService {
    @Override
    public void add(Campaign campaign) {
        System.out.println("Kampanya Mysql ile Eklendi. " + campaign.getCampaignName());

    }
}
