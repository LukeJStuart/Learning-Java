public class Stock {
    // Fields
    private String speciesName;
    private int seedQuantity;
    private Date bestBeforeDate;

    // Constructor
    public Stock(String stockSpeciesName, int stockSeedQuantity, Date stockBestBeforeDate) {
        speciesName = stockSpeciesName;
        seedQuantity = stockSeedQuantity;
        bestBeforeDate = stockBestBeforeDate;
    }

    // Accessor methods
    public String getSpeciesName() {
        return speciesName;
    }
    public int getSeedQuantity() {
        return seedQuantity;
    }
    public Date getBestBeforeDate() {
        return bestBeforeDate;
    }

    // Mutator methods
    public void alterSeedQuantity(int amount) {
        seedQuantity = seedQuantity + amount;
        // Ensuring seedQuantity >= 0
        if (seedQuantity < 0) {
            seedQuantity = 0;
        }
    }
}