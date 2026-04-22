class LRUCache {
    private Map<Integer,Integer> cache;
    // private ArrayList<int []> cache;
    private int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<>(capacity,0.75f,true){
            protected boolean removeEldestEntry(Map.Entry<Integer,Integer> cache){
                return size() > LRUCache.this.capacity;
            }
        };
    }
    
    public int get(int key) {
        // for(int i=0; i<cache.size(); i++){
        //     if(cache.get(i)[0] == key){
        //         int [] tempArray = cache.remove(i);
        //         cache.add(tempArray);
        //         return tempArray[1];
        //     }
        // }
        // return -1;
        return cache.getOrDefault(key,-1);
    }
    
    public void put(int key, int value) {
    //  for(int i =0 ; i<cache.size();i ++){
    //     if(cache.get(i)[0] == key){
    //         int[] tempArray = cache.remove(i);
    //         tempArray[1] = value;
    //         cache.add(tempArray);
    //         return;
    //     }
    //     if(capacity == cache.size()){
    //         cache.remove(0);
    //     }
    //  }
    //     cache.add(new int[]{key,value});
    cache.put(key,value);
    }
}
