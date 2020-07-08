class neteru extends DogState{
    private static neteru s = new neteru();
    private neteru(){}

    public static DogState getInstance(){
        return s;
    }
    public void tabeta(Dog moto){
    moto.changeState(tanoshii.getInstance());
    }
    public void tukareta(Dog moto){
    moto.changeState(hutuu.getInstance());
    }
}