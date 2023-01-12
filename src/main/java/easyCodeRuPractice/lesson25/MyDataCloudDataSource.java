package easyCodeRuPractice.lesson25;

import org.jetbrains.annotations.Nullable;

public class MyDataCloudDataSource implements DataSource<MyData> {

    @Nullable
    @Override
    public MyData getData() {
        return new MyData(1,"description_1");
    }

}
