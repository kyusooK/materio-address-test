package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.SalesApplication;

@Entity
@Table(name = "SalesOrder_table")
@Data
//<<< DDD / Aggregate Root
public class SalesOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    public static SalesOrderRepository repository() {
        SalesOrderRepository salesOrderRepository = SalesApplication.applicationContext.getBean(
            SalesOrderRepository.class
        );
        return salesOrderRepository;
    }
}
//>>> DDD / Aggregate Root
