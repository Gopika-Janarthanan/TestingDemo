package Assessment;

import java.util.ArrayList;
import java.util.List;

public interface Songs {
    void play();
}
class Tamil implements Songs{

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String author;
    @Override
    public void play() {
        System.out.println("Tamil song plays");
    }


}
class English implements  Songs{
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String author;
    @Override
    public void play() {
        System.out.println("English song plays");
    }
}
class SongsMain {
    public static void main(String[] args) {
        Tamil t1 = new Tamil();
        English e1 = new English();
        Tamil t2 = new Tamil();
        English e2 = new English();

        t1.setTitle("Tamil song 1");
        System.out.println(t1.getTitle());
        t1.setAuthor("Tamil author 1");
        System.out.println(t1.getAuthor());

        e1.setTitle("English song 1");
        System.out.println(e1.getTitle());
        e1.setAuthor("English author 1");
        System.out.println(e1.getAuthor());

        t2.setTitle("Tamil song 2");
        System.out.println(t2.getTitle());
        t2.setAuthor("Tamil author 2");
        System.out.println(t2.getAuthor());

        e2.setTitle("English song 2");
        System.out.println(e2.getTitle());
        e2.setAuthor("English author 2)");
        System.out.println(e2.getAuthor());

        List<Songs> playlist = new ArrayList<>();
        playlist.add(t1);

        playlist.add(e1);
        playlist.add(t2);
        playlist.add(e2);
        System.out.println();
        System.out.println("Play songs :-");
        for (Songs s : playlist){
            s.play();
        }

    }
}