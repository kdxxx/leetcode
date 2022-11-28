class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Set<Integer> winners = new HashSet<>();
        List<List<Integer>> answer = new ArrayList<>();

// https://www.w3schools.com/java/java_hashmap.asp
// https://www.geeksforgeeks.org/hashmap-getordefaultkey-defaultvalue-method-in-java-with-examples/

        for(int i=0; i<matches.length; i++){
            map.put(matches[i][1], map.getOrDefault(matches[i][1],0)+1);
        }

        for(int i=0; i<matches.length; i++){
            if(!map.containsKey(matches[i][0])){
                winners.add(matches[i][0]);
            }
        }

        List<Integer> lost = new ArrayList<>();
        for(int i:map.keySet()){
            if(map.get(i) ==1){
                lost.add(i);
            }
        }
        Collections.sort(lost);
        List<Integer> hashSet2 = new ArrayList<>(winners);
        Collections.sort(hashSet2);
        answer.add(hashSet2);
        answer.add(lost);
        return answer;
    }
}
