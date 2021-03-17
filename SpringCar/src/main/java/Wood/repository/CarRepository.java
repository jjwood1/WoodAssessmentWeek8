package Wood.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import Wood.beans.Car;
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}
