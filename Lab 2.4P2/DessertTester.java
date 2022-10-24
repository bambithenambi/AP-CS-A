/* LAB 2.4, Part II: Inheritance - Dessert Hierarchy
 * LAB PARTNER A: Abhijit Nambiar 
 * LAB PARTNER B: Rushil Kumar
 * PERIOD #: 7
 */
public class DessertTester {
	public static void main(String[] args) {
		System.out.println("** Sweet 1 Tests - Dessert **");
		// Your tests here
		Dessert d = new Dessert();
		System.out.println(d.getName());
		Dessert d2 = new Dessert("Sweet tooth", 500);
		System.out.println(d2.getCalories());
		System.out.println(Dessert.getNumDesserts());

		System.out.println("\n** Sweet 2 Tests - Brownie **");
		Dessert b = new Brownie();
		Dessert b2 = new Brownie();
		System.out.println(b2.getCalories());
		System.out.println(Brownie.getNumBrownies());
		System.out.println(Dessert.getNumDesserts());

		System.out.println("\n** Sweet 3 Tests - Pie **");
		Dessert p = new Pie("Pecan", 117);
		Dessert p2 = new Pie("Pumpkin", 323);
		System.out.println(p.getName());
		System.out.println(p2.getCalories());
		System.out.println(Dessert.getNumDesserts());

		System.out.println("\n** Sweet 4 Tests - Cookie **");
		// Your tests here
		Dessert cookie = new Cookie("Double Chocolate", 140);
		Dessert cc = new Cookie();
		System.out.println(cookie.getCalories());
		System.out.println(cc.getCalories());
		System.out.println(Dessert.getNumDesserts());
		
		// Given - uncomment block when ready to test
		
		Cake cake = new Cake("Ice cream", 150);
		System.out.println("Object Creation: " + cake);
		System.out.println("Name: " + cake.getName());
		System.out.println("Number of Desserts: " + Dessert.getNumDesserts());
		

		System.out.println("\n** Sweet 6 Tests - Apple Pie **");
		// Given - uncomment block when ready to test
		
		ApplePie ap = new ApplePie(3);
		System.out.println("Object Creation: " + ap);
		ap.eatSlice();
		ap.eatSlice();
		ap.eatSlice();
		System.out.println("Object Creation: " + ap);
		ap.eatSlice();
		System.out.println("Object Creation: " + ap);
		System.out.println("Number of Desserts: " + Dessert.getNumDesserts());
	

		System.out.println("\n** Sweet 7 Tests - Black Forest Cake **");
		// Place tests here
		BlackForestCake bfc = new BlackForestCake(true);
		System.out.println("Object Creation: " + bfc);
		System.out.println(bfc.isReal());
		BlackForestCake bfc2 = new BlackForestCake(false);
		System.out.println("Object Creation: " + bfc2);
		System.out.println(bfc2.isReal());
		System.out.println("Number of Desserts: " + Dessert.getNumDesserts());
	}
}