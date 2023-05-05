package Repository;

import Entity.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransportRepository extends JpaRepository<Equipment,Long> {

}
