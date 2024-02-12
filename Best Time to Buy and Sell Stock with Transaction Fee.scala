class Solution {
public:
    int maxProfit(vector<int>& p, int fee) {
        //see buy and sell stock with cooldown
        int buy=-p[0]-fee,sell=0;
        for(int i=1;i<p.size();i++){
          buy=max(buy,sell-p[i]-fee);
            sell=max(sell,buy+p[i]);
        }
        
        return sell;
    }
};
