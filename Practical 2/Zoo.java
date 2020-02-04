// Trying out inner classes
class Zoo {
    private String zooName;
    
    public Zoo(String initZooName) {
        this.zooName = initZooName; 
    }

    public String getZooName() {
        return this.zooName;
    }

    // Defining an inner class for enclosures
    class Enclosure {
        private String enclosureName;

        public Enclosure(String initEnclosureName) {
            this.enclosureName = initEnclosureName;
        }

        public String getEnclosureName() {
            return this.enclosureName;
        }

        public void welcomeMessage() {
            System.out.println("Welcome to " + enclosureName + " at " + zooName + ".");
        }
    }
}