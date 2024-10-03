
// parameterised way 


class HelloWorld {

    public static void sum(int N,int s){
        if(N < 1 ){
            System.out.print(s);
            return;
        } 

        sum(N-1,s+N);
         
    }
    public static void main(String[] args) {
       
        int N = 10 ;
        int s = 0 
        sum(N,s);  
    }
}

// functionl way 


