int maxArea(int* height, int heightSize) {
    int l = 0, r = heightSize-1, max_sum = 0;
    while( l<r ){
        int curr_sum = (fmin(height[l],height[r]))*(r-l);
        if( curr_sum > max_sum ) max_sum = curr_sum;
        if(height[l] < height[r]) l++;
        else r--;
    }
    return max_sum;
}