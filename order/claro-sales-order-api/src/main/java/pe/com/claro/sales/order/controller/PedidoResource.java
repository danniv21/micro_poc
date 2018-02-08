package pe.com.claro.sales.order.controller;
/*package pe.com.sales.order.controller;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

import pe.com.claro.common.resource.exception.BadUsageException;

@Stateless
@Path("/ventas/pedidos/v2.0.0/pedidos")
@Api(value = "/pedidos", description = "Operaciones sobre pedidos")
@Produces({ "application/json" })
public class PedidoResource {

	@GET
	@Path("/{id_pedido}")
	@ApiOperation(value = "Buscar pedido por ID", notes = "Retorna un pedido cuando el ID > 0 "
			+ "de lo contrario devolvera error", response = String.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Id invalido"),
			@ApiResponse(code = 404, message = "Pedido no encontrado") })
	public Response getClienteById(
			@ApiParam(value = "El Id del pedido debera estar dentro del rango", allowableValues = "range[1,10]",
			required = true) @PathParam("id_pedido") Long id_pedido)throws BadUsageException {
	
			return Response.ok().entity("pedido numero "+ id_pedido).build();
	}	
}*/
