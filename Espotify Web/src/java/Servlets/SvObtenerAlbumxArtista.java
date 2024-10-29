
package Servlets;

import Datatypes.DTAlbum;
import Datatypes.DTListaRep;
import Logica.Fabrica;
import Logica.IControlador;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
@WebServlet(name = "SvObtenerAlbumxArtista", urlPatterns = {"/SvObtenerAlbumxArtista"})
public class SvObtenerAlbumxArtista extends HttpServlet {
    
    Fabrica fabrica = Fabrica.getInstance();
    IControlador control = fabrica.getIControlador();


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String artista = request.getParameter("artista");
                System.out.println("Valor de género recibido: " + artista);
    
        if (artista != null && !artista.isEmpty()) {
            try {
                // Llamar al método del controlador para obtener la lista de DTAlbum
                List<DTAlbum> nombresAlbumes = control.findAlbumesPorArtista(artista);
                //System.out.println("Número de álbumes encontrados: " + nombresAlbumes.size());
                List<byte[]> listaImgAlbumes = new ArrayList<>();
                for (DTAlbum album : nombresAlbumes) {
                    Path ruta = Paths.get(album.getImagen()); // Obtiene la ruta de la imagen
                    byte[] imgAlbumBytes;
                    imgAlbumBytes = Files.readAllBytes(ruta);
                    listaImgAlbumes.add(imgAlbumBytes); // Agrega cada imagen a la lista
                }
                // Guardar la lista de álbumes en el request para enviarla a la JSP
                request.setAttribute("listaAlbumes", nombresAlbumes);
                request.setAttribute("listaImgAlbumes", listaImgAlbumes);

                // Redirigir a la página JSP para mostrar los álbumes
                RequestDispatcher dispatcher = request.getRequestDispatcher("mostrarAlbumes.jsp");
                dispatcher.forward(request, response);
                
            } catch (Exception e) {
                // Manejo de errores al obtener los álbumes
                response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error al obtener los álbumes: " + e.getMessage());
            }
        } else {
            // Si no se proporcionó el parámetro de género, enviar un error
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "El parámetro 'genero' es requerido.");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}