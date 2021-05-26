class HotDogStand {
    private int ID;
    private int totalHotDogs;
    private int NoSold;

    HotDogStand(int ID, int totalHotDog) {
        this.ID = ID;
        this.totalHotDogs = totalHotDog;
    }
    public int getNoSold(){
        return NoSold;
    }
    public int getId(){
        return ID;
    }
    public int getTotalHotDog(){
        return totalHotDogs;
    }
    public void justSold(){
        NoSold++; 
    }
}