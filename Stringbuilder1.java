public class Stringbuilder1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(); //16
        StringBuilder sb2=new StringBuilder("Adit");
        StringBuilder sb3=new StringBuilder(100); //defines the capacity


        System.out.println(sb.capacity()+" "+sb.length());
        sb.append("abcdefghijklmnop");
        System.out.println(sb.capacity()+" "+sb.length());
        sb.append("s");
        System.out.println(sb.capacity()+" "+sb.length());

        sb.setCharAt(1, 'A');
        System.out.println(sb);

        sb2.setCharAt(1, 'a');
        System.out.println(sb2);

        sb2.trimToSize();
        System.out.println(sb2.capacity()); //will remove all the unused spaces

        System.out.println(sb2.reverse());
        

    }
}
