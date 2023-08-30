package concrete;
import entities.Campaign;
import abstracts.CampaignServices;

public class CampaignManager implements CampaignServices {


    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getName()+" campaign added.");

    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getName()+" campaign deleted.");

    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getName()+" campaign updated.");

    }

    @Override
    public void update(Campaign campaign, int newDiscount) {
        System.out.println(campaign.getName()+" campaign updated.");
        System.out.println("new discount: " + newDiscount);

    }
}
