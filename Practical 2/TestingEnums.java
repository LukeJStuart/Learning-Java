// Trying out enums in a class
class TestingEnums {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    private Level myVar = Level.MEDIUM;

    public String getMyVar() {
        return myVar.toString();
    }

    public void setMyVar(String newValue) {
        switch(newValue) {
            case "LOW":
                myVar = Level.LOW;
                break;
            case "MEDIUM":
                myVar = Level.MEDIUM;
                break;
            case "HIGH":
                myVar = Level.HIGH;
                break;
            default:
                System.out.println("Invalid value for myVar.");
                break;
        }
    }

    public void loopLevel() {
        for (Level myVars : Level.values()) {
            System.out.println(myVars);
        }
    }
}