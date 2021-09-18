## Trabalho Prático - ARI
### Aplicação monolítica - Análise crítica


#### Troubleshooting
Só foi possível rodar o projeto após adicionar uma linha no _application.properties_:

```
spring.jpa.defer-datasource-initialization=true
```

E adicionar a annotation @EnableSwagger2 dentro da classe _App_:

![image](https://user-images.githubusercontent.com/39572088/133894560-d069bf90-57a6-4483-add8-14d914009053.png)

Antes disso, não era possível subir a aplicação e nem acessar a url do _swagger.html_.


#### Análise crítica
#
> A aplicação possui diversos controladores, cada um para um domínio;

![image](https://user-images.githubusercontent.com/39572088/133894732-ab1e7f92-c4f5-4a0b-a2b6-fa69e273644b.png)

> Vários repositórios;

![image](https://user-images.githubusercontent.com/39572088/133894740-c98f7533-5f9e-4ffe-9db8-1d83c749b829.png)

> Por ser um Monolito, caso você queira dar manutenção em apenas um domínio, é possível, mas terá que fazer deploy de todo o pacote;

> Não permite configuração individual;

> Se a aplicação crescer, vai ficar mais difícil de fazer manutenção

#### Como melhorar a aplicação?
#
Utilizando o _DDD_ seria a melhor abordagem, junto com _Microservices_ dentro de uma arquitetura _SOA_:

##### Microsservice 1 - Clientes


##### Microsservice 2 - Fatura


##### Microsservice 3 - Instalacao

> A manutenção seria facilitada, cada domínio com seu código;
> 
> Microsservices podem escalar individualmente, de acordo com a regra de negócio;
> 
> Pode ser realizado o deploy de forma independente;
>
> Escalar mais microsservices pode ser menos custoso que escalar monolitos;

