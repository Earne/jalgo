/**
 * Find the total area covered by two rectilinear rectangles in a 2D plane.
 * <p/>
 * Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
 */
public class RectangleArea {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int left = Math.max(A, E);
        int right = Math.min(C, G);
        int bottom = Math.max(B, F);
        int top = Math.min(D, H);
        int tmp = 0;
        if (left < right && bottom < top)
            tmp = (right - left) * (top - bottom);
        return (C - A) * (D - B) + (G - E) * (H - F) - tmp;
    }
}
