public class test {
    private int a;
    private String b;

    public test(){
        this.a=0;
        this.b="NULL";
    }

    public test(int ta,String tb){
        this.a= ta;
        this.b=tb;
    }

    public void setA(int ta){
        this.a = ta;
    }

    public void setB(String tb){
        this.b = tb;
    }

    @Override

    public String toString(){
        String resultado;
        resultado = "[a: "+a+" b: "+b+"]\n";
        return resultado;
    }

}
