class Animals{
    int a=18;
    public void characters(){
        System.out.println("Animalia");
    }
}

class Humans extends Animals{

}


public class inheritance1 {
    public static void main(String[] args) {
        Animals homo=new Animals();
        System.out.println(homo.a);

        Humans h=new Humans();
        System.out.println(h.a);

        Humans h2=new Humans();
        h2.characters();
    }
}
