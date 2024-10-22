package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;

import daos.DaoCategoria;
import daos.DaoProducto;
import daos.DaoPunto;
import entidades.Categoria;
import entidades.Producto;

/**
 * Servlet implementation class ControllerAdmin
 */
public class ControllerAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		String operacion = request.getParameter("operacion");
		
		switch (operacion) {
		case "iniciar":
			
			ArrayList<Categoria> listaCategorias = new ArrayList<Categoria>();
			DaoCategoria daoCategoria = new DaoCategoria();
			
			listaCategorias = daoCategoria.obtenerListaCategorias();
			session.setAttribute("listadoCategorias", listaCategorias);
			request.getRequestDispatcher("home.jsp").forward(request, response);
			break;

		case "obtenerplatos":
			
			ArrayList<Producto> listaProductos = new ArrayList<Producto>();
			DaoProducto daoProducto = new DaoProducto();
			DaoCategoria daoCategoria2 = new DaoCategoria();
			String categoriaID = request.getParameter("categoriaID");
			int categoriaIDParseado = Integer.parseInt(categoriaID);
			String nombreCategoria = daoCategoria2.obtenerNombreCategoriaPorIDCategoria(categoriaIDParseado);
			
			listaProductos = daoProducto.obtenerProductosCategoriaID(categoriaIDParseado);
			request.setAttribute("nombreCategoria", nombreCategoria);
			request.setAttribute("listaProductorPorCategoria", listaProductos);
			request.getRequestDispatcher("home.jsp").forward(request, response);
			break;
			
		case "rating":
			
			String idProducto = request.getParameter("idproducto");
			int idProductoParseado = Integer.parseInt(idProducto);
			String cantidadPuntos = request.getParameter("puntos");
			int cantidadPuntosParseado = Integer.parseInt(cantidadPuntos);
			
			DaoPunto daoPunto = new DaoPunto();
			daoPunto.aniadirPuntuaje(idProductoParseado, cantidadPuntosParseado);
			
			String msg = "Anotados " +cantidadPuntosParseado + " puntos a " +idProductoParseado;
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("home.jsp").forward(request, response);
			
			break;
			
		}
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
