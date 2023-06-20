public static long largestRectangle(List<Integer> h) {
    // Write your code here
        long max = 0;
        for(int i =0; i<h.size(); i++){
            long count = 1;
            int curr = h.get(i);
            for(int j = i+1; j<h.size(); j++){
                if(curr > h.get(j))
                    break;
                count++;
            }
            for(int j=i-1; j>=0; j--){
                if(curr > h.get(j))
                    break;
                count++;
            }
            long sum = count * curr;
            if(sum>max)
                max = sum;
        }
        return max;
    }
