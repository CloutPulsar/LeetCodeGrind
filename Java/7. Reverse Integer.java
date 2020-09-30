class Solution {
    public int reverse(int x) {
        if(x > Integer.MAX_VALUE || x <= Integer.MIN_VALUE)
            return 0;
        int res = 0;
        int sign = (x < 0) ? -1 : 1;
        int tmp = Math.abs(x);
        int size = String.valueOf(tmp).length();
        Queue<Integer> list = new LinkedList<>();
        
        for(int i = 0; i < size; i++){
            list.add(tmp % 10);
            tmp /= 10;
        }
        
       for(int i = size-1; !list.isEmpty(); i--){
           int popped = list.remove();
           if(((long)res + Math.pow(10, i) * popped) > Integer.MAX_VALUE)
               return 0;
           else
            res = res + (int) Math.pow(10, i) * popped;
       }
        return sign * (int)res;
    }
}
