package WEEK2.OOPS.live;

import WEEK2.OOPS.music.Playable;
import WEEK2.OOPS.string.Veena;
import WEEK2.OOPS.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
     Veena v = new Veena();
     v.play();;
     
     Saxophone s = new Saxophone();
     s.play();

     Playable p;
     p = new Veena();
     p.play();;

     p = new Saxophone();
     p.play();
    }
    
}
