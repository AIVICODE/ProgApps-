<%@page import="Datatypes.DTCliente"%>
<%@page import="Datatypes.DTUsuario"%>
<%@page import="Datatypes.DTTema"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" href="css/temas.css?v=1.2">
<% 
    String album = (String) request.getAttribute("album");
    String artista = (String) request.getAttribute("artista");
    List<DTTema> temas = (List<DTTema>) request.getAttribute("temas");
%>

<h2>Temas de <%= album %></h2>
<ul>
    <% for (DTTema tema : temas) { %>
        <li onclick='seleccionarTema("<%= tema.getNombre() %>", "<%= tema.getDirectorio() %>", <%= tema.getOrden() %>)'>
            <span class="orden"><%= tema.getOrden() %></span>
            <%
    session = request.getSession(false);
    DTUsuario dtUsuario = (DTUsuario) session.getAttribute("usuario");
    if (dtUsuario != null) {
    %>
            <button class="add-favorite-tema" onclick="verificarYAgregarFavorito('<%= tema.getNombre() %>', '<%= album %>','<%= artista %>')">+</button>
        <%
        
    }
    
%>
            <span ><%= tema.getNombre()%></span>
            <span class="duracion"><%= tema.getMinutos()+":"+tema.getSegundos()%></span>
            
            
        </li>
    <% } %>
</ul>

<footer>
    <div class="container player-container">
        <div class="track-info">
            <div class="track-details">
                <p id="currentSongName"></p>
                <p class="artist" id="currentArtistName"><%= artista %></p>
            </div>
        </div>
        <div class="player-controls">
            <button id="prevBtn" onclick="prevTema()">
                <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
                    <polygon points="19 20 9 12 19 4 19 20"></polygon>
                    <line x1="5" y1="19" x2="5" y2="5"></line>
                </svg>
            </button>
            <button id="playPauseBtn">
                <svg xmlns="http://www.w3.org/2000/svg" width="32" height="32" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
                    <circle cx="12" cy="12" r="10"></circle>
                    <polygon points="10 8 16 12 10 16 10 8"></polygon>
                </svg>
            </button>
            <button id="nextBtn" onclick="nextTema()">
                <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
                    <polygon points="5 4 15 12 5 20 5 4"></polygon>
                    <line x1="19" y1="5" x2="19" y2="19"></line>
                </svg>
            </button>
        </div>
        <div class="volume-control">
            <input type="range" min="0" max="100" value="50" class="volume-slider" id="volumeSlider">
        </div>
        <audio id="audioPlayer">
            <source id="audioSource" src="" type="audio/mpeg">
            Your browser does not support the audio element.
        </audio>
            <%
            session = request.getSession(false);
            DTCliente dtUsuario = (DTCliente) session.getAttribute("usuario");
            if (dtUsuario != null) {
        %>
            <a id="downloadLink" href="" download>Descargar</a>
<%
            }
        %>
            
    </div>
</footer>

<script>
let temas = []; // Se llenará con los datos del servidor
<% for (DTTema tema : temas) { %>
  temas.push({
    nombre: "<%= tema.getNombre() %>",
    directorio: "<%= tema.getDirectorio() %>",
    orden: <%= tema.getOrden() %>
  });
<% } %>

let currentIndex = -1;

function seleccionarTema(nombreTema, directorio, orden) {
  document.getElementById("currentSongName").textContent = nombreTema;


  if (directorio.startsWith("bit.ly")) {
    var urlRedireccion = "https://" + directorio; // Asegúrate de agregar el esquema HTTPS
    window.open(urlRedireccion, '_blank'); // Abre la URL en una nueva pestaña
    return; // Detenemos la ejecución aquí
  }

  var audioSource = document.getElementById("audioSource");
  audioSource.src = directorio;
  var audioPlayer = document.getElementById("audioPlayer");
  audioPlayer.load();
  audioPlayer.play();
  
  //LA OPCION DE DESCARGA SOLO DISONIBLE PARA USUARIOS REGISTRADOS (PRECISO SESION PARA PODER CONFIGURAR)
  let downloadLink = document.getElementById("downloadLink");
    downloadLink.href = directorio; // URL del archivo
    downloadLink.download = nombreTema; // Nombre del archivo al descargar
  

  // Encuentra el índice real en el array 'temas' basado en el 'orden'
  currentIndex = temas.findIndex(tema => tema.orden === orden); 
}


function prevTema() {
  if (temas.length === 0) return;

  currentIndex = (currentIndex - 1 + temas.length) % temas.length; // Ajusta el índice
  playTemaActual();
}

function nextTema() {
  if (temas.length === 0) return;

  currentIndex = (currentIndex + 1) % temas.length; // Ajusta el índice
  playTemaActual();
  
}

function playTemaActual() {
  if (currentIndex >= 0 && currentIndex < temas.length) {
    let temaActual = temas[currentIndex];
    seleccionarTema(temaActual.nombre, temaActual.directorio, temaActual.orden);
  }
}



// Función de reproducción/pausa
playPauseBtn.addEventListener("click", function() {
    if (audioPlayer.paused) {
        audioPlayer.play();
    } else {
        audioPlayer.pause();
    }
    updatePlayPauseButton();
});

// Función para actualizar el ícono de play/pausa
function updatePlayPauseButton() {
    const playIcon = playPauseBtn.querySelector("svg");
    if (audioPlayer.paused) {
        playIcon.innerHTML = `
            <circle cx="12" cy="12" r="10"></circle>
            <polygon points="10 8 16 12 10 16 10 8"></polygon>`;
    } else {
        playIcon.innerHTML = `
            <circle cx="12" cy="12" r="10"></circle>
            <line x1="10" y1="15" x2="10" y2="9"></line>
            <line x1="14" y1="15" x2="14" y2="9"></line>`;
    }
}

// Función para cambiar el volumen
volumeSlider.addEventListener("input", function() {
    audioPlayer.volume = this.value / 100;
    
});


// Lógica de descarga y verificación de suscripción
    document.getElementById('downloadLink').addEventListener('click', function(event) {
        event.preventDefault(); // Prevenir la acción predeterminada de descarga

        // Realiza la verificación de suscripción
        fetch('SvVerificarSubscripcion', { method: 'GET' })
            .then(response => response.json())
            .then(data => {
                if (data.hasSubscription) {
                    // Si tiene suscripción, permitir la descarga
                    const downloadLink = event.target;

                    // Aquí estamos haciendo que el enlace descargue el archivo
                    const href = downloadLink.href; 
                    
                    // Crear un nuevo elemento de anclaje para forzar la descarga
                    const a = document.createElement('a');
                    a.href = href;
                    a.download = downloadLink.download; // Asegúrate de que el nombre del archivo se mantenga
                    document.body.appendChild(a); // Agregar al DOM
                    a.click(); // Simular clic para iniciar descarga
                    document.body.removeChild(a); // Eliminar el elemento del DOM
                } else {
                    alert('No tienes una suscripción activa para descargar este archivo.');
                }
            })
            .catch(error => {
                console.error('Error al verificar la suscripción:', error);
            });
    });
    
    
    
    
    
    
    
    
    
 function AgregarTemaFavorito(temaName, albumName, artistName) {
    const encodedTemaName = encodeURIComponent(temaName);
    const encodedAlbumName = encodeURIComponent(albumName);
    const encodedArtistName = encodeURIComponent(artistName);

    fetch('SvAgregarTemaFavorito', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded'
        },
        body: "tema=" + encodedTemaName + "&album=" + encodedAlbumName + "&artista=" + encodedArtistName
    })
    .then(response => {
        // Capturamos el error si el servidor respondió con un estado HTTP no exitoso
        if (!response.ok) {
            return response.json().then(errorData => { throw new Error(errorData.message); });
        }
        return response.json(); // Parseamos la respuesta JSON
    })
    .then(data => {
        if (data.success) {
            alert(data.message); // Mostrar mensaje de éxito
        }
    })
    .catch(error => {
        alert("Error: " + error.message); // Mostrar el mensaje de error
    });
}
    
    function verificarYAgregarFavorito(temaName, albumName, artistName) {
    // Verificación de suscripción antes de agregar a favoritos
    fetch('SvVerificarSubscripcion', { method: 'GET' })
        .then(response => response.json())
        .then(data => {
            if (data.hasSubscription) {
                // Si tiene suscripción, agregar el álbum a favoritos
                AgregarTemaFavorito(temaName, albumName, artistName);
            } else {
                alert('No tienes una suscripción activa para agregar este tema a favoritos.');
            }
        })
        .catch(error => {
            console.error('Error al verificar la suscripción:', error);
        });
}
    
    
    
    
</script>

