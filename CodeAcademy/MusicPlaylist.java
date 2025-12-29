import java.util.ArrayList;
import java.util.Arrays;

class Playlist {
  public static void main(String[] args) {
    String[] favoriteSongs = {
      "silk - dfgdfg",
      "tilk - fgsdf",
      "filk - dsfs",
      "lilk - aa",
      "rilk - hjj",
      "dilk - sd",
      "ailk - l",
      "oilk - lolol",
      "pilk - gdf",
      "milk - dghhhjj"
    };

    System.out.println(favoriteSongs[0]);
    System.out.println(favoriteSongs[1]);
    System.out.println(favoriteSongs[2]);

    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    desertIslandPlaylist.add("123 - dfgsdfdfg");
    desertIslandPlaylist.add("456 - fgssdfsdfdf");
    desertIslandPlaylist.add("789 - dssdffsfs");
    desertIslandPlaylist.add("987 - asdfsdfs");
    desertIslandPlaylist.add("654 - hjsdfsdffj");

    System.out.println(desertIslandPlaylist);

    desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));

    System.out.println(desertIslandPlaylist.size());

    while (desertIslandPlaylist.size() > 10) {
      desertIslandPlaylist.remove(desertIslandPlaylist.size() - 1);
    }

    System.out.println(desertIslandPlaylist);

    String songA = desertIslandPlaylist.get(0);
    String songB = desertIslandPlaylist.get(1);

    int indexA = desertIslandPlaylist.indexOf(songA);
    int indexB = desertIslandPlaylist.indexOf(songB);

    String tempA = songA;

    desertIslandPlaylist.set(indexA, songB);
    System.out.println(desertIslandPlaylist);

    desertIslandPlaylist.set(indexB, tempA);

    System.out.println(desertIslandPlaylist);
  }
}
