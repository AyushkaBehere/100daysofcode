
class Solution {
    public int[][] merge(int[][] intervals) {
        // Sort the intervals by the start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Create a list to store the merged intervals
        List<int[]> merged = new ArrayList<>();

        // Start with the first interval
        int[] current = intervals[0];

        // Go through each interval
        for (int i = 1; i < intervals.length; i++) {
            // If the current interval overlaps with the next one
            if (intervals[i][0] <= current[1]) {
                // Merge them by updating the end time
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                // If no overlap, add the current interval to the list
                merged.add(current);
                // Move to the next interval
                current = intervals[i];
            }
        }

        // Add the last interval to the list
        merged.add(current);

        // Convert the list to a 2D array and return
        return merged.toArray(new int[merged.size()][]);
    }
}
