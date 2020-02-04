public class BotanicGardens {
    public static void main(String[] args) {
        // Creating an array of plant species
        FlowerSpecies allSpecies[] = new FlowerSpecies[3];
        allSpecies[0] = new FlowerSpecies("Daffodil", "Narcissus", "Amaryllidaceae", 9, 5);
        allSpecies[1] = new FlowerSpecies("Sweet Williams", "Dianthus", "Caryophyllacea", 9, 15);
        allSpecies[2] = new FlowerSpecies("Lily", "Lilium", "Liliaceae", 9, 10);

        // Creating a flower bed
        FlowerBed firstBed = new FlowerBed("bed1", 15);

        // Creating an array of seed stocks, with one stock for each species
        Stock allStocks[] = new Stock[3];
        allStocks[0] = new Stock("Daffodil", 100, new Date(2020, 12, 20));
        allStocks[1] = new Stock("Sweet Williams", 100, new Date(2020, 10, 15));
        allStocks[2] = new Stock("Lily", 100, new Date(2020, 11, 25));

        // Creating an array of plantings, with one planting of each species in bed1
        Planting allPlantings[] = new Plantings[3];
        
        // STOPPED HERE BECAUSE I GOT BORED
    },
}