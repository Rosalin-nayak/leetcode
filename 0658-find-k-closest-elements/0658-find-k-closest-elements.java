class Pair implements Comparable<Pair>{
    int diff;
    int ele;
    Pair(int diff,int ele){
        this.diff=diff;
        this.ele=ele;
    }
    public int compareTo(Pair p){
        if(this.diff!=p.diff){
            return this.diff-p.diff;
        }
        return this.ele-p.ele;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int el:arr){
            int diff=Math.abs(el-x);
            pq.add(new Pair(diff,el));
            if(pq.size()>k){
                pq.remove();
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<k;i++){
            Pair top=pq.remove();
            list.add(top.ele);
        }
        Collections.sort(list);
        return list;
    }
}