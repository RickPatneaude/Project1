//Rick Patneaude
//CS141
//This program prints various ascii drawings

public class Day01Methods {
   public static void main(String[] args) {
      System.out.println("This println is executed from the main.");
      //doSomething();
        drawHouse() ;
   }

   // this method will help us explore print vs println
   public static void doSomething() {
      System.out.println("Hello world!");
      System.out.print("Goodbye!");
      System.out.print("Where will this line show up?");
      System.out.println("Another line \\\\\\ of output");
      System.out.println();
      System.out.println("blank \"line\" above");
      System.out.println("Josie's On a Vacation Far Away");
      System.out.println("Come around and talk it over");
      System.out.print("So many things that I wanna say; ");
      System.out.print("You know I like my girls a little bit older");
   }

   // this method draws a single ascii box
   public static void drawBox() {
      System.out.println("+------+");
      System.out.println("|      |");
      System.out.println("|      |");
      System.out.println("+------+");
   }

   // this method draws a single ascii cone
   public static void drawCone() {
      System.out.println("   /\\");
      System.out.println("  /--\\");
      System.out.println(" /----\\");
      System.out.println("/------\\");
   }
   // this method draws the above cone in reverse
   public static void newCone() {
      System.out.println("\\------/");
      System.out.println(" \\----/");
      System.out.println("  \\--/");
      System.out.println("   \\/");
   }

   public static void drawHouse() {
      drawCone();
      drawBox() ;
      drawBox() ;
      newCone() ;
   }
}


/*
  ----jGRASP exec: java Day01Methods
 This println is executed from the main.
    /\
   /--\
  /----\
 /------\
 +------+
 |      |
 |      |
 +------+
 +------+
 |      |
 |      |
 +------+
 \------/
  \----/
   \--/
    \/
 
  ----jGRASP: operation complete.
 

*/