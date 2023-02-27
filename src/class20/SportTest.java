package class20;

public class SportTest {

    public static void main(String[] args) {

        Cricket crick=new Cricket("Cricket","Pakistan","Greene Helmet");
        crick.display();

        Soccer soc=new Soccer("Soccer","Argentina","Oliver",22);
        soc.display();
        soc.displayTeam();
    }
}
