package class18;

public class Main {

    static int instanceCount = 0;

    public Main() {
        instanceCount++;
    }

    static int getInstanceCount() {
        return instanceCount;
    }

    public static void main(String[] args) {

        Main e1261 = new Main();
        Main e1262 = new Main();
        Main e1263 = new Main();
        System.out.println(Main.getInstanceCount());
    }
}