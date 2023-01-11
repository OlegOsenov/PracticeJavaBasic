package easyCodeRuPractice.lesson25;



public class Repository extends DataSource{

    private final DataSource cloudDataSource;
    private final DataSource cachedDataSource;

    public Repository(DataSource cloudDataSource, DataSource cachedDataSource) {
        this.cloudDataSource = cloudDataSource;
        this.cachedDataSource = cachedDataSource;
    }


    @Override
    public MyData getData() {
        MyData result = cachedDataSource.getData();
        if (result == null){
            result = cloudDataSource.getData();
        }
        return result;
    }
}
