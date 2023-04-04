import java.awt.Color;
import java.util.ArrayList;
import java.awt.Point;
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
            
                pixels[r][c].setRed((col.getRed()%4)*64);//+pixels[r][c].getRed()%64);
                pixels[r][c].setGreen((col.getGreen()%4)*64);//+pixels[r][c].getGreen()%64);
                pixels[r][c].setBlue((col.getBlue()%4)*64);//+pixels[r][c].getBlue()%64);
            }
        }
        
        return copy;
    }

    public static boolean canHide(Picture source, Picture secret) {
        return (!((source.getWidth()<secret.getWidth()) || (source.getHeight()<secret.getHeight())));
    }

    public static Picture hidePicture(Picture source, Picture secret) {
        Picture copy = new Picture(source);
        Pixel[][] pixels = copy.getPixels2D();
        Pixel[][] hidden = secret.getPixels2D();
        for (int r=0; r<pixels.length; r++) {
            for (int c=0; c<pixels[0].length; c++) {
                Color col = hidden[r][c].getColor();
                setLow(pixels[r][c], col);
            }
        }
        return copy;
    }
    public static Picture hidePicture(Picture source, Picture secret, int startRow, int startColumn) {
        Picture copy = new Picture(source);
        Pixel[][] pixels = copy.getPixels2D();
        Pixel[][] hidden = secret.getPixels2D();
        //System.out.println(startRow+" dis startrow");
        //System.out.println(startColumn+" dis startcol");
        //System.out.println(hidden[0].length+" dis num hidden cols");
        for (int r=startRow; r<startRow+hidden.length; r++) {
            for (int c=startColumn; c<startColumn+hidden[0].length; c++) {
                //System.out.println(r-startRow);
                //System.out.println((c-startColumn)+ "this is c-startcol");
                Color col = hidden[r-startRow][c-startColumn].getColor();
                setLow(pixels[r][c], col);
            }
        }
        return copy;
    }
    public static boolean isSame(Picture pic1, Picture pic2) {
        if (!((pic1.getWidth()==pic2.getWidth()) && (pic1.getHeight()==pic2.getHeight()))) {
            return false;
        }
        Pixel[][] a = pic1.getPixels2D();
        Pixel[][] b = pic2.getPixels2D();
        for (int r=0; r<a.length; r++) {
            for (int c=0; c<a[0].length; c++) {
                if (!(a[r][c].getColor().equals(b[r][c].getColor()))) return false;
            }
        }
        return true;
    }
    public static ArrayList<Point> findDifferences(Picture pic1, Picture pic2)  {
        ArrayList<Point> diffs = new ArrayList<Point>();
        if (isSame(pic1, pic2)) return diffs;
        if ((!((pic1.getWidth()==pic2.getWidth()) && (pic1.getHeight()==pic2.getHeight())))) return diffs;
        Pixel[][] a = pic1.getPixels2D();
        Pixel[][] b = pic2.getPixels2D();
        for (int r=0; r<a.length; r++) {
            for (int c=0; c<a[0].length; c++) {
                if (!(a[r][c].getColor().equals(b[r][c].getColor()))) {
                    Point p = new Point(r, c);
                    diffs.add(p);
                }
            }
        }
        return diffs;
    }
    public static Picture showDifferentArea(Picture pic, ArrayList<Point> pointList) {
        Picture copy = new Picture(pic);
        Pixel[][] pixar = copy.getPixels2D();
        int minRow = pic.getHeight()-1;
        int minCol = pic.getWidth()-1;
        int maxRow=0, maxCol=0;
        for(Point p: pointList) {
            if ((int)p.getX()<minCol) minCol = (int)p.getX();
            if ((int)p.getY()<minRow) minRow = (int)p.getY();
            if ((int)p.getX()>maxCol) maxCol = (int)p.getX();
            if ((int)p.getY()>maxRow) maxRow = (int)p.getY();
        }
        /*System.out.println("minRow: "+minRow);
        System.out.println("maxRow: "+maxRow);
        System.out.println("minCol: "+minCol);
        System.out.println("maxCol: "+maxCol);*/
        for(int i=minCol; i<=maxCol; i++) {
            pixar[i][minRow].setColor(Color.RED);
            pixar[i][maxRow].setColor(Color.RED);
        }
        for(int i=minRow; i<=maxRow; i++) {
            pixar[minCol][i].setColor(Color.RED);
            pixar[maxCol][i].setColor(Color.RED);
        }
        return copy;
    }
    public static void main(String[] args) {
        //ACT1
        /* 
        Picture beach2 = new Picture ("beach.jpg");
        beach2.explore();
        Picture copy2 = testSetLow(beach2, Color.PINK);
        copy2.explore();
        Picture copy3 = revealPicture(copy2);
        copy3.explore();
        */ 
        //ACT2
        /*
        Picture beach = new Picture("beach.jpg");
        Picture arch = new Picture("arch.jpg");
        System.out.println ("beach same size as arch: " + canHide(beach, arch));
        Picture swan = new Picture("swan.jpg"); 
        Picture gorge = new Picture("gorge.jpg"); 
        swan.explore();
        gorge.explore();      

        if (canHide(swan, gorge)) {
            Picture combined = hidePicture(swan, gorge); 
            combined.explore();
            Picture revealed = revealPicture(combined);
            revealed.explore();
        }
        */
        //ACT 3
        /*
        Picture beach = new Picture("beach.jpg");
        Picture robot = new Picture("robot.jpg");
        Picture flower1 = new Picture("flower1.jpg");
        beach.explore();

        // these lines hide 2 pictures
        Picture hidden1 = hidePicture(beach, robot, 65, 208);
        hidden1.explore();
        Picture hidden2 = hidePicture(hidden1, flower1, 280, 110);
        hidden2.explore();

        Picture unhidden = revealPicture(hidden2);
        unhidden.explore();
        */
        /*
        Picture swan = new Picture("swan.jpg");
        Picture swan2 = new Picture("swan.jpg");
        System.out.println("swan & swan2 are the same: " + isSame(swan, swan2));
        swan = testClearLow(swan);
        System.out.println("swan & swan2 are the same (after clearLow run on swan): " + isSame(swan, swan2));
        */
        /*
        Picture arch = new Picture("arch.jpg");
        Picture koala = new Picture("koala.jpg");
        Picture robot1 = new Picture("robot.jpg");
        ArrayList<Point> pointList = findDifferences(arch, arch); 
        System.out.println("PointList after comparing two identical pictures " + "has a size of " + pointList.size());
        pointList = findDifferences(arch, koala);
        System.out.println("PointList after comparing two different sized pictures " + "has a size of " + pointList.size());
        Picture arch2 = hidePicture(arch, robot1, 65, 102);
        pointList = findDifferences(arch, arch2); 
        System.out.println("Pointlist after hiding a picture has a size of " + pointList.size());

        Picture arch_none = revealPicture(arch);
        arch_none.explore();
        Picture arch_robot = revealPicture(arch2);
        arch_robot.explore();
        */
        /*
        Picture hall = new Picture("femaleLionAndHall.jpg"); 
        Picture robot2 = new Picture("robot.jpg");
        Picture flower2 = new Picture("flower1.jpg");
        // hide pictures
        Picture hall2 = hidePicture(hall, robot2, 50, 300); 
        Picture hall3 = hidePicture(hall2, flower2, 115, 275); 
        //hall3.explore();
        if(!isSame(hall, hall3)) {
        Picture hall4 = showDifferentArea(hall, findDifferences(hall, hall3));
        hall4.show();
            Picture unhiddenHall3 = revealPicture(hall3); 
            unhiddenHall3.show();
        }
        */
        // Activity 3
        // 4 picture windows should open
        // 5 print statements should show in Terminal
                        
        // Q1: hidePicture - version 2!
        Picture beach = new Picture("beach.jpg");
        Picture robot = new Picture("robot.jpg");
        Picture flower1 = new Picture("flower1.jpg");
        //beach.explore();

        // these lines hide 2 pictures
        Picture hidden1 = hidePicture(beach, robot, 65, 208);
        Picture hidden2 = hidePicture(hidden1, flower1, 280, 110);
        //hidden2.explore();

        Picture unhidden = revealPicture(hidden2);
        unhidden.explore();

        //Q2: isSame
        Picture swan = new Picture("swan.jpg");
        Picture swan2 = new Picture("swan.jpg");
        System.out.println("1) swan & swan2 are the same: " + isSame(swan, swan2));
        swan = testClearLow(swan);
        System.out.println("2) swan & swan2 are the same (after clearLow run on swan): " + isSame(swan, swan2));
                
        // Q3: findDifferences
        Picture arch = new Picture("arch.jpg");
        Picture koala = new Picture("koala.jpg");
        Picture robot1 = new Picture("robot.jpg");
        ArrayList<Point> pointList = findDifferences(arch, arch); 
        System.out.println("3) PointList after comparing two identical pictures " + "has a size of " + pointList.size());
        pointList = findDifferences(arch, koala);
        System.out.println("4) PointList after comparing two different sized pictures " + "has a size of " + pointList.size());
        Picture arch2 = hidePicture(arch, robot1, 65, 102);
        pointList = findDifferences(arch, arch2); 
        System.out.println("5) Pointlist after hiding a picture has a size of " + pointList.size());

        Picture arch_none = revealPicture(arch);
        //arch_none.explore();
        Picture arch_robot = revealPicture(arch2);
        arch_robot.explore();

        // Q4: showDifferentArea
        Picture hall = new Picture("femaleLionAndHall.jpg"); 
        Picture robot2 = new Picture("robot.jpg");
        Picture flower2 = new Picture("flower1.jpg");
        // hide pictures
        Picture hall2 = hidePicture(hall, robot2, 50, 300); 
        Picture hall3 = hidePicture(hall2, flower2, 115, 275); 
        //hall3.explore();
        if(!isSame(hall, hall3)) {
        Picture hall4 = showDifferentArea(hall, findDifferences(hall, hall3)); 
            hall4.show();
            Picture unhiddenHall3 = revealPicture(hall3); 
            unhiddenHall3.show();
        }        
    }
}