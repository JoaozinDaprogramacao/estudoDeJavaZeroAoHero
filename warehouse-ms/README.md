# Warehouse-ms

## Endpoints
- BaseURL: /warehouse
- POST: create()
- GET: getAll()
- GET /{id}: getById()*
- PUT /{id}: update()*

##Mode1
```json
{
  "id": 1,
  "product-id": 1,
  "quantity": 10,
}
```

##Busigness Rules
- O estoque é responsável por avisar se o produto está ou não disponível, ou seja caso o valor da quantidade
  seja igual a zero, deve informar o serviço;
- Não é permitido mais de uma linha do mesmo produto na base de dados;