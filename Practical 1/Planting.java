public class Planting {
    // Fields
    private String bedId;
    private String speciesName;
    private int plantQuantity;
    private Date plantingDate;

    // Constructor
    public Planting(String plantingBedId, String plantingSpeciesName, int plantingPlantQuantity, Date plantingPlantingDate) {
        bedId = plantingBedId;
        speciesName = plantingSpeciesName;
        plantQuantity = plantingPlantQuantity;
        plantingDate = plantingPlantingDate;
    }

    // Accessor methods
    public String getBedId() {
        return bedId;
    }
    public String getSpeciesName() {
        return speciesName;
    }
    public int getPlantQuantity() {
        return plantQuantity;
    }
    public Date getPlantingDate() {
        return plantingDate;
    }
}