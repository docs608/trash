package sss.dpabstractfactory.phone;

class SingleSimPhone implements IPhone{
	private String companyName;
	private static final int NUMBER_OF_SIMS = 1;
	
	SingleSimPhone(TypeOfPhoneFactory typeOfPhoneFactory) {
		this.companyName = typeOfPhoneFactory.toString();
	}

	@Override
	public void showPhoneProperties() {
		System.out.println("Phone's company name: " + companyName);
		System.out.println("Phone's number of sims: " + NUMBER_OF_SIMS);
	}
	
}
