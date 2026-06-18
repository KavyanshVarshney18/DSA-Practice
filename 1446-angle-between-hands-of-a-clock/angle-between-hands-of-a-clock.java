class Solution {
    public double angleClock(int hour, int minutes) {
        double hourangle = 30.0 * hour + 0.5 * minutes;
        double minuteangle = 6.0 * minutes;

        double diff = Math.abs(hourangle - minuteangle);
        return Math.min(diff, 360 - diff);
    }
}