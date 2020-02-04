public class FlowerSpecies {
    // Fields
    private String name;
    private String genus;
    private String family;
    private int sowingMonth;
    private int timeToBloom;

    // Constructor
    public FlowerSpecies(String plantName, String plantGenus, String plantFamily, int plantSowingMonth, int plantTimeToBloom) {
        name = plantName;
        genus = plantGenus;
        family = plantFamily;
        sowingMonth = plantSowingMonth;
        timeToBloom = plantTimeToBloom;
    }

    // Accessor methods
    public String getName() {
        return name;
    }
    public String getGenus() {
        return genus;
    }
    public String getFamily() {
        return family;
    }
    public int getSowingMonth() {
        return sowingMonth;
    }
    public int getTimeToBloom() {
        return timeToBloom;
    }
}