
public class BuyManager implements BuyService {

	public void buy(Player player, Game game) {
		System.out.println(game.getName()+" adl� oyun "+game.getGamePrice()+" fiyata "+player.getFirstName()+" adl� oyunucu tarad�ndan al�nd�");
		
	}

}
