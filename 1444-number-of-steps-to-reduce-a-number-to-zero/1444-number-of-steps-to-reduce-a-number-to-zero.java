class Solution {
    int step = 0;
    public int numberOfSteps(int num) 
    {
        
        if(num == 0)
        return step;

        step++;

        if(num%2 == 0)
        return numberOfSteps(num/2);
        else
        return numberOfSteps(num-1);
        
    }
}