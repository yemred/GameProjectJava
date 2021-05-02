
public class Campaign implements Entity{

	private int id;
	private int gameId;
	private String description;
	private double rate;
	
	public Campaign() {
		
	}

	/**
	 * @param id
	 * @param gameId
	 * @param endTime
	 * @param rate
	 */
	public Campaign(int id, int gameId, String description, double rate) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.description = description;
		this.rate = rate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String endTime) {
		this.description = endTime;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
}
