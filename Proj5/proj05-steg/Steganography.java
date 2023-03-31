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
    public static void setLow(Pixel p, Color c){
        clearLow(p);
        p.setRed((c.getRed())/64 + p.getRed());
        p.setBlue((c.getBlue())/64 + p.getBlue());
        p.setGreen((c.getGreen())/64 + p.getGreen());
        

    }
    public static Picture testSetLow(Picture p, Color c) {
        for (int x = 0; x < p.getWidth(); x++) {
            // loop through all y
            for (int y = 0; y < p.getHeight(); y++) {
                setLow(p.getPixel(x,y), c);
            }
        }
        return p;
    }
    
    public static Picture revealPicture(Picture hidden) {
        Picture copy = new Picture(hidden);
        Pixel[][] pixels = copy.getPixels2D();
        Pixel[][] source = hidden.getPixels2D();
        
        for (int r=0; r<pixels.length; r++) {
            for (int c=0; c<pixels[0].length; c++) {
                Color col = source[r][c].getColor();
            
                //copy.getPixel(c, r).setRed((col.getRed()%4)*64);
                //copy.getPixel(c, r).setGreen((col.getGreen()%4)*64);
                //copy.getPixel(c, r).setBlue((col.getBlue()%4)*64);
                //System.out.println(pixels[r][c].getRed()%64);
                //System.out.println((col.getRed()%4)*64);
                pixels[r][c].setRed((col.getRed()%4)*64+pixels[r][c].getRed()%64);
                pixels[r][c].setGreen((col.getGreen()%4)*64+pixels[r][c].getGreen()%64);
                pixels[r][c].setBlue((col.getBlue()%4)*64+pixels[r][c].getBlue()%64);

            }
        }
        
        return copy;
    }
    /*
    public static Picture revealPicture(Picture hidden) {
		Picture copy = new Picture(hidden);
		Pixel[][] pixels = copy.getPixels2D();
		Pixel[][] source = hidden.getPixels2D();
		for (int r = 0; r < pixels.length; r++) {
			for (int c = 0; c < pixels[0].length; c++) {
				Color col = source[r][c].getColor();
				pixels[r][c].setRed(pixels[r][c].getRed() % 64 + col.getRed() % 4 * 64);
				pixels[r][c].setBlue(pixels[r][c].getBlue() % 64 + col.getBlue() % 4 * 64);
				pixels[r][c].setGreen(pixels[r][c].getGreen() % 64 + col.getGreen() % 4 * 64);
			}
		}
		return copy;
	}
    */
    public static void main(String[] args) {
        Picture beach2 = new Picture ("beach.jpg");
        beach2.explore();
        Picture copy2 = testSetLow(beach2, Color.PINK);
        copy2.explore();
        Picture copy3 = revealPicture(copy2);
        copy3.explore();
    }
}