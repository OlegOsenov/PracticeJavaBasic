package easyCodeRuPractice.lesson25;

import org.jetbrains.annotations.Nullable;

public class GeoDataCloudDataSorce implements DataSource<GeoData> {
    @Nullable
    @Override
    public GeoData getData() {
        return new GeoData(12, 52.12, 43.98);
    }
}
