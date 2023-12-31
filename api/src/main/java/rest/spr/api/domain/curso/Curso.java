package rest.spr.api.domain.curso;
/**CREATED BY Edgar M Gómez P
 * Backend Developer*/
import jakarta.persistence.*;
import lombok.*;

//@Embeddable
@Table(name = "cursos") //nombre de la tabla en mysql
@Entity(name = "Curso")
@NoArgsConstructor //constructor sin atributos.
@AllArgsConstructor //constructor con todos los atributos.
@Getter //Construye los getters de las variables sin tener que escribir una por una,
@Setter //Construye todos los tters de las varibles sin tener que escribir una por una.
@EqualsAndHashCode(of= "id") // usa el parametro id para la comparaciones entre topicos
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Nombre nombre;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    //private Boolean actio;

    public Curso(DatosListadoCursoEspecifico datosListadoCursoEspecifico){ //estamos realizando
        this.nombre= Nombre.valueOf(datosListadoCursoEspecifico.nombre());
        this.categoria= Categoria.valueOf(datosListadoCursoEspecifico.categoria());
    }
    public Curso(DatosRegistroCurso datosRegistroCurso) {
        this.id= datosRegistroCurso.id();
        this.nombre= datosRegistroCurso.nombre();
        this.categoria= datosRegistroCurso.categoria();
    }

    public Curso(Long curso_id) {
        this.id=curso_id;
    }

    public void actualizarCurso(DatosActualizarCurso datosActualizarCurso) {
        if (datosActualizarCurso.nombre() != null) {
            this.nombre = datosActualizarCurso.nombre();
        }
        if (datosActualizarCurso.categoria() != null ) {
            this.categoria = datosActualizarCurso.categoria();
        }
    }
  //  public void desactivarCurso() {
    //  this.actio=true;
    //}
    /*@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Curso other = (Curso) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }*/
}
