<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Financial Control</title>
<script src="https://cdn.tailwindcss.com"></script>
</head>
<body>
  <c:import url="/WEB-INF/jsp/menu.jsp"/>
    <div class="container">
        <div class="flex min-h-screen flex-col justify-center overflow-hidden bg-gray-900 py-6 sm:py-12">
          <div class="relative bg-gray-800 px-6 pt-10 pb-8 shadow-xl ring-1 ring-gray-900/5 sm:mx-auto sm:max-w-lg sm:rounded-lg sm:px-10">
 <c:if test="${not empty mensagem}">
                <div class="text-center py-4 lg:px-4">
                  <div class="p-2 bg-indigo-800 items-center text-indigo-100 leading-none lg:rounded-full flex lg:inline-flex" role="alert">
                    <span class="flex rounded-full bg-indigo-500 uppercase px-2 py-1 text-xs font-bold mr-3">New</span>
                    <span class="font-semibold mr-2 text-left flex-auto"> ${mensagem} </span>
                    <svg class="fill-current opacity-75 h-4 w-4" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20"><path d="M12.95 10.707l.707-.707L8 4.343 6.586 5.757 10.828 10l-4.242 4.243L8 15.657l4.95-4.95z"/></svg>
                  </div>
                </div>
              </c:if>
  
            <div class="mx-auto max-w-md">
            <div class="mb-5 flex items-center">
                <h1 class="text-3xl font-bold text-white antialiased">Provisoes</h1>
                <div class="text-right ml-8">
                  <a class="rounded-lg bg-green-400 py-2 px-5 font-bold text-white" href="/provisoes/new">New</a>
                </div>
              </div>
              

              <div class="mx-auto p-10">
              <c:if test="${empty lista}">
                       <div>
                        <p class="truncate text-sm font-medium text-gray-900 dark:text-white">Nenhum usuario cadastrado</p>
                      </div>
              </c:if>
              <c:if test="${not empty lista}"> 
                <div class="mb-5 flex items-center">
                  <ul class="max-w-md divide-y divide-gray-200 dark:divide-gray-700">
                      <div>
                        <p class="truncate text-sm font-medium text-gray-900 dark:text-white">Usuarios Cadastrados: ${lista.size()}</p>
                      </div>
                      
                      
                      
                      <c:forEach var="u" items="${lista}"> 
                      <li class="pb-3 sm:pb-4">
                      <div class="flex items-center space-x-4">
                        <div class="flex-shrink-0">
                          <img class="h-8 w-8 rounded-full" src="/docs/images/people/profile-picture-1.jpg" alt="${u.id}" />
                        </div>
                        <div class="min-w-0 flex-1">
                          <p class="truncate text-sm font-medium text-gray-900 dark:text-white">${u.name}</p>
                          <p class="truncate text-sm text-gray-500 dark:text-gray-400">${u.valor}</p>
                        </div>
                        <div class="inline-flex items-center text-base font-semibold text-gray-900 dark:text-white">${u.getData()}</div>
                        <div class="inline-flex items-center text-base font-semibold text-gray-900 dark:text-white">${u.saida}</div>
                        
                        <div class="inline-flex items-center text-base font-semibold text-gray-900 dark:text-white">
                          <a class="relative inline-flex items-center justify-center p-0.5 mb-2 mr-2 overflow-hidden text-sm font-medium text-gray                         -900 rounded-lg group bg-gradient-to-br from-pink-500 to-orange-400 group-hover:from-pink-500 group-hover:to-orange-400 hover:                          text-white dark:text-white focus:ring-4 focus:outline-none focus:ring-pink-200 dark:focus:ring-pink-800" href="/provisoes/${u.id}/excluir">
                            <span  class="relative px-5 py-2.5 transition-all ease-in duration-75 bg-white dark:bg-gray-900 rounded-md group-hover:bg-opa                         city-0">
                      Remove
                           </span>
                      </a>
                        </div>
                      </div>
                      </li>
                    </c:forEach>
                  </ul>
                </div>
                </c:if>

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
