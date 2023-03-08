<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users</title>
<script src="https://cdn.tailwindcss.com"></script>
</head>
<body>
    <div class="container">
        <div class="relative flex min-h-screen flex-col justify-center overflow-hidden py-6 bg-gray-900 sm:py-12">
            <div class="relative px-6 pt-10 pb-8 bg-gray-800 shadow-xl ring-1 ring-gray-900/5 sm:mx-auto sm:max-w-lg sm:rounded-lg sm:px-10">
              <div class="mx-auto max-w-md">
                <h1 class="text-3xl font-bold antialiased text-white">Financial Control</h1>
                <div class="p-10 mx-auto">
                  <form action="/${controller}/new" method="post">
                    <div class="flex items-center mb-10">
                      <label class="inline-block w-20 mr-6 text-center  
                      font-bold text-white">Name:</label>
                      <input type="text" name="name" value="Dividendos Futuros"
                      class="flex-1 py-2 border-b-2 border-gray-400 focus:border-green-400 
                                      text-gray-600 placeholder-gray-400
                                      outline-none bg-gray-800" required
                      />
                  </div>
                    <div class="flex items-center mb-5">
                        <label class="inline-block w-20 mr-6 text-center
                                font-bold text-white">
                            Valor:
                        </label>
                        <input type="number" step="0.01" name="valor" value="0.00" 
                                class="flex-1 py-2 border-b-2 border-gray-400 focus:border-green-400 
                                text-gray-600 placeholder-gray-400
                                outline-none bg-gray-800" required/>
                    </div>
                    <div class="flex items-center mb-5">
                        <label class="inline-block w-20 mr-6 text-center  
                        font-bold text-white">Data Prevista:</label>
                        <input type="date" name="dataPrev" 
                        class="flex-1 py-2 border-b-2 border-gray-400 focus:border-green-400 
                                        text-gray-600 placeholder-gray-400
                                        outline-none bg-gray-800 " required
                        />
                    </div>
                    <div class="flex items-center mb-5">
                      <label class="inline-block w-20 mr-6 text-center
                                  font-bold text-white">
                          Info Adicional:
                      </label>
                      <input type="text" name="infoAdicional" value="" 
                          class="flex-1 py-2 border-b-2 border-gray-400 focus:border-green-400 
                          text-gray-600 placeholder-gray-400
                          outline-none bg-gray-800"/>
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