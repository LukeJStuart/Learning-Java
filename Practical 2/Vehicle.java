class Vehicle {
    protected String brand;

    public Vehicle(String initialBrand) {
        this.brand = initialBrand;
    }

    public String getBrand() {
      return this.brand;  
    }

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}