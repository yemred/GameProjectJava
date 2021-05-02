
public class BuyManager implements BuyService {

	public void buy(Player player, Game game) {
		System.out.println(game.getName()+" adlý oyun "+game.getGamePrice()+" fiyata "+player.getFirstName()+" adlý oyunucu taradýndan alýndý");
		
	}

}
