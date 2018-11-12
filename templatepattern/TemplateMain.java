/**
 * Created by lenovo on 2018/11/12.
 */
public class TemplateMain {
    public static void main(String[] args) {
        Game game = new Run();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
