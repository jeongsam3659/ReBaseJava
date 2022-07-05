package udmy.act15;

public class Customer {
	//state
	private String name;
	private Address homeAddress;
	
	//constructor
	public Customer(String name, Address home) {
		this.name = name;
		this.homeAddress = home;
	}

	//operation
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	
	//
	@Override
	public String toString() {
		return String.format("name - %s, homeAddress - %s", name, homeAddress);
	}
}
