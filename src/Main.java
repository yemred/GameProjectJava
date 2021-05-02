import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		Player player = new Player(1,"Yunus Emre","Duymaz",new Date(1990,8,13),"562843688","123");
		
		Game game1 = new Game(1,"Call of Duty",100);
		Game game2 = new Game(2,"Age Of Empires II",200);
		
		Campaign campaign = new Campaign(1,1, "Büyük Ýndirim",10);
		
		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		playerManager.add(player);
		
		BuyManager buyManager = new BuyManager();
		buyManager.buy(player, game1);
		

	}

}
