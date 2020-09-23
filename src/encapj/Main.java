package encapj;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EncapTest encap=new EncapTest();
        encap.setName("James");
        encap.setAge(23);
        encap.setIdNum("1234ms");
        System.out.println("name:"+encap.getName()+","+
                "Age:"+encap.getAge());

        MammalInt m=new MammalInt();
        m.eat();
        m.travel();

        color c1=color.RED;
        color c2=color.BULLE;
        System.out.println(c1+":"+c2);
    }
}
