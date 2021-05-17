package Business.Abstracts;

import Entities.Campaign;

public interface CampaignManagerService {
    void add(Campaign campaign);
    void update(Campaign campaign);
    void delete(Campaign campaign);

}
