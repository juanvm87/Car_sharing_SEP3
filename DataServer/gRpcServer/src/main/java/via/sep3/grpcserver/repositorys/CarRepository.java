package via.sep3.grpcserver.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import via.sep3.grpcserver.Entities.Car;
import via.sep3.grpcserver.Entities.User;

import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car,Integer> {
    Car findCarByDriver_Email(String email);

}
