class TestingTestingEnums {
    public static void main(String[] args) {
        TestingEnums myObj = new TestingEnums();
        System.out.println(myObj.getMyVar());
        myObj.setMyVar("LOW");
        System.out.println(myObj.getMyVar());
        myObj.loopLevel();
    }
}