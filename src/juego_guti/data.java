package juego_guti;

public class data {
	public static String version = "0.0.1a";
	public static int hp = 100;
	public static int hpmax = 100;
	public static int oro = 0;
	
	public static void espacios(){
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
	public void estadisticas(){
		System.out.println("-------------------------------");
		System.out.println("Estadisticas actuales " +data.hp+ "HP/" +data.hpmax+"HP --" +data.oro+" gold");
		System.out.println("-------------------------------");
	}
}
