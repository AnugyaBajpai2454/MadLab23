class LakeDucks extends Ducks implements Flyable,Quackable{
    public void quack(){
        System.out.println("Lake Ducks Quacks");
    }
    public void fly(){
        System.out.println("Lake Duck FLY");
    }
}