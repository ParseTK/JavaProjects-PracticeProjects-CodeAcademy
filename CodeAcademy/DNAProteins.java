// Determines whether there is a protein in a strand of DNA
public class DNA {
  
  public static void main(String[] args) {
             
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";

    String dna = dna3;

    System.out.println(dna.length());
    System.out.println(dna.indexOf("ATG"));
    int atg = dna.indexOf("ATG");
    System.out.println(dna.indexOf("TGA"));
    int tga = dna.indexOf("TGA");

    if (atg != -1 &&
        tga != -1 &&
       (tga - atg) % 3 == 0) 
    {       
      String protein = dna.substring(atg, tga+3); 
      System.out.println("Protein: " + protein); 
    } else {
      System.out.println("No protein");
    }    
  } 
}
