class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int Xnear,Ynear;

        if(xCenter < x1)
            Xnear=x1;
        else if(xCenter > x2)
            Xnear=x2;
        else
            Xnear=xCenter;
        
        if (yCenter < y1)
            Ynear=y1;
        else if (yCenter > y2)
            Ynear=y2;
        else
            Ynear=yCenter;
        
        int dx = xCenter - Xnear;
        int dy = yCenter - Ynear;

        return Math.sqrt(dx * dx + dy * dy) <= radius;
    }
}