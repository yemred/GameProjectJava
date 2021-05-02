
public class PlayerManager implements PlayerService {

	PlayerCheckService playerCheckService;
	
	/**
	 * @param playerCheckService
	 */
	public PlayerManager(PlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void add(Player player) {
		
		if(playerCheckService.checkIfRealPerson(player)) {
			System.out.println(player.getFirstName()+" adl� oyuncu sisteme ba�ar�yla Kaydedildi");
		}else {
			System.out.println("Oyuncu do�rulanamd�");
		}
		
	}

	@Override
	public void delete(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int playerId) {
		// TODO Auto-generated method stub
		
	}

}
