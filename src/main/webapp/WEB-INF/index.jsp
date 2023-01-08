<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Medic Cloud</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style><%@include file="/WEB-INF/assets/css/index.css"%></style>
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="/src/js/main.js"></script>

</head>

<body>
    <section>
        <!----------------------------------- INICIO BARRA DE NAVEGACION ---------------------------------->
        <nav class="navbar navbar-light navbar-expand-lg bgn-nav"
            style=" font-size: 25px;     background: linear-gradient(#eff6f6,#cde1e0)  ">
            <div class="container-fluid">
                <a class="navbar-brand" href="#"><img id="logo" src="/img/redondo.png" alt=""></a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link " aria-current="page" href="#video">¿Por qué Medic Cloud?</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link " aria-current="page" href="#carousel">Características</a>
                        </li>

                     <li class="nav-item">
                            <a class="nav-link " aria-current="page" href="/contacto">Contacto</a>
                        </li>
                     
                     <li class="nav-item">
                            <a class="nav-link " aria-current="page" href="/conocenos">Conoce a nuestro equipo</a>
                        </li>   
                        
                    </ul>
                    <ul class="button-container" id botones>
                        <a class="login" href="/login/usuario">Iniciar sesión</a>
                        <a class="btn btn-primary" href="/register">Registrarse</a>

                    </ul>
                </div>
            </div>
        </nav>
    </section>
    <!----------------------------------- FIN BARRA DE NAVEGACION ---------------------------------->
    
    
    
    <div class="container-fluid" id="titulo">

        <h1 style="color: #ffff;" class="title"></h1>
        
        
        <div class="container" id="parrafos">
            <ul>
                <li>Software 100% online y gratuito.</li>
                <li>Lleva el registro de tus datos y fichas clínicas de forma fácil, segura y desde donde quieras.</li>
                


            </ul>
        </div>




    </div>


    <div class="container__slider" id="carousel">

        <div class="container">
            <input type="radio" name="slider" id="item-1" checked>
            <input type="radio" name="slider" id="item-2">
            <input type="radio" name="slider" id="item-3">

            <div class="cards">
                <label class="card" for="item-1" id="selector-1">
                    <img src="/img/Se dueño de tu información médica (2).png">

                </label>
                <label class="card" for="item-2" id="selector-2">
                    <img src="/img/Organiza tu información en notas médicas.png">
                </label>
                <label class="card" for="item-3" id="selector-3">
                    <img src="/img/ACCEDE A TUS RESULTADOS Y TRATAMIENTOS ANTIGUOS.png">
                </label>

            </div>
        </div>

    </div>






    <!----------------------------------------------VIDEO------------------------------------------->
    <section>

        <div class="container" id="video">
            <div class="ratio ratio-16x9">
                <iframe width="560" height="315" src="https://www.youtube.com/embed/-FfJz6UZWyg"
                    title="YouTube video player" frameborder="0"
                    allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
                    allowfullscreen>

                </iframe>


            </div>



        </div>
    </section>
    <!------------------------------------------FIN VIDEO------------------------------------------->







    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
        integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
        integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
        crossorigin="anonymous"></script>
</body>

</html>