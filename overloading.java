class calculator{
    public int add(int a, int b)
    {
    return a+b;
}

public int add(int a,int b, int c){
    return a+b+c;
}
}



class overloading{

    public static void main(String[] args) {
        calculator sum1=new calculator();
        int result1=sum1.add(3,5,6);
       System.out.println(result1);

        calculator sum2=new calculator();
        int result2=sum2.add(2,3);
        System.out.println(result2);
    
    }
}