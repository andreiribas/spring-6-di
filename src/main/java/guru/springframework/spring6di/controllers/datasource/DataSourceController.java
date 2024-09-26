package guru.springframework.spring6di.controllers.datasource;

import guru.springframework.spring6di.services.datasource.DataSourceService;
import org.springframework.stereotype.Controller;

@Controller
public class DataSourceController {

    private final DataSourceService dataSourceService;
    public DataSourceController(DataSourceService dataSourceService) {
        this.dataSourceService = dataSourceService;
    }
    public String getDatasourceName() {
        return dataSourceService.getDataSourceName();
    }
}
