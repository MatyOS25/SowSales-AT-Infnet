<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmado</title>
<script src="https://cdn.tailwindcss.com"></script>
<script>
  function Redirect() 
    {  
        window.location="usuario/lista"; 
    } 
    document.write("You will be redirected to a new page in 5 seconds"); 
    setTimeout('Redirect()', 5000);   
</script>
</head>
<body>
    <div class="container">
        <div class="relative flex min-h-screen flex-col justify-center overflow-hidden py-6 bg-gray-900 sm:py-12">
            <div class="relative px-6 pt-10 pb-8 bg-gray-800 shadow-xl ring-1 ring-gray-900/5 sm:mx-auto sm:max-w-lg sm:rounded-lg sm:px-10">
              <div class="mx-auto max-w-md">
                <h1 class="text-3xl font-bold antialiased text-white">Financial Control</h1>
                <div class="p-10 mx-auto">
                    <div class="flex items-center mb-5">
                        <h3 class="text-1xl font-bold antialiased text-white text-center">Cadastro Confirmado!</h3>
                    </div>
                    <div class="text-right">
                      <a class="py-3 px-8 bg-green-400 text-white font-bold" href="/">Voltar</a>
                    </div>
                  <div class="pt-8 text-base font-semibold leading-7">
                    <p class="text-gray-900">Projeto Desenvolvido por Matias Reinke</p>
                    <p>
                      <a href="https://github.com/MatyOS25/Controle-Contabil-AT-Infnet.git" class="text-sky-400 hover:text-sky-600">Acessar GitHub;</a>
                    </p>
                  </div>
                </div>
              </div>
            </div>
          </div>
          
    </div>
</body>
</html>