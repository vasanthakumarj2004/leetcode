class Solution {
    public int reverse(int x) {
        int sum = 0;
        boolean neg = false;
        int count = 0;
        if(x<0)
        {
           neg = true; 
        }
       
        if(neg){
            int a = x * -1;
            while(a>0){
                int digit = a%10;
                sum = sum * 10 +  digit;
                a = a/10;
                count++;
                if(count>9){
                    return 0;
                }
            }
        }else
        {
            while(x>0)
            {
            
            int digit = x%10;
            sum = sum * 10 +  digit;
            x = x/10;
            count++;
            if(count>9){
                return 0;
            }
            }
        }
            
            
        
        if(neg){
                return sum = sum - (sum * 2);
        }
        return sum;
        

    }
}
