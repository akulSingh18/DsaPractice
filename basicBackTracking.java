// print 1 to N by backtracking 

class HelloWorld {

    public static void print(int N){
        if(N < 1) return ;
        print(N-1);
        System.out.print(N);
    }
    public static void main(String[] args) {
        
        int N = 5 ;
        print(N);
    }
}