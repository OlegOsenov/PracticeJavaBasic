package easyCodeRuPractice.lesson25;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CloudDataSource implements DataSource {

    @Nullable
    @Override
    public MyData getData() {
        return new MyData(1,"description_1");
    }

}