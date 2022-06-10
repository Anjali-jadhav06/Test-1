package com.anjali;

public class Factory {
	
		public static void main(String[] args) {

			FourWheeler f1 = new FourWheeler();
			FourWheeler f2 = new FourWheeler();
			FourWheeler f3 = new FourWheeler();
			FourWheeler f4 = new FourWheeler();

			try {
				f1.setName("Four Wheeler 1");
				f1.setCc(900);
				f1.setSafety(5);
				f1.setPrice(123.00);
				System.out.println(f1.toString());
			} catch (VehicleException | UnsafetyExceptions e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				f2.setName("Four Wheeler 2");
				f2.setCc(5000);
				f2.setSafety(5);
				f2.setPrice(123.00);
				System.out.println(f2.toString());
			} catch (VehicleException | UnsafetyExceptions e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				f3.setName("Four Wheeler 3");
				f3.setCc(2000);
				f3.setSafety(4);
				f3.setPrice(123.00);
				System.out.println(f3.toString());
			} catch (VehicleException | UnsafetyExceptions e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				f4.setName("Four Wheeler 4");
				f4.setCc(2000);
				f4.setSafety(5);
				f4.setPrice(123.00);
				System.out.println(f4.toString());
			} catch (VehicleException | UnsafetyExceptions e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

