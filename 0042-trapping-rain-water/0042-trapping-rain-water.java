class Solution {
    public int trap(int[] height) {
     int left=0;
     int right=height.length-1;
     int twater=0;
     int Maxleft=0;
     int rightmax=0;
     while(left<right){
        if (height[left] < height[right]) {
                if (height[left] >= Maxleft)
                    Maxleft = height[left];
                else
                    twater += Maxleft - height[left];
                left++;
            } else {
                if (height[right] >= rightmax)
                    rightmax = height[right];
                else
                    twater += rightmax - height[right];
                right--;
            }
        }
        return twater;
    }
}