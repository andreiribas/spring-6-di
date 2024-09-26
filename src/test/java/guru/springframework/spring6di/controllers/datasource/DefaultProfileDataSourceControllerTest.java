package guru.springframework.spring6di.controllers.datasource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DefaultProfileDataSourceControllerTest {
    @Autowired
    private DataSourceController dataSourceController;

    @Test
    void getDatasourceName() {
        var dataSource = dataSourceController.getDatasourceName();
        assertEquals("dev", dataSource);
    }
}
