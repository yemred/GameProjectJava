
public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getGameId()+"'li oyun indirime girmiþtir");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getGameId()+"'li oyunun indirim süresi bitmiþtir");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getGameId()+"'li oyuna yeni indirim gelmiþtir.");
		
	}

}
