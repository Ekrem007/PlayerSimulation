package abstracts;
import entities.Campaign;

public interface CampaignServices {

    void add(Campaign campaign);
    void delete(Campaign campaign);
    void update(Campaign campaign);

    void update(Campaign campaign, int newDiscount);
}
