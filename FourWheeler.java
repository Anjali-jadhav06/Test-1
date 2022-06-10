package com.anjali;

public class FourWheeler {

	private String name;
	private int cc;
	private Integer safety;
	private double price;

	public FourWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) throws VehicleException {
		if (cc < 1000) {
			throw new VehicleException("It is a Two Wheeler, not Four Wheeler");
		}

		if (cc > 4000) {
			throw new VehicleException("It is a Vehicle not a Train");
		}
		this.cc = cc;
	}

	public int getSafety() {
		return safety;
	}

	public void setSafety(int safety) throws UnsafetyExceptions {
		if (safety != 5) {
			throw new UnsafetyExceptions("Sorry, Invalid Safty features");
		}
		this.safety = safety;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "FourWheeler [name=" + name + ", cc=" + cc + ", safety=" + safety + ", price=" + price + "]";
	}

}
