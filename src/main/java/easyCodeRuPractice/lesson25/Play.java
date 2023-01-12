package easyCodeRuPractice.lesson25;

public class Play {
    public static void main(String[] args) {
        DataSource<MyData> myDataDataSource = new Repository<>(
                new MyDataCloudDataSource(),
                new CachedDataSource<>()
        );

        DataSource<GeoData> geoDataDataSource = new GeoRepository(
                new GeoDataCloudDataSorce(),
                new CachedDataSource<>()
        );

        MyData data = myDataDataSource.getData();
        GeoData geoData = geoDataDataSource.getData();
        System.out.println(data.toString());
        System.out.println(geoData.toString());
    }

    private static MyData getMyData() {
        return null;
    }
}
