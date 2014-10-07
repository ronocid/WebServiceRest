package clases;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("InfoService") //esta ruta indica la clase a la que se accedera
public class Service {

	@GET 	//se indica el tipo del metodo que determina como se recibe la informacion en este caso es get
	@Path("/saludo/name={nombre}")	//la ruta que se indica para llamar al metodo y la estructura para mandar los parametros
	@Produces(MediaType.TEXT_XML)
	public String saludo (@PathParam("nombre") String nombre){
		return "Hola "+nombre;
	}
	

	@GET
	@Path("/suma/n1={valorn1}&n2={valorn2}")
	@Produces(MediaType.TEXT_XML)
	public String suma(@PathParam("valorn1") int n1,@PathParam("valorn2") int n2){
		return "El suma de "+n1 +"+"+n2+" es "+(n1+n2);
	}
}
