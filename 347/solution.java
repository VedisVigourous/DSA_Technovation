class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] result = new int [k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int elem: nums){
            map.put(elem, map.getOrDefault(elem,0)+1);
        }

        Queue<Integer> minHeap = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));
        for(int keys: map.keySet()){
            minHeap.add(keys);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        while(k-- > 0){
            result[k] = minHeap.poll();
        }

        return result;
    }
}
