import java.awt.Color;

import javax.management.loading.PrivateClassLoader;

public class Steganography {
    /**
    * Clear the lower (rightmost) two bits in a pixel.
    */
    public static void clearLow(Pixel p )
    {
        p.setRed((p.getRed()/4)*4);
        p.setGreen((p.getGreen()/4)*4);
        p.setBlue((p.getBlue()/4)*4);
    }
    public static Picture testClearLow(Picture p) {
        for (int x = 0; x < p.getWidth(); x++) {
            // loop through all y
            for (int y = 0; y < p.getHeight(); y++) {
                clearLow(p.getPixel(x,y));
            }
        }
        return p;
    }
    public static void main(String[] args) {
        Picture beach = new Picture ("beach.jpg");
        beach.explore();
        Picture copy = testClearLow(beach);
        copy.explore();
    }
}