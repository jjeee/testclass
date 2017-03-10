import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Recipe {
    static String recName,filename;
    static private Scanner input;
    static ArrayList<Ingredients> ingList=new ArrayList<>();
    static ArrayList<Directions> direcList=new ArrayList<>();

    public Recipe(String filename) throws IOException{
        this.filename=filename;
        input=new Scanner(new File(filename));

        popIngre();
        System.out.println(ingList.toString());

        /*for (Ingredients thing:ingList) {
            System.out.println(thing);
        }*/
    }

    static public ArrayList<Ingredients> popIngre(){
        while (input.hasNextLine()){
            String sample=input.nextLine();
            String sample2[]=sample.split(",");
            String measure=sample2[0];
            String unit=sample2[1];
            String name=sample2[2];

            ingList.add(new Ingredients(measure,unit,name));
        }
        return ingList;
    }

    public static String getFilename() {
        return filename;
    }

    public static void setFilename(String filename) {
        Recipe.filename = filename;
    }
}
