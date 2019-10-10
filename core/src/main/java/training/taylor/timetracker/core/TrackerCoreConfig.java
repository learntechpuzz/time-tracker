package training.hakkim.timetracker.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import training.hakkim.timetracker.core.dao.TimeEntry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hakkim
 */
@Configuration
@ComponentScan("training.hakkim.timetracker.core")
public class TrackerCoreConfig {

    @Bean(name = "timesheet")
    public List<TimeEntry> timeEntries() {
        return new ArrayList<>();
    }
}
