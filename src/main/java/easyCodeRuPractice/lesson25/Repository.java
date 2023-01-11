package easyCodeRuPractice.lesson25;


import org.jetbrains.annotations.NotNull;

public class Repository implements DataSource{

    private final DataSource cloudDataSource;
    private final MutableDataSource cachedDataSource;

    public Repository(DataSource cloudDataSource, MutableDataSource cachedDataSource) {
        this.cloudDataSource = cloudDataSource;
        this.cachedDataSource = cachedDataSource;
    }


    @Override
    public MyData getData() {
        MyData result = cachedDataSource.getData();
        if (result == null){
            result = cloudDataSource.getData();
           cachedDataSource.saveData(result);
        } else {
            System.out.println("getting from cache");
        }
        return result;
    }

}
