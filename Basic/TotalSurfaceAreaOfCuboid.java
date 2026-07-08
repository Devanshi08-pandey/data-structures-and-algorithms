public class TotalSurfaceAreaOfCuboid {
    public static void main(String[] args) {
        //2(lb*bh*lh)
        int l=5;//length
        int b=3;//breadth
        int h=7;//height
        int lb=l*b;
        int bh=b*h;
        int lh=l*h;
        int tsa=2*(lb+bh+lh);
        System.out.println(tsa);
    }
}
