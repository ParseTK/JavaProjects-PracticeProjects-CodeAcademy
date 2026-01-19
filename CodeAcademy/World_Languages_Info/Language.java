public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

  public Language(String name, 
                  int numSpeakers, 
                  String regionsSpoken, 
                  String wordOrder) {
    this.name = name;
    this.numSpeakers = numSpeakers;
    this.regionsSpoken = regionsSpoken;
    this.wordOrder = wordOrder;
  }
  public void getInfo() {
    System.out.println(this.name + " is spoken by " + 
                       this.numSpeakers + " people mainly in " + 
                       this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder);
  }
  public static void main(String[] args) {
    Language french = new Language("French", 
                                   321_000_000, 
                                   "Africa", 
                                   "Subject-Verb-Object");
    
    french.getInfo();
    System.out.println();
    
    Mayan achi = new Mayan("Achi", 120_000);
    
    achi.getInfo();
    System.out.println();
    
    SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 
                                           1_400_000_000);
    
    SinoTibetan burmese = new SinoTibetan("Burmese", 
                                          43_000_000);
    
    burmese.getInfo();
    System.out.println();
    mandarin.getInfo();
  }
}
