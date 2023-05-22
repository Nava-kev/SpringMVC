package ico.fes.intro.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Empleados {
    private  String nombre;
    private String fechaNacimento;
    private  int id;
    private double sueldo;
    private String departamento;
}
