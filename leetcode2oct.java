class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        int[] newArray = arr.clone();
        Arrays.sort(arr);
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int count = 0;
        for(int i = 0 ; i < arr.length;i++){    
            if(!map.containsKey(arr[i])){
                if(count != 0){
                  map.put(arr[i],(i+1)-count);
                    
                }else{
                    map.put(arr[i],i+1);  
                }
                
            }else{
                count++;
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            
            arr[i] = map.get(newArray[i]);
        }
        return arr ;
    }
}
=======================================================================================================================================
