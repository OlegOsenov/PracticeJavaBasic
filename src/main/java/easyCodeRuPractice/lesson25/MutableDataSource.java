package easyCodeRuPractice.lesson25;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface MutableDataSource<T> extends DataSource {
    void saveData(@NotNull T data);
}
