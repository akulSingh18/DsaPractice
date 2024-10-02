class HelloWorld {

    public static int f(int N){
        if(N <= 1) return N;

        int last = f(N-1);
        int slast = f(N-2);
        return last+slast;
    }
    public static void main(String[] args) {
       
        int N = 3 ;
        System.out.print(f(N));

        
    }
}