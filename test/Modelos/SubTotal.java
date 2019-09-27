/*
 TODOS
 */
package modelos;

import P01Mod3Ventas.Modificar;
import P01Mod3Ventas.Listar;
import P01Mod3Ventas.Eliminar;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(
        {
            Listar.class,
            Agregar.class,
            Modificar.class,
            Eliminar.class
        }
)
public class SubTotal {

}
