class HelloWorld {
    
    public static boolean  palin(String s , int start , int end ){
        if(start > end) return true ;
        
        if(s.charAt(start) != s.charAt(end)) return false ;
        
         return palin(s,start+1,end-1);  
    }

    public static void main(String[] args) {
       
       String s  = "uuuuuuuuu";
       
       System.out.print(palin(s,0,s.length()-1)); 
    }
}