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
      System.out.println("Name used : ");
      String name = scan.nextLine();
      System.out.println("Place Name :");  
      String place1String = scan.nextLine();
      System.out.print("Adjective used first : ");
      String adj1String = scan.nextLine();
     System.out.println("Other place name : ");
     String place2String = scan.nextLine();
     System.out.println("Verb used: ");
     String verb1String = scan.nextLine();
     System.out.println("Second verb used: ");
     String verb2String = scan.nextLine();
     System.out.println("Noun used: ");
     String noun1String = scan.nextLine();

  System.out.println("The other day, me and my " + name + 
         " went to see a " + place1String + " together. Before heading there, we went to see a really " + adj1String + " " + place2String + " that she's been " + verb1String + " to tell me about. She told me to get the things she suspected I would like, knowing how I can be often picky. I " + verb2String + " it and we took many " + noun1String + " together before we finally headed to see the " + place1String + " " + "and enjoyed that as well." );
   scan.close();


   }
}
