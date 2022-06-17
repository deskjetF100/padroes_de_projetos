# Exercícios proposto para esta implementação.

Implemente uma classe `Produto` com os atributos abaixo. Utilize um construtor contendo apenas os parâmetros obrigatórios, marcados com asterisco:

- id: long
- *titulo: String
- *descricao: String
- marca: String
- modelo: String
- estoque: int (valor padrão zero)
- *preco: double (deve ser maior que zero)
- *dataCadastro: LocalDate (não pode ser menor que a data atual)
- *dataUltimaAtualizacao: LocalDate (não pode ser menor que a data atual)
- urlFoto: String
- *categoria: String
- *vendedor: Vendedor
- peso: double
- altura: double
- largura: double
- profundidade: double

O modelo só pode ser atribuído se a marca também for.
Há como resolver isso da forma como a implementação foi sugerida acima?

Resolva o problema aplicando o padrão Builder, realizando as alterações necessárias na classe `Produto`.