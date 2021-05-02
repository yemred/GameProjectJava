
public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" adlý oyun sisteme kaydedildi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" adlý oyun sistememden silindi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" adlý oyun güncellendi");
		
	}

}
