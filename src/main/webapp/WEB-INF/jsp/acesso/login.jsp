<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<script src="https://cdn.tailwindcss.com"></script>
</head>
<body>
    <div class="container">
        <div class="relative flex min-h-screen flex-col justify-center overflow-hidden py-6 bg-gray-900 sm:py-12">
 
              <c:if test="${not empty mensagem}">

                <div class="bg-indigo-900 text-center py-4 lg:px-4">
                  <div class="p-2 bg-indigo-800 items-center text-indigo-100 leading-none lg:rounded-full flex lg:inline-flex" role="alert">
                    <span class="flex rounded-full bg-indigo-500 uppercase px-2 py-1 text-xs font-bold mr-3">New</span>
                    <span class="font-semibold mr-2 text-left flex-auto"> ${mensagem} </span>
                    <svg class="fill-current opacity-75 h-4 w-4" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20"><path d="M12.95 10.707l.707-.707L8 4.343 6.586 5.757 10.828 10l-4.242 4.243L8 15.657l4.95-4.95z"/></svg>
                  </div>
                </div>
              </c:if>	           
              <div class="relative px-6 pt-10 pb-8 bg-gray-800 shadow-xl ring-1 ring-gray-900/5 sm:mx-auto sm:max-w-lg sm:rounded-lg sm:px-10">


              <div class="mx-auto max-w-md">
                <h1 class="text-3xl font-bold antialiased text-white">Financial Control</h1>
                <div class="p-10 mx-auto">
                  <form action="/login" method="post">
                    <div class="flex items-center mb-10">
                        <label class="inline-block w-20 mr-6 text-center  
                        font-bold text-white">Email:</label>
                        <input type="text" name="email" value="joao@gomes.com.br"
                        class="flex-1 py-2 border-b-2 border-gray-400 focus:border-green-400 
                                        text-gray-600 placeholder-gray-400
                                        outline-none bg-gray-800" required
                        />
                    </div>
                    <div class="flex items-center mb-5">
                        <label class="inline-block w-20 mr-6 text-center
                                font-bold text-white">
                            Senha:
                        </label>
                        <input type="password" name="senha" value="joao@gomes.com.br" 
                                class="flex-1 py-2 border-b-2 border-gray-400 focus:border-green-400 
                                text-gray-600 placeholder-gray-400
                                outline-none bg-gray-800" required/>
                    </div>
                    <div class="text-right">
                      <button class="py-3 px-8 bg-green-400 text-white font-bold" type="submit">Submit</button> 
                    </div>
                  </form>
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
