#language: pt

Funcionalidade: Acessando uma página de compras na internet

  Cenário: Fazer login
    Dado que acesso uma página da internet
    Quando digito login e senha
    E clico no botão login
    Então a página de produtos é exibida

  Cenário: Adicionar produtos ao carrinho e finalizar compra
    Dado que estou na página de escolha de produtos e adiciono um produto ao carrinho
    Quando clico no carrinho e confiro se o produto adicionado e seu preço estão de acordo com a escolha
    E clico no botão checkout e preencho as minhas informações e depois clico em Continuar
    Então é exibida uma página para finalizar a compra e uma mensagem de agradecimento agradecendo a compra

