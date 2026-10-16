import java.util.Scanner;


public class Main {

   public static void main(String []args) {
      System.out.println(".");
      //  other day, me and my mom went to see a movie together. Before heading there, we went to a really cute cafe place she's been excited to tell me about. She told me to get the things she said she suspected I would like, knowing how I can be often picky. I enjoyed it and we took many photos together and the food. Afterwards, we headed over to finally watch the movie and enjoyed that as well. 
      String title = "mom";
      String place1 = "movie";
      String adj1 = "cute";
      String place2 = "cafe";
      String item1 = "food";
      String verb1 = "enjoyed";
      String noun1 = "photos";
      String verb2 = "headed";
      String adj2 = "excited";

      String sentence1 = "The other day, me and my " + title + " went to see a " + place1 + " together."; 
      String sentence2 =" Before " + verb2 + " there, we went to a really " + adj1 + place2 + "place she's been" + adj2 + " to tell me about.";
      String sentence3 = "She told me to get the things she said she suspected I would like, knowing how I can be often picky."; 
      String sentence4 = "I " + verb1 + " it and we took many " + noun1 + " together and the " + item1 + ".";
      String sentence5 =  "Afterwards, we headed over to finally watch the " + place1 + " and " + verb1 + " that as well.";

      System.out.println( sentence1 + sentence2 + sentence3 + sentence4 + sentence5);
      
      //Part B
      Scanner scan = new Scanner(System.in);


      System.out.println();
      String name = scan.nextLine();
      System.out.println("The other day, me and my ");



   
     
     /* System.out.println("Hello. What is your name?");
      String name = scan.nextLine();
      System.out.println("Hello, " + name);  
      */ 
       
      

   /*
   
   System.out.print("Title used : ");
   String titleString = scan.nextLine();
   System.out.println("The other day, me and my " + titleString );
   System.out.println("Place Name :");  
   String place1String = scan.nextLine();
   System.out.print(" went to see a " + place1String);
   System.out.print(" together.");
   System.out.print("Verb used first : ");
   String verb1String = scan.nextLine();
   System.out.println(" Before " + verb1String );

   */
   


   }
}
