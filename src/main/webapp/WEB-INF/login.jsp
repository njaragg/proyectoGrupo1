<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style><%@include file="/WEB-INF/assets/css/login.css"%></style>
    <title>Formulario Login</title>
    <title>Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
    <!------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
    <section>
        <!----------------------------------- INICIO BARRA DE NAVEGACION ---------------------------------->
        <nav class="navbar navbar-light navbar-expand-lg bgn-nav" style=" font-size: 25px;     background: linear-gradient(#eff6f6,#cde1e0)  ">
            <div class="container-fluid">
            <a class="navbar-brand" href="#"><img id="logo" src="/img/redondo.png" alt=""></a>
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
    <!------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
<div class="container">
         <h3><b>INICIO DE SESIÓN</b></h3>
 <form action="/login/admin" method="post" id="login">
 <label for="correo" class="form-label">Correo</label>
 <input type="email" name="correo" id="correo" placeholder="Ingrese su mail" required="required" class="form-control">
 <br>
 <label for="password" class="form-label">Contraseña</label>
 <input type="password" name="password" id="password" placeholder="Ingrese su contraseña" required="required" class="form-control">
        <br>
        <input class="botons" type= "submit" value="Ingresar">
                       <h6>¿No tienes cuenta?</h6>
        <p><a href="#">Regístrate</a></p>
</form>
</div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>