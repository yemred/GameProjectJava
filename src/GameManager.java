
public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" adl� oyun sisteme kaydedildi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" adl� oyun sistememden silindi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" adl� oyun g�ncellendi");
		
	}

}
