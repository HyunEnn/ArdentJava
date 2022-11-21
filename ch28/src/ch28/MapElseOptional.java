package ch28;

import java.util.Optional;

class ContInfo {
	Optional<String> phone;
	Optional<String> adrs;
	
	public ContInfo(Optional<String> ph,Optional<String> ad) {
		phone = ph;
		adrs = ad;
	}
	
	public Optional<String> getPhone() { return phone; }
	public Optional<String> getAdrs() { return adrs; }
}

public class MapElseOptional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Optional<ContInfo> ci = Optional.of(new ContInfo(null, "Republic of Korea"));
//		
//		String phone = ci.map(s -> s.getPhone())
//						.orElse("There is no Phone number");
//		String adrs = ci.map(s -> s.getAdrs())
//						.orElse("There is no address.");
//		
//		System.out.println(phone);
//		System.out.println(adrs);
		
		Optional<ContInfo> ci = Optional.of(
				new ContInfo(Optional.ofNullable(null), Optional.of("Republic of Korea"))
		);
		
		String phone = ci.flatMap(c -> c.getPhone())
						 .orElse("There is no Phone numbers.");
		String addr = ci.flatMap(c -> c.getAdrs())
						.orElse("There is no address.");
		System.out.println(phone);
		System.out.println(addr);
		
		
	}

}
