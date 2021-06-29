#language: pt
  Funcionalidade: Buscar Componente Curricular
    Cenario: Buscar com Retorno
      Dado que o usuario acessa a pagina publica do SIGAA
      Quando usuario seleciona a opcao componentes curriculares no menu graduacao
      Entao o sistema deve exibir o form de busca por Componentes
      Quando o cliente busca pelo componete de "GRADUAÇÂO" "IMD0028"
      Entao o sistema deve exibir o componente "Fundamentos Matemáticos da Computacão" na lista de resultados
