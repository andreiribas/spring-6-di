package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("dev")
@Service
public class DevDataSourceService implements DataSourceService {
    @Override
    public String getDataSourceName() {
        return "dev";
    }
}
