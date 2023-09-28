package rest.spr.api.domain.curso;
/**CREATED BY Edgar M Gómez P
 * Backend Developer*/
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso,Long> {
    //Page<Curso> findByActivoTrue(Pageable paginacion); //esto me ayudara que el controler solo muestre los cursos que estan activos.
}
