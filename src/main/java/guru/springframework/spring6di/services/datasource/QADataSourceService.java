package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class QADataSourceService implements DataSourceService {
    @Override
    public String getDataSourceName() {
        return "qa";
    }
}
