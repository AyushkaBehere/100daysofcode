class Solution {
    public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int len1= ax2-ax1;
        int breadth1= ay2-ay1;

        int len2 = bx2-bx1;
        int breadth2 = by2-by1;

        int area1 = len1*breadth1;
        int area2 = len2*breadth2;

        int htOvl = Math.min(ay2,by2);
        int bthOvl = Math.max(ay1,by1);

        int finalBth = htOvl - bthOvl;

        int htOvl2 = Math.min(ax2,bx2);
        int bthOvl2 = Math.max(ax1,bx1);

        int finalLen = htOvl2 - bthOvl2;

       // int finalarea = finalLen * finalBth;
         int finalarea=0;
         if(finalLen>0&&finalBth>0)
         {
            finalarea = finalLen * finalBth;
         }
        return area1 + area2 - finalarea;
    }


}