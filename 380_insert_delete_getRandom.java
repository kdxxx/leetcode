class RandomizedSet {

    HashSet<Integer> hashset;

    public RandomizedSet() {
        hashset = new HashSet<Integer>();
    }
    
    public boolean insert(int val) {
        return hashset.add(val);
    }
    
    public boolean remove(int val) {
        return hashset.remove(val);
    }
    
    public int getRandom() {
        Integer[] arrayNumbers = hashset.toArray(new Integer[hashset.size()]);
        Random random = new Random();
        int randomNumber = random.nextInt(hashset.size());
        return arrayNumbers[randomNumber];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
