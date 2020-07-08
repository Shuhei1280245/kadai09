class Tanoshii extends DogState{
private static Tanoshii s = new Tanoshii();
private Tanoshii() {}
public static DogState getInstance() {
return s;
}
public void iraira(Dog moto) {
moto.changeState(futuu.getInstance());
}
public void neteru(Dog moto) {
moto.changeState(Tanoshii.getInstance());
}
public void tabet(Dog moto) {

// なにもしない
}
public String toString() {
return "楽しい状態";
    }
}