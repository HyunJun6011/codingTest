class Solution {
    public int solution(int chicken) {
        int serviceChicken = 0;
        int coupon = chicken;
        
        while (coupon >= 10) {
            serviceChicken += coupon / 10;
            coupon = (coupon % 10) + (coupon / 10);
        }
        return serviceChicken;
    }
}