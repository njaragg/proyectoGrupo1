<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <style><%@include file="/WEB-INF/assets/css/register.css"%></style>
    <title>Formulario Registro</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>

<body>
    <!-- action=ruta donde se envia el parametro-->
    <!-- metod forma como se envia get y post -->
    <!-- get muestra los parametros -->
    <!-- post envia los parametros ocultos -->
    <section>
        <!----------------------------------- INICIO BARRA DE NAVEGACION ---------------------------------->
        <nav class="navbar navbar-light navbar-expand-lg bgn-nav" style=" font-size: 25px;     background: linear-gradient(#eff6f6,#cde1e0)  ">
            <div class="container-fluid">
            <a class="navbar-brand" href="#"><img id="logo" src="/src/img/redondo.png" alt=""></a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            
                </ul>
                <ul class="button-container" id botones>
                    <a class="btn btn-primary" href="/index.html">Volver al inicio</a>  
            
                </ul>
            </div>
            </div>
            </nav>
            </section>
    
    
    
    <section class="form-register">
        <form action="ruta" method="post">
            <input class="controls" type="text" name="nombres" id="nombres" placeholder="Ingrese su Nombre">
            <input class="controls" type="text" name="apellidos" id="apellidos" placeholder="Ingrese su Apellido">
            <input class="controls" type="text" name="rut" id="rut" placeholder="Ingrese su rut">
            <input class="controls" type="email" name="correo" id="correo" placeholder="Ingrese su Correo">
            <input class="controls" type="password" name="correo" id="correo" placeholder="Ingrese su Contraseña">
            <select class="controls" name="sexo2" id="sexo2">
                <option value="0">Seleccione su sexo</option>
                <option value="1">Femenino</option>
                <option value="2">Masculino</option>
                <option value="3">Otro</option>
                <option value="4">Prefiero no decir</option>
            </select>
            <input class="botons" type="submit" value="Registrar">
    <p><a href="login.html">¿Ya tengo cuenta?</a></p>
    
        </form>
    </section>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>

</html>