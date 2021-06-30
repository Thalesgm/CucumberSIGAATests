#language: pt
  Funcionalidade: Buscar Componente Curricular
    Cenario: Buscar com Retorno
      Dado que o usuario acessa a pagina publica do SIGAA
      Quando usuario seleciona a opcao componentes curriculares no menu graduacao
      Entao o sistema deve exibir o form de busca por Componentes
      Quando o usuario busca pelo componete de GRADUACAO "IMD0028"
      Entao o sistema deve exibir o componente "Fundamentos Matemáticos da Computacão" na lista de resultados
