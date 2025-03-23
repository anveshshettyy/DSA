int missingNumber(int* nums, int numsSize) {
    int sum = 0;
    int actualSum = numsSize *(numsSize+1) / 2;
    for(int i=0; i<numsSize; i++) {
        sum += nums[i];
    }
    actualSum = actualSum - sum;
    return actualSum;
}