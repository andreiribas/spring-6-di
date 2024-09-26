package guru.springframework.spring6di.controllers.datasource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("qa")
@SpringBootTest
class QAProfileDataSourceControllerTest {
    @Autowired
    private DataSourceController dataSourceController;

    @Test
    void getDatasourceName() {
        var dataSource = dataSourceController.getDatasourceName();
        assertEquals("qa", dataSource);
    }
}
