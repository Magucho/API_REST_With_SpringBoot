package rest.spr.api.domain.topicos;
/**CREATED BY Edgar M Gómez P
 * Backend Developer*/
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//Clases que adquieran esta interface estaran gerenciada por esta anotacion.
//Utilicelo cuando haya una tabla relacional que en este caso es Topicos que se relaciona con: autor, respuesta, curso.
public interface TopicosRepository extends JpaRepository<Topico,Long> {
}
