class MyHashSet {
    
    boolean h[][];
    MyHashSet(){
        h=new boolean[1000][];
    }

    int getPrimaryIndex(int key){
        return key%1000;
    }

    int getSecondaryIndex(int key){
        return key/1000;
    }

    void add(int key){
        int index = getPrimaryIndex(key);
        int sindex = getSecondaryIndex(key);

        if(h[index]==null){
            if(index==0){
                h[index]=new boolean[1000+1];
            }
            else{
                h[index]=new boolean[1000];
            }

        }
        h[index][sindex]=true;
    } 

    void remove(int key){
        int index = getPrimaryIndex(key);
        int sindex = getSecondaryIndex(key);

        if(h[index]!=null){
            h[index][sindex]=false;
        }
        
    }

    boolean contains(int key){
        int index = getPrimaryIndex(key);
        int sindex = getSecondaryIndex(key);

        if(h[index]==null){
            return false;
        }

        return h[index][sindex];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */