
	package camera.rental;

	public class Camera {
	private String brand;
	private String model;
	private double rentalAmount;
	private boolean isRented;

	public Camera(String brand, String model, double rentalAmount) {
	this.brand = brand;
	this.model = model;
	this.rentalAmount = rentalAmount;
	    }

	public String getBrand() {
	return brand;
	    }

	public String getModel() {
	return model;
	    }

	public double getRentalAmount() {
	return rentalAmount;
	    }

		public boolean isRented() {
			return isRented;
		}

		public void setRented (boolean isRented) {
			this.isRented = isRented;
		}

		}



