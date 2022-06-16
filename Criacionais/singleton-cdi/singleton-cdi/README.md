# Relatório

Referente ao método updateConfig(Config newConfig), na classe ConfigResource os novos valores de configuração estão sendo setados ao objeto config no qual seu ciclo de vida é gerenciado pelo próprio CDI, já na classe RelatorioResource estamos trocando nosso objeto no qual seu ciclo de vida é gertenciado pelo CDI por um novo objeto enviado pelo cliente e obtendo-o por parametro, assim passamos a ter uma referencia para o novo objeto enviado pelo cliente e não para nosso objeto instanciado e controlado pelo CDI.

O resultado indesejado disso são os valores diferentes de configurações presentes na mesma aplicação.