package easyCodeRuPractice.lesson25;

public class Play {
    public static void main(String[] args) {
        DataSource repository = new Repository(
                new CloudDataSource(),
                new CachedDataSource()
        );
        MyData data = repository.getData();
        System.out.println(data.toString());
    }

    private static MyData getMyData() {
        return null;
    }
}
