class Car extends Vehicle {
    private String modelName;
    
    public Car (String initialBrand, String initialModelName) {
        super(initialBrand);
        this.modelName = initialModelName;
    }

    public String getModelName() {
        return this.modelName;
    }
    
    public void honk() {
        if (modelName == "Mustang") {
            System.out.println("Bruum, bruum!");
        } else {
            System.out.println("Tuut, tuut!");
        }
    }
}