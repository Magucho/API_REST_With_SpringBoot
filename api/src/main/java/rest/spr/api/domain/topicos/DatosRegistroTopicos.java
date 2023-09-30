package rest.spr.api.domain.topicos;
/**CREATED BY Edgar M Gómez P
 * Backend Developer*/
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosRegistroTopicos(
        Long id,
        @NotNull
        String titulo,
        @NotNull
        String mensaje,
        @NotNull
        LocalDateTime fecha,
        @NotNull
        StatusTopico status,
        @NotNull
        Long autor_id,
        @NotNull
        Long curso_id,
        @NotNull
        Long respuesta_id) {
}
