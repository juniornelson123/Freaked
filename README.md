# Freaked
App de Venda,Troca e Doações

*Legendas 
	- Atributos -> ()
	- Relacionamentos -> {}

*Projeto:

	Troca Venda e Doação de Objetos - Freaked

*Objetivo:

	Efetuar venda, troca e doações de objetos dos mais variados tipos, apartir do anuncio livre de forma indireta, ou a pesquisa por instituições que necessitam de auxilio.  	

*Entidades:

	1 - User (id,email,password){ user_id:Client,Instituition ,type_id: Type}

			1.1 - Client(id,name,apelido,cpf,gender,email,phone,cep,address,number,complement,state,city)

			1.2 - Institution(id,name_institution,cnpj,email,phone,cep,address,number,complement,state,city){person: Person_responsable}

	2 - Type (id,name)

	3 - Person_Responsable (id,name,office)

	4 - Announcement (id, photo, title, description, cep, estado, city, type){user_id: User
category_id: Category}

	5 - Category (id,name)

	6 - Favority (id,user_id,announcement_id)

*Atores

 -Client: Cadastra anuncios e visualiza anuncios que constam no sistema, efetua doações a instituiçãoes cadastradas;

 -Instituition: Efetua cadastro de instituição no sistema e visualiza anuncios com tipo doação;

 
