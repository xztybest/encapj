package encapj;

public class MammalInt implements Animal {
    public void eat(){
        System.out.println("Mammal eats");
    }
    public void travel(){
        System.out.println("Mammal travels");
    }
    public int noOfLegs(){
        return 0;
    }
}
