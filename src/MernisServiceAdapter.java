import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {
		boolean result = false;
		KPSPublicSoapProxy soapClient = new KPSPublicSoapProxy();
		try {
			
			result = soapClient.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()), player.getFirstName(), player.getLastName(), player.getDateOfBirth().getYear());
			
		}catch (Exception e) {
			System.out.println("Hata Oyuncu Bulanamadý");
		}
		
		return result;
		
	}

}
