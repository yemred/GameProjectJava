
public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getGameId()+"'li oyun indirime girmi�tir");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getGameId()+"'li oyunun indirim s�resi bitmi�tir");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getGameId()+"'li oyuna yeni indirim gelmi�tir.");
		
	}

}
