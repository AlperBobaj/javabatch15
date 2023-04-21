package class18;

public class Task1Tester {

    static int instanceCount = 0;

    public Task1Tester() {
        instanceCount++;
    }

    static int getInstanceCount() {
        return instanceCount;
    }

    public static void main(String[] args) {

        Task1Tester e1261 = new Task1Tester();
        Task1Tester e1262 = new Task1Tester();
        Task1Tester e1263 = new Task1Tester();
        System.out.println(Task1Tester.getInstanceCount());
    }
}