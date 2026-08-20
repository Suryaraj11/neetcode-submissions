class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++)
        {
            q.offer(stones[i]);
        }
        while(q.size()>1)
        {
            int a = q.poll();
            int b = q.poll();
            if(a==b)continue;
            q.offer(a-b);
        }
        q.offer(0);
        return q.poll();
    }
}
